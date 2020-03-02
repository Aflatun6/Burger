package interfaces.challenge2;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
//        String[] data = stringData.split(" ");
//        for (String s : data) {
//            list.addItem(new Node(s));
//        }
//        list.traverse(list.getRoot());

        String stringData = "5 4 7 3 9 1 2 5 6 8";
        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());

        list.removeItem(new Node("1"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("7"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());



    }
}
