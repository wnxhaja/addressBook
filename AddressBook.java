import java.util.ArrayList;


public class AddressBook {
	
	private ArrayList<Person> addressbook = new ArrayList<Person>();
	
	AddressBook(){}
	
	AddressBook(Person person){
		this.addressbook.add(person);
	}
	
	AddressBook(String fname, String lname, String pnum, Address padd){
		this.addressbook.add(new Person(fname, lname, pnum, padd));
	}
	
	AddressBook(String fname, String lname, String pnum, String address,String city,String state,int zip){
		this.addressbook.add(new Person(fname, lname, pnum, new Address(address, city, state, zip)));
	}
	
	
	public void addPersonToAddressBook(Person person){
		addressbook.add(person);
	}
	
	public void printPerson(){
		for(Person p: addressbook){
			p.printPerson();
		} 
	}
	
	public String toString(){
		StringBuilder ab = new StringBuilder();
		
		for(Person p: addressbook){
			ab.append(p.toString());
		}
		
		return ab.toString();
	}


}
