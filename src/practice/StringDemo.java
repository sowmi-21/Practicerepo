package practice;

import java.util.StringTokenizer;

public class StringDemo {
	public static void main(String[] args) {
		String name="sowmiya";
		String names= new String("sowmi");
		
		//check if both reference point to same location
		
		if(name==names)
		{
			System.out.println(name.hashCode());
			System.out.println(names.hashCode());
			System.out.println("same Location");
		}
		
		else
		{
			System.out.println(name.hashCode());
			System.out.println(names.hashCode());
			System.out.println("Different Location");
			
			//************lets check if 2 Strings are equal
			
		}
		
		if(name.equals(names))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("different");
		}
		
		StringTokenizer words = new StringTokenizer("happy new year, to All welcome");
		int countToken = words.countTokens();
		
		System.out.println(countToken);
		
		while(words.hasMoreTokens())
		{
			System.out.println(words.nextToken());
		}
	}

}
