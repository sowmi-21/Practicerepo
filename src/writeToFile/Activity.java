package writeToFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Product implements Serializable
{
	String productname;
	float price;
	int quantity;
	public String getproductname()
	{
		return productname;
	}
	public void setproductname(String productname)
	{
		this.productname=productname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getquantity() {
		return quantity;
	}
	public void setquantity(int quantity) {
		this.quantity=quantity;
	}
}
class ProductDetails{
	public void saveProduct(Product pro) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("pro.txt");
		ObjectOutputStream objectwriter =new ObjectOutputStream(fout);
		objectwriter.writeObject(pro);
		objectwriter.flush();
		objectwriter.close();
	}
	public Product readProduct() throws FileNotFoundException,IOException,ClassNotFoundException{
		FileInputStream fin=new FileInputStream("pro.txt");
		ObjectInputStream objectreader  = new ObjectInputStream(fin);
		Product pro=(Product) objectreader.readObject();
		return pro;
	}
}
public class Activity {
	public static void main(String[] args) {
		Product pro=new Product();
		pro.setproductname("Coffee");
		pro.setPrice(200);
		pro.setquantity(5);
		ProductDetails details=new ProductDetails();
	try {
		details.saveProduct(pro);
		Product productdetail=details.readProduct();
		
		System.out.println(productdetail.getproductname());
		System.out.println(productdetail.getPrice());
		System.out.println(productdetail.getquantity());
	}
	catch(FileNotFoundException e) {
	}
	catch(IOException e) {
	}
	catch(ClassNotFoundException e) {
	}
	}
	}
	
	


