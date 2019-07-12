package main.com.stakeroute.task3;

public class Car {


    protected int wheels;
    protected int cyclinder_no;
    protected String cylinder_name;
    protected boolean engine;

    public Car(int cyclinder_no, String cylinder_name) {
        this.cyclinder_no = cyclinder_no;
        this.cylinder_name = cylinder_name;
        wheels=4;
        engine=true;
    }


    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }


    public int getCyclinder_no() {
        return cyclinder_no;
    }

    public String getCylinder_name() {
        return cylinder_name;
    }

    public void carInfo(){
        System.out.println("Number of wheels "+getWheels()+" Cylinder no. is "+getCyclinder_no()+" Cylinder name is"+getCylinder_name()+" Engine is present "+isEngine());
    }




    public void startEngine(){
        System.out.println("Engine is started.");
    }

    public void accelerate(){
        System.out.println("Car is running at 100kmph.");
    }

    public void brake(){
        System.out.println("Brake is applied.");
    }
}


