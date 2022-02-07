public class MainPolymorphism {
    public static void main(String[] args) {
        Car car = new Car(8, "base car");
        car.startEngine();
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();
    }



}
