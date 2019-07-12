package main.com.stakeroute.task3;

public class Lamborgini extends Car {


    public Lamborgini(int cyclinder_no, String cylinder_name) {
        super(cyclinder_no, cylinder_name);
    }

    public void startEngine(){
        System.out.println("Lamborgini is started.");
    }

    public void accelerate() {
        System.out.println("Lamborgini is running at 150kmph.");
    }

    public void brake(){
        System.out.println("Lamborgini's brake is applied.");
    }
}
