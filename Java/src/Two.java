

public class Two {
	
	int size,top1,top2,arr[];
	Two(int n) {
		size=n;
		top1=-1;
		top2=size;
		arr =new int[n];
	}
	
	void push1(int x) {
		if(top1<top2 -1) {
			top1++;
			arr[top1]=x;
		}
		else {
			System.out.println("overflow ");
		}
	}
	void push2(int x) {
		if(top1<top2 -1) {
			top2--;
			arr[top2]=x;
		}
		else {
			System.out.println("overflow ");
		}
	}
	
	int pop1() {
		if(top1>=0) {
			int x=arr[top1];
			top1--;
			System.out.println(x + " popped element from stack 1");
		}
		else {
			System.out.println("Stack underflow");
		}
		return 0;
	}
	
	int pop2() {
		if(top2<size) {
			int y=arr[top2];
			top2++;
			System.out.println(y + " popped element from stack 2");
		}
		else {
			System.out.println("Stack underflow");
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Two t=new Two(5);
		t.push1(10);
		t.push2(100);
		t.push1(15);
		t.push2(20);
		t.push2(5);
		t.push1(50);
		t.pop1();
		t.pop2();
		
	}
	

}
