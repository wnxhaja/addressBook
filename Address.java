
public class Address {
	
	private String address,city,state;
	private int zip;
	
	Address(){}
	
	Address(String address,String city,String state,int zip){
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public String getAddress(){
		return address;
	}
	public String getCity(){
		return city;
	}
	public String getState(){
		return state;
	}
	public int getZip(){
		return zip;
	}
	
	public void printAddress(){
		System.out.print(address + " " + city + " " + state + " " + zip + "\n"); 
	}
	
	public String toString(){
		StringBuilder a = new StringBuilder();
		a.append(address + " " + city + " " + state + " " + zip);
		return a.toString();
	}
}
