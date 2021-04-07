
public class Stack {
	
	private int data[];
	private int top;
	
	public void stackuse() {
		data =new int[10];
		top =-1;
	}
	
	public void stackuse(int cap) {
		data =new int[cap];
		top =-1;
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public int size() {
		return top+1;
	}
	
	public int top() throws StackEmpty {
		if (size()==0) {
			StackEmpty e = new StackEmpty();
			throw e;}
		return data[top];
	}
	
	public void push(int ele)  {
		
		top++;
		data[top] = ele;
	}
	
	public int pop() {
		int temp =top;
		top--;
		return temp;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack =new Stack();
		for(int i =1; i<= 5; i++) {
		stack.push(i);
		}		
		

	}

}
