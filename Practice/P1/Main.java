package Practice.P1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vh = new Car();
        Bicycle bc = new Bicycle();
        Vehicle v = new Bicycle();


        car.start();
        car.brake();
        vh.stop();
        bc.start();
        v.brake();
        v.stop();
    }
}
