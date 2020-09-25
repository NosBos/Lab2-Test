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

        System.out.println("Address Book");
    }


}
