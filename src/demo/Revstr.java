package demo;

public class Revstr {
	public static void main(String[] args) {
		String str="betty bought some better butter, but it was bitter butter";
		
//		for(int i=str.length()-1; i>=0; i--)	
//		{
//			System.out.print(str.charAt(i));
//		}
		char c[]=str.toCharArray();
		for(int i=c.length-1; i>=0;i--)
		{
			System.out.print(c[i]);
		}
		}

}
