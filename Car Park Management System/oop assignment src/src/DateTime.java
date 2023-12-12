public class DateTime { // create DateTime class

    // create variables with private accsess modifiers that can give accsess to only own class
     private String date;
     private String time;

     // create constructor
    public DateTime(String date,String time){
        this.date=date;
        this.time=time;
    }

    // get method for get values
    public String getDate(){
        return date;
    }

    // set method for set values
    public void setDate(String date){
        this.date=date;
    }

    // get method for get values
    public String getTime(){
        return date;
    }

    // set method for set values
    public void setTime(String date){
        this.date=date;
    }

}
