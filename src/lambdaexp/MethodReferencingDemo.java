package lambdaexp;

interface IMessage {
    void printMessage();
}
 
class HelloMessenger {
	public HelloMessenger()
	{
		System.out.println("Hello from instance");
	}
    public void displayMessage() {
        System.out.println("Hello World");
    }
}
 
public class MethodReferencingDemo {
 
    public static void main(String[] args) {
      //  HelloMessanger messenger = new HelloMessanger();
        
        IMessage message = HelloMessenger::new;
        message.printMessage();
    }
}


