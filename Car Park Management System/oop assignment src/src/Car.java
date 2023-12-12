public class Car extends Vehicle{   //car class inherit from Vehicle class

    // create variables with private accsess modifiers that can give accsess to only own class
    private int NumberOfDoors;
    private String color;

    // create a constructor
    protected Car(String type,String IDPlate, String brand, String date, String time,int NumberOfDoors,String color) {
        super(type,IDPlate, brand, date, time);
        this.IDPlate=IDPlate;
        this.brand=brand;
        this.date=date;
        this.time=time;
        this.NumberOfDoors=NumberOfDoors;
        this.color=color;
        this.type=type;


    }

    // get method for get values
    public String getType(){
        return type;
    }

    // get method for get values
    public void setType(String type){
        this.type=type;
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

    // get method for get values
    public String getColor(){
        return color;
    }

    // set method for set values
    public void setColor(String color){
        this.color=color;
    }

    // get method for get values
    public int getNumberOfDoors(){
        return NumberOfDoors;
    }

    // set method for set values
    public void setNumberOfDoors(int NumberOfDoors){
        this.NumberOfDoors=NumberOfDoors;
    }

    // this nethod for print car deails
    public void carDetails(){
        System.out.println("\ndetails of your Vehicle,");
        System.out.println("ID Plate : "+IDPlate+"\nEntry Time : "+time+"\nVehicle type is Car\n");
    }

}



