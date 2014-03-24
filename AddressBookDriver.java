
public class AddressBookDriver {
	
	public static void main(String[] args){
		
		Address a1 = new Address("Del Carmen", "Iligan City", "Lanao Del Norte", 9200);
		Address a2 = new Address("Patag", "Cagayan De Oro City", "Misamis Occidental", 3200);
		
		
		
		
		Person a = new Person("Abdul Jalil", "Laguindab", "09059366722", a1);
		Person b = new Person("Hazel Jay", "Ramos", "09264552994", a2);
		
		AddressBook ad = new AddressBook();
		
		ad.addPersonToAddressBook(a);
		ad.addPersonToAddressBook(b);
		
		System.out.println(ad.toString());
		ad.printPerson();
	}

}
