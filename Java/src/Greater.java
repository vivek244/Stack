
public class Greater {
	
	static class stack{
		int top;
		int item []= new int[100];
		
		boolean isempty() {
			return (top==-1) ?true:false;
		}
		
		void push(int x) {
			if (top>98) {
				System.out.println("Stack Overflow");
			}
			else {
				item[++top]=x;
			}
		}
		
		int pop() {
			if (top<0) {
				System.out.println("Stack Underflow");
				return -1;
			}
			else {
				int x=item[top--];
				return x;
			}
		}
	}
	
	static void print(int arr[], int n) {
		int i=0; 
		stack s=new stack();
		s.top =-1;
		int ele,next;
		
		s.push(arr[0]);
		
		for (i=0;i<n;i++) {
			next=arr[i];
			System.out.println(i);
			if(s.isempty() ==false) {
				ele= s.pop();
				
				while (ele<next) {
					System.out.println(ele + " --> "+ next);
					if (s.isempty()==true) break;
					ele= s.pop();
				}
				
				if(ele>next) s.push(ele);
			}
				s.push(next);
			}
		
			while(s.isempty()== false) {
				ele=s.pop();
				next=-1;
				System.out.println(ele + " -- " + next);
			}
		}
		
	
	public static void main(String[] args) {
		int arr[]= {12,45,87,36,25,14};
		int n=arr.length;
		print(arr,n);

	}

}
