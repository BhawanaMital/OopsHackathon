package main.com.stakeroute.task3;

public class Bukati extends Car {


    public Bukati(int cyclinder_no, String cylinder_name) {
        super(cyclinder_no, cylinder_name);
    }

    public void startEngine(){
        System.out.println("Bukati's Engine is started.");
    }

    public void accelerate(){
        System.out.println("Bukati is running at 180kmph.");
    }

    public void brake(){
        System.out.println("Bukati's brake is applied.");
    }
}
