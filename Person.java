
public class Person {
	
	private Address padd;
	private String fname,lname,pnum;
	
	Person(){}
	
	Person(String fname, String lname, String pnum, Address padd){
		this.fname = fname;
		this.lname = lname;
		this.pnum = pnum;
		this.padd = padd;
	}
	
	Person(String fname, String lname, String pnum, 
			String address,String city,String state,int zip){
		this.fname = fname;
		this.lname = lname;
		this.pnum = pnum;
		this.padd = new Address(address,city,state,zip);
	}
	
	public String getFname(){
		return fname;
	}
	public String getLname(){
		return lname;
	}
	public String getPnum(){
		return pnum;
	}
	public Address getPadd(){
		return padd;
	}
	
	public String toString(){
		StringBuilder p = new StringBuilder();
		p.append(fname);
		p.append(" ");
		p.append(lname);
		p.append(" ");
		p.append(pnum);
		p.append(" ");
		p.append(padd.toString());
		p.append("\n");
		return p.toString();
	}

}
