import java.util.ListIterator;
import java.util.Stack;
public class Sort {
	
	static void insert(Stack<Integer> s,int x) {
		if (s.isEmpty() || x<s.peek()) {
			s.push(x);
			return;
		}
		int temp=s.pop();
		insert(s,x);
		s.push(temp);
	}
	
	static void sort(Stack<Integer> s) {
		if(!s.isEmpty()) {
			int x =s.pop();
			sort(s);
			insert(s,x);
		}
	}
	
	static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();
        while (lt.hasNext())
            lt.next();
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }

	public static void main(String[] args) {
		 Stack<Integer> s = new Stack<>();
	        s.push(30);
	        s.push(-5);
	        s.push(18);
	        s.push(14);
	        s.push(-3);
	 
	        System.out.println(
	            "Stack elements before sorting: ");
	        printStack(s);
	 
	        sort(s);
	 
	        System.out.println(
	            " \n\nStack elements after sorting:");
	        printStack(s);

	}

}
