package arrays;

import java.util.ArrayList;

public class ArrayList1 {
    public ArrayList<String> list = new ArrayList<String>();
    public ArrayList1 (ArrayList<String> list){
        this.list=list;
    }

    public ArrayList<String> getArrayList(){
        return list;
    }

    public void addItem(String item) {
        list.add(item);
    }

    public void printIt() {
        System.out.println("You have " + list.size() + " elements in your ArrayList");
//            for(String s:list){
//                System.out.println("value "+s);
//            }
        list.forEach(s -> System.out.println("value " + s));
    }

    public void changeItem(int index, String newItem) {
        list.set(index, newItem);
    }

    public void removeItem(int index) {
        String item = list.get(index);
        list.remove(index);
    }

    public String findItem(String searching) {
        boolean exists = list.contains(searching);
        if(exists){
            int index = list.indexOf(searching);
            return list.get(index);
        }
        return null;
    }
}
