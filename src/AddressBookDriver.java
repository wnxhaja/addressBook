import java.util.Random;

public class AddressBookDriver {
	
	public static void main(String[] args){
		
		AddressBookXML xmlAddressBoook = new AddressBookXML();
		
		//writing xml file
		try {
			
			Random randomInt = new Random();
			
			
			Person personInfo = new Person("Abdul Jalil", "Laguindab", 
						"Del Carmen", "Iligan City", "Lanao Del Norte", "9200",
						"09059366722", randomInt.nextInt());
			
			xmlAddressBoook.writeXMLAddressBook(personInfo, randomInt.nextInt());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		//reading existing xml file
		try{
		String a = xmlAddressBoook.readXMLAddressBook();
		
	    System.out.println(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

}
