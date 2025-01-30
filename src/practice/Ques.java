package practice;

class Customer{
	String custId;
	String name;
	Address1 address;
	
	Customer(String custId,String name,Address1 address){
		this.custId=custId;
		this.name=name;
		this.address=address;
	}
	
	public void getCustomer() {
		System.out.println("ID: "+custId+"\nname: "+name+"\naddress: "+address.getAdd());
	}
	
}
class Address1{
	String addr1;
	String addr2;
	String city;
	int pin;
	
	void setAdd(String addr1,String addr2,String city,int pin) {
		this.addr1= addr1;
		this.addr2= addr2;
		this.city=city;
		this.pin=pin;
		
	}
	String getAdd() {
		return "\nAddr1: "+addr1+"\naddr2: "+ addr2+"\ncity: "+city+"\npin: "+pin;
	}
	
}
 
class RegCustomer extends Customer{
	double fees;
	 RegCustomer(String custId, String name, Address1 address, double fees) {
	        super(custId, name, address);
	        this.fees = fees;
	    }
 
	    String getRegCustomer() {
	        getCustomer();
	        return "Fees: " + fees;
	    }
	}
 
public class Ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address1 address = new Address1();
        address.setAdd("capgemini", "sipcot", "chennai", 603103);

        RegCustomer reg = new RegCustomer("123", "abc", address, 1000.0);
        System.out.println(reg.getRegCustomer());

	}

}
