package practice;

class Rectangle
{
	double length;
	double breadth;


 Rectangle(double length, double breadth)
 {
	 this.length=length;
	 this.breadth=breadth;
 }
 public double area() 
 {
	 return length*breadth;
 }
 
}
public class Ques2 {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(2.11,2);
	    double area = rec.area();
	    System.out.println(area);
		
	}
	
	

}
