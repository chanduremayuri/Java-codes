//Display odd no
package package2;
import java.util.*;
public class OddNumber {
public static void main(String[] args) {
	int i,n;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the value of n:");
	n =sc.nextInt();
	for(i=1;i<=2*n;i+=2){
		
		System.out.println(i);
	}
	
	
}
}
