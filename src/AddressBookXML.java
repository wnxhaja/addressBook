
import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class AddressBookXML {
	
	public AddressBookXML(){
	}
	
	
	//write xml file
	public void writeXMLAddressBook(Person personInfo,int id) throws Exception{
		
		Serializer serializer = new Persister();
		File source = new File("addressBook.xml");
		
		AddressBook addressBook = new AddressBook(personInfo,id);

		serializer.write(addressBook, source);
	}
	
	//read xml file
	public String readXMLAddressBook() throws Exception{

          Serializer serializer = new Persister();
          File source = new File("addressBook.xml");
          AddressBook addressBook = serializer.read(AddressBook.class, source);
		
          return addressBook.toString();           
	}
}
