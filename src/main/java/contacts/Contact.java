package contacts;

public class Contact {
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    private String name;
    private String number;
    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public static Contact createContact(String name,String number){
        return new Contact(name,number);
    }

}
