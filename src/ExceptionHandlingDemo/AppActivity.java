package ExceptionHandlingDemo;
import java.util.*;

public class AppActivity implements AutoCloseable {
    public int age;
    public long ph;
    public String name;
    public  String address;
    
 
 
 
	@Override
    public void close() {
        System.out.println("resources closed");
    }
 
    public AppActivity(int age, long ph, String name,String address) throws Exception {
    	if(String.valueOf(ph).length()>10||String.valueOf(ph).length()<10) {
    		throw new Exception("Length of the phone number exceeded");
    	}
		this.age = age;
		this.ph = ph;
		this.name = name;
		this.address=address;
	}
 
    @Override
    public String toString() {
        return "Activity [age=" + age + ", ph=" + ph + ", name=" + name + ", address=" + address + "]";
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
        	System.out.println("Enter name:");
        	String name=sc.nextLine();
        	System.out.println("Enter address:");
        	String address=sc.nextLine();
        	System.out.println("Enter age:");
        	int age=sc.nextInt();
        	System.out.println("Enter phone number:");
        	long phone =sc.nextLong();
        	
        
        try(AppActivity activity = new AppActivity(age,phone,name,address)){
        	System.out.println(activity.toString());
            
 
        }
        }catch (Exception e) {
            System.out.println("Illegal Datatype");
        } finally {
            sc.close();
        }
        
    }
}
//public class AppActivity implements AutoCloseable{
//	public void close()
//	{
//		System.out.println("resource closed");
//	}
//	String name;
//	int age;
//	String address; long phno;
//	public AppActivity()
//	{
//		this.name=name;
//		this.age=age;
//		this.address=address;
//		this.phno=phno;
//	}
////	public void display()
////	{ 
////		System.out.println("name is:"+" "+name);
////		System.out.println("age is:"+" "+age);
////		System.out.println("address is:"+" "+address);
////		System.out.println("phno is:"+" "+phno);
////	}
//	public void data(String name,int age, String address, long phno)
//	{
//		System.out.println(name+" "+age+" "+address+" "+phno);
//	}
////	public static void main(String[] args) {
////		try(AppActivity obj = new AppActivity())
////		{
////			obj.data("sowmi", 21, "cuddalore", 9655210703L);
////		}
////		catch(IllegalArgumentException e)
////		{
////			System.out.println("length of phno is beyond 10 digits");
////		}
////	}
//	
// 
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		String address=sc.next();
//		int age = sc.nextInt();
//		long phno=sc.nextLong();
//		try(AppActivity obj = new AppActivity())
//		{
//		obj.data(name, age, address, phno);
//	   }
//		catch(InputMismatchException e)
//		{
//			System.out.println("length of phno is beyond 10 digits");
//		}
//	}
//	
//}
