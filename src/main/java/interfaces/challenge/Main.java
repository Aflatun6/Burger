package interfaces.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("AFlatun", 25, 100);
        System.out.println(player);
        saveObject(player);
        player.setHitPoints(30);
        saveObject(player);
//        loadObject(player);
        System.out.println(player);
        ISaveable monster = new Monster("Gozilla",92,600);
        System.out.println(monster);
        saveObject(monster);
        System.out.println("Strength = "+((Monster) monster).getStrength()); // CANNOT JUST CALL A MONSTER'S METHODS FROM A ISAVEABLE INSTANTIETE INSTANSE
        saveObject(monster);



    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a String" +
                "0 to quit");
        while (!quit) {

            System.out.println("Choose an option");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter a string");
                    String string = in.nextLine();
                    values.add(index, string);
                    index++;
                    break;
                case 0:
                    quit = true;
                    break;
            }

        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to the storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);


    }

}
