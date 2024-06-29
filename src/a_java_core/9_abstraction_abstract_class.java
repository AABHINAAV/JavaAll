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

/*
 * abstract is the on which has zero or more abstract methods
 * it should have abstract keyword before class keyword
 * 
 * abstract method is the one which does not have body
 * it is overridden by giving body in its child classes
 * 
 * abstract class cannot be instantiated
 * 
 * any class inherited from abstract is required to override all of its abatract methods
 * other wise it will become an abstract class
 * 
 * abtract class achieves 0 to 100% abstraction
 */