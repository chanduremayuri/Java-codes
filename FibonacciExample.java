package Package1;

public class FibonacciExample {
public static void main(String[] args) {
	{
		int n1=0;
		int n2=1;
		int n3;
		int i;
		int count=10;
		System.out.println(n1+ " "+n2);
		for(i=0;i<count ;i++) 
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3; 
		}
	}
}
}
