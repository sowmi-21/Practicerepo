package lambdaexp;

public class MyMessageApp {
	public static void main(String[] args) {
        //1.LambdaMsg
		
//		LambdaMsg msg=()-> System.out.println("hello world");
//		msg.printMessage();
		
		//2.IMath
		
//		IMath imath=(a,b)->System.out.println(a+b);
//		
//		imath.calculate(12,23);
//		IMath imath1=(a,b)->System.out.println(a-b)

		//3.IInterest
		
	//	IInterest simpleInterest = (principal,rate,time)->(principal*rate*time)/100;
		
		IInterest simpleInterest = (principal,rate,time)->{
			System.out.println("principal "+principal);
			System.out.println("rate "+rate);
			System.out.println("time "+time);
		};
		
		double result = simpleInterest.getInterest(12000,2,3);
		System.out.println(result);
	}
	

}
