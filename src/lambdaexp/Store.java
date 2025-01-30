package lambdaexp;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

 class Item {
	private int itemid;
	private String itemname;
	private double price;
	 Item(int itemid, String itemname, double price)
	 {
		 this.itemid=itemid;
		 this.itemname=itemname;
		 this.price=price;
	 }
	
	 
	 public int getItemid() {
		return itemid;
	}


	public void setItemid(int itemid) {
		this.itemid = itemid;
	}


	public String getItemname() {
		return itemname;
	}


	public void setItemname(String itemname) {
		this.itemname = itemname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String toString()
	 {
		 return "itemid:"+" "+itemid+" "+"itemname:"+" "+itemname+" "+"price:"+" "+price;
	 }
}
public class Store{ 
	
	public static double discount(Supplier<Double>supplier)
	{
		return supplier.get();
	}
	 public static void main(String[] args) {
		 
		 List<Item>l=new ArrayList<>();
			
			l.add(new Item(101,"coffee",180.0));
			l.add(new Item(102,"tea",150.0));
			l.add(new Item(103,"boost",210.0));
			l.add(new Item(104,"horlicks",250.0));
			l.add(new Item(105,"milo",220));
		 
		 Predicate<Item>predicate=(num)->num.getPrice()>200;
		 for(Item i:l) {
		 if(predicate.test(i))
		 {
			 System.out.println(i.getItemname());
		 }
		}
		 System.out.println("----------------------------------------------------------");
		 Consumer<Item>consumer=(name)->{
			 System.out.println("price for " +name.getItemname()+" ---->  "+name.getPrice());
		 };
		 for(Item i:l) {
			consumer.accept(i);
			}
		 
		 System.out.println("----------------------------------------------------------");
	        for (Item a : l) {
	            System.out.print("Item Name: "+a.getItemname() + " ");
	            System.out.println("discounted price: "+discount(() -> 0.95 * a.getPrice()));
	        }
	        
	        System.out.println("----------------------------------------------------------");
	        Comparator<Item> comp=(p1,p2)->p1.getPrice()!=p2.getPrice()?p1.getPrice()>p2.getPrice()?1:-1:0;
	        Collections.sort(l, comp);
	        System.out.println("Sorted List using Price:");
	        for (Item a : l) {
	            System.out.println(a);
	        }
	        
	        System.out.println("----------------------------------------------------------");
	        Comparator<Item> comp1 = (p1, p2) -> p1.getItemname().compareTo(p2.getItemname());
	        Collections.sort(l, comp1);
	 
	        // Display the sorted list
	        System.out.println("Sorted List using ItemName:");
	        for (Item a : l) {
	            System.out.println(a);
	        }
	        
	    }	
		
	}



