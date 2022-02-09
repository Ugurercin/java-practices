public class MainGearBox {
    public static void main(String[] args) {
        GearBox mercedes = new GearBox(6);
        GearBox.Gear first = mercedes.new Gear(1, 15);
        System.out.println(first.driveSpeed(1000));
    }
}
