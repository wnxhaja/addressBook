
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
	
	public String toString(){
		StringBuilder a = new StringBuilder();
		a.append(address);
		a.append(" ");
		a.append(city);
		a.append(" ");
		a.append(state);
		a.append(" ");
		a.append(zip);
		return a.toString();
	}
}
