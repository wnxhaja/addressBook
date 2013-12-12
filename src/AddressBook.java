import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


@Root
public class AddressBook {
	
	@Attribute
	private int addBookNumber;
	
	@Element
	private Person personInfo;
	
	public AddressBook(){
		super();
	}
	
	AddressBook(Person person,int addBookNumber){
		this.personInfo = person;
		this.addBookNumber = addBookNumber;
	}
	
	public Person getPersonInfo(){
		return personInfo;
	}
	
	public int getAddBookNumber(){
		return addBookNumber;
	}
	
	public String toString(){
		return addBookNumber + " " +personInfo.toString();
	}
}
