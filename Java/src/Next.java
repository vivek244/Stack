
public class Next {
	
	int size ,top; 
	char [] a;
	boolean isempty() {
	    return (top<0);
	}
	
	public Next(int n) {
		top=-1;
		a= new char[size];
		size=n;
	}
	
	boolean push(char x) {
		if(top>=size) {
			System.out.println("Overflow");
			return false;
		}
		else {
			a[++top]=x;
			return true;
		}
	}
	
	char pop() {
		if (top<0) {
			System.out.println("Underdflow");
			return 0;

		}
		else {
			char x= a[top--];
			return x;
		}
	}}
	
	 class Main{
		private static void reverse(StringBuffer str) {
			int n=str.length();
			Stack obj=new Stack();
			for(int i=0;i<n;i++) {
				obj.push(str.charAt(i));		
			}
			
			for(int i=0;i<n;i++) {
				char ch =(char) obj.pop();
				str.setCharAt(i, ch);
			}
		}
	

	public static void main(String args[])
    {
        StringBuffer s= new StringBuffer("GeeksQuiz");  
        reverse(s);
          
        System.out.println("Reversed string is " + s);
    }

	}
	

