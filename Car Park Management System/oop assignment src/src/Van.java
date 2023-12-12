import java.util.Scanner;

public class Van extends Vehicle{   // van sub class extends with vehicle super class

    // create variables with private accsess modifiers that can give accsess to only own class
    private static String seatsOrGoods;

    // crate a constructor
    public Van(String type,String IDPlate, String brand, String date, String time,String seatsOrGoods) {
        super(type,IDPlate, brand, date, time);
        this.IDPlate=IDPlate;
        this.brand=brand;
        this.date=date;
        this.time=time;
        this.seatsOrGoods=seatsOrGoods;
        this.type=type;

    }

    // get method for get values
    public String getType(){
        return type;
    }

    // set method for set values
    public void setType(String type){
        this.type=type;
    }

    // set method for set values
    public String isSeatsOrGoods(){
        Scanner scan=new Scanner(System.in);
        switch (seatsOrGoods){
            case "seats":
                System.out.println("Number Of Seats : ");
                String EnterSeats = scan.nextLine();
                break;

            case "goods":
                System.out.println("Goods Capacity(kg) : ");
                String EnterCapacity = scan.nextLine();
            break;
        }

        return seatsOrGoods;
    }

    // get method for get values
    @Override
    public String getIDPlate(){
        return IDPlate;
    }

    // set method for set values
    @Override
    public void setIDPlate(String IDPlate){
        this.IDPlate=IDPlate;
    }

    // get method for get values
    @Override
    public String getBrand(){
        return brand;
    }

    // set method for set values
    @Override
    public void setBrand(String brand){
        this.brand=brand;
    }

    // print van details
    public void vanDetails(){
        System.out.println("\ndetails of your Vehicle,");
        System.out.println("ID Plate : "+IDPlate+"\nEntry Time : "+time+"\nVehicle type is Van\n");
    }
}
