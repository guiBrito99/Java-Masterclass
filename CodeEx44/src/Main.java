public class Main {
    public static void main(String[] args) {
        // 1. Initialize the mobile phone
        MobilePhone myPhone = new MobilePhone("123-456-7890");

        // 2. Create contacts using the static factory method
        Contact alice = Contact.createContact("Alice", "111-222-3333");
        Contact bob = Contact.createContact("Bob", "444-555-6666");
        Contact charlie = Contact.createContact("Charlie", "777-888-9999");

        // 3. Test adding contacts
        System.out.println("Adding Alice: " + myPhone.addNewContact(alice));
        System.out.println("Adding Bob: " + myPhone.addNewContact(bob));
        System.out.println("Adding Charlie: " + myPhone.addNewContact(charlie));        
        System.out.println("Adding Charlie: " + myPhone.addNewContact(charlie));
        
        System.out.println("\n--- Current Contacts ---");
        myPhone.printContacts();

        // 4. Test updating a contact
        System.out.println("\n--- Updating Contact ---");
        Contact newBob = Contact.createContact("Bob New", "000-000-0000");
        // Note: This will likely fail based on the current updateContact logic (see notes below)
        System.out.println("Updating Bob to New Bob: " + myPhone.updateContact(bob, newBob));
        myPhone.printContacts();

        // 5. Test removing a contact
        System.out.println("\n--- Removing Contact ---");
        System.out.println("Removing Alice: " + myPhone.removeContact(alice));
        
        System.out.println("\n--- Final Contacts ---");
        myPhone.printContacts();
    }
}