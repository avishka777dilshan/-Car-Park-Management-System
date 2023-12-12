import java.util.Scanner;

public class SLIITCarParkManager implements CarParkManager {    // crate SLIITCarParkManager class, implement from CarParkManager class

    private static int vehicleCount=0;  // get a new variable to count vehicles
    private static Vehicle []slot = new Vehicle[totalVehicleSlots]; // crate an array to store the Vehicles

    private static boolean trueOrFalse; // crate a boolean to get the return value from vehicle enter method

    // create the vehicle enter class for calculate entering vehicle details
    @Override
    public boolean vehicleEntered() {
        if(vehicleCount<totalVehicleSlots){     // if for find space available or not
            vehicleCount++; // incremant vehicle count if the space available
                System.out.println("\n"+getNumEmptySlots()+" Slots Available");//print the available slots
            trueOrFalse=true;//condition status
        }
        else {  // no space available
            System.out.println("Sorry, There are no parking slots available\n");//a messege
            SLIITCarParkManager cm=new SLIITCarParkManager();// create a object
            cm.EnterOrExit();// call the method

            trueOrFalse=false;//condition ststus
        }

        return trueOrFalse;// return status
    }

    // create a class for calculate regarding lefting vehicles
    @Override
    public int vehicleLeft() {
        Scanner scan=new Scanner(System.in);//create a scarnner object
        System.out.println("Your ID Plateeee :" );//asking a question
        String IDPlate = scan.nextLine();//get the answer and store the data

    for(int i=0;i<=totalVehicleSlots;i++){ // looking for the leaving vehicle array slots
        if(slot[i]==null) { //fix the error if find a empty array
           // System.out.println("slot "+i+" is empty");

        }else {
            String searchIDPlate = slot[i].getIDPlate();// leaving vehicle`s number plate

            if (IDPlate.equals(searchIDPlate)) {// compare number plates
                vehicleCount--; // decremant vehicles
                System.out.println("\n"+getNumOccupiedSlots() + " free vehicle Slots available\n");
                slot[i] = null; // make thew slot empty
                vehicleList(); // go to the vehicle details
                break;  // break the loop
            }

        }

    }

        return 0 ;
    }

    //calculate empty slots
    @Override
    public int getNumEmptySlots() {
        return totalVehicleSlots-vehicleCount +1;
    }

    //calculate occupied slots
    @Override
    public int getNumOccupiedSlots() {
        return totalVehicleSlots-vehicleCount;
    }

    // main method
    public static void main(String[] args) {

        // create a infinite loop
        while (true) {

            Scanner scan = new Scanner(System.in);  //create scanner object
            SLIITCarParkManager cm = new SLIITCarParkManager();//create object

            // switch statement for find the vehicle enter or exit
            switch (cm.EnterOrExit()){

                case "enter":   // if vehicle enter do the followings
                    cm.vehicleEntered(); // go to this class
                    cm.VehicleDetails(); // go to this class
                    break;  // break the switch statement

                case "exit": // if vehicle exit do the followings
                    cm.vehicleLeft();// go to this class
                    break;// break the switch statement
            }
        }
    }

    // create a method
    public String EnterOrExit(){
        Scanner scan=new Scanner(System.in);    //create object
        System.out.println("Enter or Exit : "); //ask a question
        String EnterExit = scan.nextLine(); // store the answer

        return EnterExit;   //return the answer
    }

    // vehicle details class
    public void VehicleDetails(){
        Scanner scan=new Scanner(System.in);    //create object
        System.out.println("Vehicle Type (car,van,three wheel): "); //ask a question
        String vehicle_type = scan.nextLine();  // create a object
        // if condition for get the correct input
        if(vehicle_type.equals("car")||vehicle_type.equals("van")||vehicle_type.equals("three wheel")) {
            switch (vehicle_type) { //switch statement
                case "car":

                    /*
                    System.out.println("xxxxxxx"); ----------> asking a question
                    String carIDPlate = scan.nextLine(); ----> store it
                    */

                    System.out.println("ID Plate : ");
                    String carIDPlate = scan.nextLine();

                    System.out.println("Brand : ");
                    String carbrand = scan.nextLine();

                    System.out.println("Date : ");
                    String cardate = scan.nextLine();

                    System.out.println("Time : ");
                    String cartime = scan.nextLine();

                    System.out.println("Color : ");
                    String color = scan.nextLine();

                    System.out.println("Number of doors : ");
                    int NumberOfDoors = scan.nextInt();

                    // create a object for car constructor
                    Car c = new Car(vehicle_type,carIDPlate, carbrand, cardate, cartime, NumberOfDoors, color);
                    c.carDetails(); // call to the car details

                    // for loop for store the details in the array
                    for (int i = 0; i <= 20; i++) {
                        if (slot[i] == null) {  //find a empty slot
                            slot[i] = c;    // assign values
                            break;  // break the loop
                        }

                    }
                    break;

                case "van":
                    System.out.println("ID Plate : ");
                    String vanIDPlate = scan.nextLine();

                    System.out.println("Brand : ");
                    String vanbrand = scan.nextLine();

                    System.out.println("Date : ");
                    String vandate = scan.nextLine();

                    System.out.println("Time : ");
                    String vantime = scan.nextLine();

                    System.out.println("Seats or Goods : ");
                    String seatsOrGoods = scan.nextLine();
                    //create a object
                    Van v = new Van(vehicle_type,vanIDPlate, vanbrand, vandate, vantime, seatsOrGoods);
                    v.isSeatsOrGoods(); // fint the van is goods or seats
                    v.vanDetails(); // call to print details

                    // for loop for store the details in the array
                    for (int i = 0; i <= 20; i++) {
                        if (slot[i] == null) {  // find a empty slot
                            slot[i] = v;    // assign values
                            break;//break loop
                        }

                    }
                    break;// break switch

                case "three wheel":
                    System.out.println("ID Plate : ");
                    String twlIDPlate = scan.nextLine();

                    System.out.println("Brand : ");
                    String twlbrand = scan.nextLine();

                    System.out.println("Date : ");
                    String twldate = scan.nextLine();

                    System.out.println("Time : ");
                    String twltime = scan.nextLine();

                    System.out.println("Taxi or Not for hire :");
                    String taxiOrNotForHire = scan.nextLine();

                    // create a object
                    ThreeWheeler t = new ThreeWheeler(vehicle_type,twlIDPlate, twlbrand, twldate, twltime, taxiOrNotForHire);
                    t.threeWheelerDetails();

                    // for loop for store the details in the array
                    for (int i = 0; i <= 20; i++) {
                        if (slot[i] == null) {  // find a empty slot
                            slot[i] = t;    //aassign values
                            break;  // break for loop
                        }

                    }
                    break;  // break switch statement
            }
        }else { // if the enterd vehicle type is wrong
            System.out.println("\nPlease enter correct key word again\n");// print a messege
            vehicleCount--;//decrement vehicle count for avoid a error
            SLIITCarParkManager cm=new SLIITCarParkManager(); // crewate object
            cm.EnterOrExit();   // call to this method

        }
    }

    // this class for print vehicle list
    public void vehicleList(){
        System.out.println("currently parked vehicle list,");//print a message
        for(int i=0;i<totalVehicleSlots;i++){   // for lopo for find vehicle slots
            if(slot[i]==null){  // avoid the eroor come with null classes
            //System.out.println("Vehicle slot "+(i+1)+" is empty");
            }
            else {
                // print the detail list
                System.out.println("ID Plate:"+slot[i].getIDPlate()+", Entry Time:"+slot[i].time+", Vehicle type is:"+slot[i].getType());
                }
        }
        System.out.println();// just break a line
    }
}

