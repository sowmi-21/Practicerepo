package ExceptionHandlingDemo;

	class AgeException extends Exception {
		int age;
		public AgeException(int age)
		{
			super("invalid age" +age);
			this.age=age;
		}
		public String toString() {
			return age+"is not appropriate value";
		}
		}
	public class Interview{
		public int checkage(int age) throws AgeException{
			if(age<23)
			{
				throw new AgeException(age);
			}
			else {
				return age;
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Interview obj = new Interview();
			try {
				obj.checkage(18);
			}
			catch(AgeException e)
			{
				System.out.println(e);
		}
	 
	}
	}
	 
	


