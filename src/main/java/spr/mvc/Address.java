package spr.mvc;

public class Address {
    private String city,state;
    private int pin;

    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }

    public void setState(String state){
        this.state=state;
    }
    public String getState(){
        return state;
    }

    public void setPin(int pin){
        this.pin=pin;
    }
    public int getPin(){
        return pin;
    }

}
