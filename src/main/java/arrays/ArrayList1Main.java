package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList1 a = new ArrayList1(new ArrayList<String>());
        a.printIt();
        a.addItem("Aflatun");
        a.printIt();
        a.addItem("Afo");
        a.addItem("Afi");
        a.addItem("Alik");
        a.addItem("Efi");
        a.printIt();
        a.changeItem(2, "Efi");
        a.printIt();
        a.removeItem(4);
        a.printIt();
        System.out.println("hh                 " + a.findItem("Aflatun"));
        String[] b = new String[a.getArrayList().size()];
        System.out.print(Arrays.toString(b));
        b = a.getArrayList().toArray(b); // CONVERTS THAT ARRAYLIST TO AN ARRAY;
        System.out.print(Arrays.toString(b));

    }
}
