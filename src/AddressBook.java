import com.sun.jndi.cosnaming.IiopUrl;

import java.util.*;
public class AddressBook {

    private ArrayList<BuddyInfo>  buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    private void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    private boolean removeBuddy(BuddyInfo buddy){
        return buddies.remove(buddy);
    }

    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton",613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }


}
