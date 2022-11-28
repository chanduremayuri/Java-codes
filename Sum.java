//Calculate and display ghe sum of first n natural no
package package2;
import java.util.*;
public class Sum {
public static void main(String args[]) {
	int i,n,add=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	n= sc.nextInt();
	for(i=1;i<=n;i++){
		add+=i;
	}
	System.out.println("Sum="+add);
}
}
