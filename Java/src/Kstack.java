
public class Kstack {
	
	int arr[],n, k , free, top[], next[];
	
	public Kstack(int k1,int n1) {
		n=n1;
		k=k1;
		next=new int[n];
		top=new int[n];
		arr=new int[n];
		for (int i=0;i<k;i++) 
			top[i]=-1;
		free=0;
		for(int i=0;i<n;i++)
			next[i]=i+1;
		next[n-1]= -1;
	}
	
	boolean isfull() {
		return (free == -1);
	}
	
	void push(int item,int sn) {
		if (isfull()) {
			System.out.println("Overflow");
			return ;
		}
		int i=free;
		free=next[i];
		next[i]=top[sn];
		top[sn]= i;
		arr[i]=item;
	}
	
	int pop(int sn) {
		if (isEmpty(sn)) {
			System.out.println("Underflow");
			return Integer.MAX_VALUE;
		}
		int i=top[sn];
		top[sn]= next[i];
		next[i]=free;
		free=i;
		return arr[i];
	}
	
	 boolean isEmpty(int sn) 
     {
         return (top[sn] == -1);
     }
	

	public static void main(String[] args) {
		Kstack k=new Kstack(4, 10);
		k.push(14, 2);
		k.push(12, 1);
		k.push(20, 0);
		k.push(10, 0);
		k.push(18, 1);
		System.out.println("Popped element from stack 2 is " + k.pop(2));
        System.out.println("Popped element from stack 1 is " + k.pop(1));
        System.out.println("Popped element from stack 0 is " + k.pop(0));

	}

}
