import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contact> myContacts;
	
	public MobilePhone (String myNumber) {
		this.myNumber = myNumber;
		myContacts = new ArrayList<>();
	}
	
	public boolean addNewContact(Contact contact) {
		
		//Added a verification to ensure a number equal to mine wouldn't be added
		boolean contains = this.findContact(contact) != -1 || contact.getPhoneNumber().equals(this.myNumber);

		if(!contains)
			myContacts.add(contact);
		
		return !contains;
	}
	
	public boolean updateContact(Contact oldContact, Contact contact) {
		boolean contains = this.findContact(oldContact) != -1 && this.findContact(contact) == -1;
		
		if(contains)
			this.myContacts.set(this.myContacts.indexOf(oldContact), contact);
		
		return contains;
	}
	
	public boolean removeContact(Contact contact) {
		return this.myContacts.remove(contact);
	}
	
	private int findContact(Contact contact) {
		return this.findContact(contact.getName());
	}
	
	private int findContact(String name) {		
		return this.myContacts.indexOf(this.queryContact(name));
	}
	
	public Contact queryContact(String name) {
		Contact aux = null;
		
		for(int i = 0; i < this.myContacts.size(); i++) {
			if(this.myContacts.get(i).getName().equals(name)) {
				aux = this.myContacts.get(i);
				i = this.myContacts.size();
			}
		}
		
		return aux;
	}
	
	public void printContacts() {
		System.out.println("Contact List:");
		Contact aux = null;
		for(int i = 0; i < this.myContacts.size(); i++) {
			aux = this.myContacts.get(i);
			System.out.println((i+1) + ". " + aux.getName() + " -> " + aux.getPhoneNumber());
		}
	}
}