package practice;

public class PrintMachine {
	public static void main(String[] args) {
		
		Printer p = new LaserPrinter();
		String print = p.print();
		System.out.println(print);
		
		Scannercopier sc = new LaserPrinter();
		String scancopy = sc.scancopy();
		System.out.println(scancopy);
		
		
		}

}
