package interfaces.challenge2;

import java.awt.*;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            //The list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                // newItem is greater, so to move right if possible;
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();// to countinue processing / It's like i++.
                } else { // It will be when there are no more item left at the end
                    currentItem.setNext(newItem); // insert it to the end;
                    newItem.setPrevious(currentItem); // To point that it is the last only only way back is through that currentItem.

//                    currentItem.setNext(newItem).setPrevious(currentItem); //Because first.setNExt will return newItem and we just setPrevious on newItem the currentItem as a previous
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, so we need to insert before that current item.
                if (currentItem.previous() != null) {
                    ListItem previous = currentItem.previous();
                    previous.setNext(newItem);
                    newItem.setPrevious(previous);
//                    previous.setNext(newItem).setPrevious(previous);
                    currentItem.setPrevious(newItem);
                    newItem.setNext(currentItem);
//                    currentItem.setPrevious(newItem).setNext(currentItem);

                } else {
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
//                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // EQUALS
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;

    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                //found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else { //comparison > 0
                //We are at item that greater than one to be deleted
                // So the item is not on the list
                return false;
            }
        }
        // We've reached the end of the list
        // So nothing was deleted
        return false;

    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
