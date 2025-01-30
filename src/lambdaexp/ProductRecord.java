package lambdaexp;
import java.util.*;
class Product
{
	String name;
	float price;
	public Product(String name, float price)
	{
		//super();
		this.name=name;
		this.price=price;
	}
	public String getname() {
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public float getprice()
	{
		return price;
	}
	public void setprice(float price)
	{
		this.price=price;
	}

	public String toString()
	{
		return "name:"+" "+name+" "+" price: "+price; 
	}
}

public class ProductRecord {
	public static void main(String[] args) {
		Comparator<Product>comparator=(p1,p2)->
		p1.getprice()!=p2.getprice()?p1.getprice()>p2.getprice()?1:-1:0;
		
		TreeSet<Product>treeset= new TreeSet(comparator);
		
		treeset.add(new Product("coffee",120));
		treeset.add(new Product("Ice Tea",200));
		treeset.add(new Product("Tea",110));
		treeset.add(new Product("Black Coffee",150));
		
		System.out.println(treeset);
		
	}

}
