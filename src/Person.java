
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;




public class Person {
	
	@Attribute
	private int id;
	
	@Element
	private String fname,lname,street,city,state,zip,phoneNumber;

	
	public Person(){
		super();
	}
	
	public Person(String fname, String lname, String street, String city,
			String state, String zip, String phoneNumber, int id) {
		this.fname = fname;
		this.lname = lname;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.id = id;
		
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getStreetName() {
		return street;
	}

	public String getCityName() {
		return city;
	}
	
	public String getStateName(){
		return state;
	}

	public String getZip(){
		return zip;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public int getID(){
		return id;
	}
	
	public String toString(){
		return getID() + " " +getFname() +" " + getLname() + " " + getStreetName() +" "+ getCityName()
				+ " "+ getStateName() + " " + getZip() + " " + getPhoneNumber();
	}
}
