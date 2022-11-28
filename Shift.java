//Shift the number n bit left and display the result
package Package1;
import java.util.*;
class Shift {
public static void main(String[] args) {
	int a,n ,result;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no:");
	a=sc.nextInt();
	System.out.println("How many bit will you want to shift the no");
	n=sc.nextInt();
	result=a<<n;
	System.out.println("After shifting:\na="+a+"\nResult="+result);
	
	
}
}
