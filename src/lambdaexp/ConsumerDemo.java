package lambdaexp;

import java.util.function.Consumer;

public class ConsumerDemo {
	void analyzetext(Consumer<String> consumer, String str)
	{
		consumer.accept(str);
	}
	public static void main(String[] args) {
//		Consumer<String>consumer=(str)->{
//		System.out.println(str);
//		System.out.println(str.length());
//		System.out.println(str.toUpperCase());
//		
//			
//		};
//		consumer.accept("hello world");
		
		ConsumerDemo obj = new ConsumerDemo();
		obj.analyzetext(str)->{
			System.out.println(str.length());
			String[]strarray=str.spilt
		}
	}

}
