package Practice;

public  class Car extends Vehicle implements Engine {
    //Vehicle vh = new Vehicle(); -> not allowed to create instance or object of Abstract class
    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    void stop() {
        System.out.println("car stopped");
    }



    @Override
        public void engineStart() {
            System.out.println("hey from car");
        }
}
