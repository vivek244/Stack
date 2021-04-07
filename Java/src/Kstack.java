
public class Kstack {
	
	int arr[],n, k , free, top[], next[];
	
	public Kstack(int n1,int k1) {
		n=n1;
		k=k1;
		next=new int[n];
		top=new int[n];
		arr=new int[n];
		for (int i=0;i<k;i++) top[i]=-1;
		free=0;
		for(int i=0;i<n;i++)
			next[i]=i+1;
		next[n-1]= -1;
	}
	
	boolean isfull() {
		return (free == -1);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
