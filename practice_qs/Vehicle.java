interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();

        Vehicle bike = new Bike();
        bike.start();
    }
}