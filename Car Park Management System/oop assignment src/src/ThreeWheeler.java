import java.util.Scanner;

public class ThreeWheeler extends Vehicle{  // create 2wheel class extends from Vehicle class

    // create variables with private accsess modifiers that can give accsess to only own class
    private String TaxiOrNot;

    // craete a constructor
    public ThreeWheeler(String type,String IDPlate, String brand, String date, String time,String TaxiOrNot) {
        super(type,IDPlate, brand, date, time);
        this.IDPlate=IDPlate;
        this.brand=brand;
        this.TaxiOrNot=TaxiOrNot;
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
    public String TaxiOrNot(){

        return TaxiOrNot;
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

    // print details
    public void threeWheelerDetails(){
        System.out.println("\ndetails of your Vehicle,");
        System.out.println("ID Plate : "+IDPlate+"\nEntry Time : "+time+"\nVehicle type is Three Wheeler\n");
    }
}

