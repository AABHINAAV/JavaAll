abstract class Vehicle {
    abstract void start();
}

class Scooter extends Vehicle {
    void start() {
        System.out.println("Scooter function");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car function");
    }
}

class Result {
    public static void main(String[] args) {
        // Vehicle objVehicle = new Vehicle(); // error : it cannot be instantiated

        Car objCar = new Car();
        objCar.start();

        Scooter objScooter = new Scooter();
        objScooter.start();
    }
}