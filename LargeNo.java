//Largest no between two no
package Package1;
import java.util.*;
class LargeNo {
	public static void main(String[] args) {
		int a,b,large;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		a=sc.nextInt();
		b=sc.nextInt();
		large=(a>b)?a:b;
		System.out.println("Largest no:"+large);
	}

}
