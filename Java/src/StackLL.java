
public class StackLL<T> {
	
	private Node<T> head;
	private int size ;
	
	public boolean isemoty() {
		return (size ==0);
	}
	
	int size() {
		return size;
	}
	
	int top() throws StackEmpty {
		if (size()==0) {
			StackEmpty e = new StackEmpty();
			throw e;
		}
		return head.data;
	}
	
	void push (T ele) {
		Node<T> newNode =new Node<T>();
		newNode.next=head;
		head=newNode;
		size++;
	}
	
	int pop() {
		int tempdata =head.data;
		head=head.next;
		size--;
		return tempdata;
	}
	public static void main(String[] args) throws StackEmpty {
		StackLL<Integer> stack =new StackLL<Integer>();
		stack.push(5);
		stack.push(10);
	
		System.out.println(stack.pop());
		
	}
}
