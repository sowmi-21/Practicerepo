package practice;

  class Shape{
	void calculateArea()
	{
		System.out.println("Area:");
	}
}
class Rectanglee extends Shape
{
	 void calculateArea()
	{
		int area;
		area=4*2;
		System.out.println(area);
	}
}
class Triangle extends Shape
{
	void calculateArea()
	{
		float area;
		area=0.5f*3*4;
		System.out.println(area);
	}
}
class Drawshape
{
	Drawshape(Shape sh)
	{
		sh.calculateArea();
	}
}
public class FindArea {
	public static void main(String[] args) {
		Triangle tri = new Triangle();	
		Rectanglee rec = new Rectanglee();
		Shape sh = new Shape();
		Drawshape ds = new Drawshape(tri);
		Drawshape ds1 = new Drawshape(sh);
		
	}

}
