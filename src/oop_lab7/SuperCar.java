package oop_lab7;

public class SuperCar {


    @Override
    public String toString() {
        return "SuperCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", engineSize='" + engineSize + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", country='" + country + '\'' +
                '}';
    }//toString

    private String brand;
    private String color;
    private String engineSize;
    private String maxSpeed;
    private String country;
    //constructor
    public SuperCar(){}
    public SuperCar(String b,String c, String s, String m, String cou){
        //asugne data to class properties
        this.brand = b;
        this.color = c;
        this.engineSize = s;
        this.maxSpeed = m;
        this.country = cou;

    }
    //getter and setter methods
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getEngineSize(){
        return this.engineSize;
    }
    public void setEngineSize(String engineSize){
        this.engineSize = engineSize;
    }
    public String getMaxSpeed(){
        return this.maxSpeed;
    }
    public void setMaxSpeed(String maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
    }

}//class
