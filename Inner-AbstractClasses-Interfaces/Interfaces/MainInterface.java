import java.util.ArrayList;
import java.util.Scanner;

public class MainInterface {
    public static void main(String[] args) {
        Player player = new Player("Uğur", 20, 25);
        System.out.println(player.toString());

        player.setHitPoints(8);
        System.out.println(player);
        player.setWeapon("Irujuhugn");
        saveObject(player);
        loadObject(player);
        System.out.println(player);

        ISaveable wolf = new Monster("Wolf" , 20, 40);
        System.out.println(wolf);
        saveObject(wolf);
    }


    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while(!quit) {
            System.out.println("Choose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }

        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving: " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
