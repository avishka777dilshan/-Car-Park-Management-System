abstract class Vehicle { //create a abstract class

    // create variables with protected accsess modifiers that can give accsess to sub classes
    protected String IDPlate;
    protected String brand;
    protected String date;
    protected String time;
    protected String type;

    // create constructor
    public Vehicle(String type,String IDPlate,String brand,String date,String time){
        this.IDPlate=IDPlate;
        this.brand=brand;
        this.date=date;
        this.time=time;
        this.type=type;
    }

    // gettype method for get thge type of the vehicle
    public String getType(){
        System.out.println(type);
        return type;
    }

    // settype of the vehicle for set the type of the vehicle (abstract method)
    public abstract void setType(String type);

    public String getIDPlate(){
        System.out.println(IDPlate);
        return IDPlate;
    }
    // setIDplate of the vehicle for set the IDPlate of the vehicle (abstract method)
    public abstract void setIDPlate(String IDPlate);

    // getbrand of the vehicle for get the brand of the vehicle (abstract method)
    public abstract String getBrand();

    // setbrand of the vehicle for set the brand of the vehicle (abstract method)
    public abstract void setBrand(String brand);

}
