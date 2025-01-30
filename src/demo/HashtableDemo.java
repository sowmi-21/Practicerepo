package demo;

import java.util.*;
public class HashtableDemo {
//	public static void main(String[] args) {
//		//create a hashtable
//		Hashtable<String,Integer> h = new Hashtable<>();
//		
//		//insert key-value pairs
//		h.put("Alice", 30);
//		h.put("bob", 25);
//		h.put("charlie", 21);
//		
//		//accessing values using keys
//		System.out.println("alice age is:"+h.get("Alice"));//output:alice age is :30
//		
//		//checking if a key exists
//		if(h.containsKey("bob"))
//		{
//			System.out.println("bob age is:"+h.get("bob"));//output:bob age is :25
//		}
//		
//		//removing a key-value pair
//		h.remove("charlie");
//		System.out.println("charlie age after removal:"+h.get("charlie"));//output:null
//		
//		public class DivisionHash
//		{
			public static int hash(int key, int prime)
			{
				return key%prime;
			}
		
		public static void main(String[]args)
		{
			int key=12345;
			int prime=31;//a prime no
			System.out.println("hash:"+hash(key,prime));//output: hash:24
//		}
//		}
		
		
		
	}

}
