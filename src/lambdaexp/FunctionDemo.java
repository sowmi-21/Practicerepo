package lambdaexp;

import java.util.function.Function;

public class FunctionDemo {
	public static void printLength(Function<String,Integer>function,String str)
	{
		System.out.println(function.apply(str));
	}
	public static void main(String args[])
	{
		printLength((str)->str.length(),"hello world");
		printLength((str)->(int)str.toCharArray()[0],"hello world");
		printLength((str)->str.split(" ").length,"hello world");
		
	}
}
