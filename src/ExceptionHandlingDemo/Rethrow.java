package ExceptionHandlingDemo;

public class Rethrow {
	public void test(int n1, int n2) throws Exception  {
		try
		{
			System.out.println(n1/n2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("thrown handled");
			//throw e;
			throw(Exception)e.fillInStackTrace();		
			}
	}
	public static void main(String[] args) {
		Rethrow re = new Rethrow();
		try
		{
			re.test(30, 0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

