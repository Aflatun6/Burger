package contacts;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already in the file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updataContact(Contact newItem, Contact oldItem) {
        int index = findContact(oldItem);
        if (index < 0) {
            System.out.println(oldItem.getName() + " wasn't found");
            return false;
        }
        myContacts.set(index, newItem);
        System.out.println(oldItem.getName() + " was replaced with " + newItem.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int index = myContacts.indexOf(contact);
        if(index<0){
            System.out.println(contact.getName()+" was not found in the list");
            return false;
        }
        System.out.println(contact.getName()+" was deleted");
        myContacts.remove(contact);// OR  myContacts.remove(index)
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

}
