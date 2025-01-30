package lambdaexp;

import java.util.function.Supplier;

public class SupplierDemo {
	public static int getLength(Supplier<Integer>supplier)
	{
		return supplier.get();
	}
	public static void main(String[] args) {
		System.out.println(getLength(()->"hello world".length()));
		System.out.println(getLength(()->new int[] {12,23,11,19,55}.length));
		System.out.println(getLength(()->12*23));
	}

}
