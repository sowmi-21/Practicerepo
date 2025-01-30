package lambdaexp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Device
{
	private String devicename;
	private String ipaddress;
	private String username;
	Device(String devicename, String ipaddress, String username)
	{
		this.devicename=devicename;
		this.ipaddress=ipaddress;
		this.username=username;
	}
	
	public String getname()
	{
		return devicename;
	}
	public void setname(String devicename)
	{
		this.devicename=devicename;
	}
	public String getip()
	{
		return ipaddress;
	}
	public void setip(String ipaddress)
	{
		this.ipaddress=ipaddress;
	}
	public String getuser()
	{
		return username;
	}
	public void setuser(String username)
	{
		this.username=username;
	}
	
	public String toString()
	{
		return "devicename:"+" "+devicename+" "+"ipaddress:"+" "+ipaddress+" "+"username:"+" "+username;
	}
	
	
}
public class StreamActivity {
	public static void main(String[] args) {
		
	
	List<Device> dev = Arrays.asList(new Device("Router","11.33.22","Admin"),
			new Device("BST","118.373.22","user"),
			new Device("Router","101.33.232","Admin"),
			new Device("BSC","191.393.922","Admin"),
			new Device("Router","11.033.282","User"));
	
	Stream<Device> sdev=dev.stream();
	Stream<Device> sdev1=dev.stream();
	Stream<Device> sdev2=dev.stream();
	System.out.println("Device Name with Router");
	sdev.filter((e)->e.getname().equals("Router")).forEach((e)->System.out.println(e));
	
	System.out.println("----------------------------------------------------------");
	System.out.println("Displaying in Uppercase");
	sdev1.map(e -> "DeviceName: " + e.getname().toUpperCase() +
            ", IPAddress: " + e.getip().toUpperCase() +
            ", UserName: " + e.getname().toUpperCase()).forEach((e)->System.out.println(e));
	
	System.out.println("----------------------------------------------------------");
	System.out.println("Username= Admin");
	sdev2.filter((e)->e.getname().equals("Admin")).forEach((e)->System.out.println(e));
	
}
}

