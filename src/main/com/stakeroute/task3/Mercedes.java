package main.com.stakeroute.task3;

public class Mercedes extends Car {


    public Mercedes(int cyclinder_no, String cylinder_name) {
        super(cyclinder_no, cylinder_name);
    }

    public void startEngine(){
        System.out.println("Mercedes Engine is started.");
    }

    public void accelerate(){
        System.out.println("Mercedes is running at 120kmph.");
    }

    public void brake(){
        System.out.println("Mercedes's brake is applied.");
    }
}


