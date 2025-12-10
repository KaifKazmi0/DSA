package Practice.P1;

public class Bicycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Bicycle started");
    }

    @Override
    void brake() {
        System.out.println("brake of bicycle");
    }

    @Override
    void stop() {
        System.out.println("bicycle stopped");
    }
}
