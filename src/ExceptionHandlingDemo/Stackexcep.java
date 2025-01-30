package ExceptionHandlingDemo;

class snode {
    int data;
    snode next;
 
    public snode(int data, snode next) {
        this.data = data;
        this.next = next;
    }
}
 
class StackMemoryException extends Exception {
    public StackMemoryException(String message) {
        super(message);
    }
}
public class Stackexcep {
    snode top;
    int maxSize;
    int currentSize;
 
    public Stackexcep(int maxSize) {
        this.top = null;
        this.maxSize = maxSize;
        this.currentSize = 0;
    }
 
    void push(int data) throws StackMemoryException {
        if (currentSize == maxSize) {
            throw new StackMemoryException("Stack is full");
        }
        snode n = new snode(data, null);
        n.next = top;
        top = n;
        currentSize++;
    }
 
    int pop() throws StackMemoryException {
        if (top == null) {
            throw new StackMemoryException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        currentSize--;
        return data;
    }
 
    int peek() throws StackMemoryException {
        if (top == null) {
            throw new StackMemoryException("Stack is empty");
        }
        return top.data;
    }
 
    void display() {
        snode temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        try {
        	Stackexcep st = new Stackexcep(3);
            st.push(10);
            st.push(20);
            st.push(30);
            st.display();
            System.out.println("Deleted element: " + st.pop());
            st.display();
            st.push(40);
            st.display();
            System.out.println("Top element: " + st.peek());
            st.push(50); //exception
            
        } catch (StackMemoryException e) {
            System.out.println(e.getMessage());
        }
    }
}
