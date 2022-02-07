public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Engine is starting for car.startEngine()");

    }

    public void accelerate() {
        System.out.println("The car is accelerating for car.accelerate()");
    }

    public void brake() {
        System.out.println("The car is braking for car.brake()");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
