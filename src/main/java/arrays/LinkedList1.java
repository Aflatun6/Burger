package arrays;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList1 {
    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<String>();
//        list.add("Sidney");
//        list.add("Melbourne");
//        list.add("Perth");
//        list.add("Canberra");
//        list.add("Adelaide");
//        list.add("Darwin");
//        printOut(list);

        LinkedList<String> list = new LinkedList<String>();
        addInOrder(list,"Sidney");
        addInOrder(list,"Melbourne");
        addInOrder(list,"Perth");
        addInOrder(list,"Canberra");
        addInOrder(list,"Adelaide");
        addInOrder(list,"Darwin");
        printOut(list);
        addInOrder(list,"York");
        printOut(list);
        visit(list);
    }
    public static void printOut(LinkedList<String> list) {
        Iterator<String> i = list.listIterator();
        while (i.hasNext()) {
            System.out.println("Visit " + i.next());
        }
//        for(String s: list){
//            System.out.println("Visit "+s);
//
//        }
        System.out.println("=========================");
    }

    public static boolean addInOrder(LinkedList<String> list, String newCity) {
        ListIterator<String> i = list.listIterator();
        while (i.hasNext()) {
            int comparison = i.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " is already as a destination");
                return false;
            } else if (comparison > 0) {
                //newCity should be added before this one
                // Brisbane -> Darwin
                i.previous();
                i.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move to the next item
            }
        }
        i.add(newCity); // if there is no newCity, so add it to the end
        return true;  // return true to say that it had happened. (adding new element)
    }
    public static void visit(LinkedList<String> list){
        Scanner in = new Scanner(System.in);
        boolean quit =false;
        boolean goingForward=true;
        ListIterator<String> i = list.listIterator();
        if(list.isEmpty()){
            System.out.println("No cities in Iterator");
            return;
        }else {
            System.out.println("Now visiting "+i.next());
            printMenu();
        }
        while(!quit){
            int action= in.nextInt();
            in.nextLine();
            switch(action){
                case 0:
                    System.out.println("end of the holiday");
                    quit=true;
                    break;
                case 1:
                    if(!goingForward){
                        if(i.hasNext()){
                            i.next();
                        }
                        goingForward=true;
                    }
                    if(i.hasNext()){
                        System.out.println("Now visiting "+i.next());
                    }else{
                        System.out.println("We are in the end");
                        goingForward=false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(i.hasPrevious()){
                            i.previous();
                        }
                        goingForward=false;
                    }
                    if(i.hasPrevious()){
                        System.out.println("Now visiting "+i.previous());
                    }else{
                        System.out.println("We are in the beginning");
                        goingForward=true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;

            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions\n" +
                "0 - quit\n" +
                "1 - next\n" +
                "2 - previous\n" +
                "3 - showMenu()\n");
    }

}
