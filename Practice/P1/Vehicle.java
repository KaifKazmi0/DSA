package Practice;

public abstract class Vehicle {
    abstract void start();

    void brake(){
        System.out.println("use Brake");
    }

    abstract void stop();

}
