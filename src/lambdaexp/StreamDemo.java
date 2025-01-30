package lambdaexp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Coffee
{
	private String name;
	private int price;
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + "]";
	}
	
}

public class StreamDemo {
	
	
	public static void main(String[] args) {

		
		List<Coffee>coffeeList=Arrays.asList(new Coffee("Espresso",200),
				new Coffee("Latte",250),
				new Coffee("Regular",350),
				new Coffee("Black",275),
				new Coffee("Ceylon",350),
				new Coffee("Cold Coffee",175),
				new Coffee("Coffee with cream",390));
		
		Stream<Coffee>coffeeStream=coffeeList.stream();
		Predicate<Coffee> filterByPrice=(e)->e.getPrice()>200;
		Function<Coffee,String> displayCoffee=(e)->e.getName().toUpperCase()+","+e.getPrice();
		
		coffeeStream.filter(filterByPrice).map(displayCoffee).forEach((e)->System.out.println(e));	}

}
