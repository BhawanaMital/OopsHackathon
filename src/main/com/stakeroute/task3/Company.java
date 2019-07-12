package main.com.stakeroute.task3;

public class Company {
    public static void main(String[] args) {
        Car car[]=new Car[3];
        car[0]=new Mercedes(2," THERMAL ENGINE");
        car[1]=new Lamborgini(3," Electrical engine");
        car[2]=new Bukati(4,"Physical engine");

        for (int i=0;i<3;i++){
            car[i].startEngine();
            car[i].accelerate();
            car[i].brake();
            car[i].carInfo();
        }
    }
}
