package contacts;

public class Main {
    public static void main(String[] args) {
        Contact c =Contact.createContact("Aflatun","5061");
        MobilePhone mb= new MobilePhone("0012 0021 1234");
        Contact b =Contact.createContact("Afooooo","550555");

        mb.addNewContact(c);
        System.out.println(mb.queryContact(c));
        System.out.println(mb.updataContact(Contact.createContact("afo","3435"),c));
        System.out.println(mb.queryContact(c));
        mb.addNewContact(b);
        System.out.println(mb.queryContact(b));

        System.out.println(mb.removeContact(b));
        Integer a = 35; // new Integer(35)
        System.out.println(a);
        int bb = a; // a.intValue(); converts Integer back to int







    }
}
