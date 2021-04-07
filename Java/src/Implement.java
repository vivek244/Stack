
public class Implement {
	
	int top;
	int a[]= new int[5];
	
	boolean isempty() {
		return top<0;
	}
	
	int peek() {
		if (top<0){
		System.out.println("Stack Underflow");
		return 0;}
		else {
			int x=a[top];
			System.out.println(x + " is top element");
		}
		return 0;
	}
	
	boolean push(int x) {
		if(top>=(4)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			 a[++top] = x;
	            System.out.println(x + " pushed into stack");
	            return true;
		}
	}
	
	int pop() {
		if (top<0){
			System.out.println("Stack Underflow");
			return 0;}
		else {
			int x=a[top--];
			System.out.println(x + " popped from stack");
		}
		return top;
	}
	
	public static void main(String[]args) {
		Implement c=new Implement();
		for (int i=1;i<5;i++) {
			c.push(i);
		}
		c.pop();
	}
	

}
