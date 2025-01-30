package ExceptionHandlingDemo;

public class Candidate {

	public void checkAge(int age) throws Exception{
		if(age<18) {
			throw new Exception("age is less than 18");
		}else {
			System.out.println("Candidate is eligible for interview");
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				Candidate obj=new Candidate();
				obj.checkAge(15);
			}catch(Exception e) {
				System.out.println(e);
			}
	 
		}
}
