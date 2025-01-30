package demo;

public class HashTable {
	private String[]keys;
	private String[]values;
	private int capacity;
	
	public HashTable(int capacity)
	{
		this.capacity=capacity;
		keys = new String[capacity];
		values = new String[capacity];
	}
	private int hash(String key)
	{
		return Math.abs(key.hashCode()%capacity);
	}
	public void put (String key, String value)
	{
		int index = hash(key);
		while(keys[index]!=null)
		{
			if(keys[index].equals(key))
			{
				values[index]=value;//update value if key exists
				return;
			}
			index = (index+1)%capacity;//linear probing
		}
		keys[index]=key;
		values[index]=value;
	}
	public String get(String key)
	{
		int index = hash(key);
		while(keys[index]!=null)
		{
			if (keys[index].equals(key))
			{
				return values[index];
			}
			index = (index+1)%capacity;
		}
		return null;
	}
	public void remove(String key){
		 int index = hash(key);
		 while(keys[index] !=null) {
			 if (keys[index].equals
					 (key)) {
				 keys[index] = null; //remove the key
				 values[index] = null; //remove the value
				 return;
			 }
			 index = (index + 1) % capacity; //Continue probing
		 }
	}
	public void display()
	{
		for(int i=0; i<capacity; i++)
		{
			if(keys[i]!=null)
			{
				System.out.println("index"+i+":["+keys[i]+": "+values[i]+"]");
			}
		}
	}
	
	public static void main(String[] args) {
		HashTable obj = new HashTable(5);
		obj.put("1", "peter");
		obj.put("2", "sam");
		obj.put("3", "eric");
		obj.put("4", "rudh");
		obj.put("5", "simond");
		System.out.println(obj.get("1"));
		System.out.println(obj.get("2"));
		System.out.println(obj.get("3"));
		System.out.println(obj.get("4"));
		System.out.println(obj.get("5"));
		
	}
}
