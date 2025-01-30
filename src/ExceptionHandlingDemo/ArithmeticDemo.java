package ExceptionHandlingDemo;

public class ArithmeticDemo implements AutoCloseable{
	public void close()
	{
		System.out.println("resource closed");
	}
	public void divide(int a, int b)
	{
		System.out.println(a/b);
	}
	public static void main(String args[])
	{
		try(ArithmeticDemo obj = new ArithmeticDemo())
		{
			obj.divide(12,0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero");
		}
	}
}
