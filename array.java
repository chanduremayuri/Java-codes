package Package1;
import java.util.*;

public class array {
public static void main(int[] nam) {
	int i,n,large;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the element");
	n=sc.nextInt();
	int a[]=new int[n];
	for(i=0;i<=n-1;i++){
		System.out.print("enter no:");
		a[i]=sc.nextInt();
		
	}
	large =a[0];
	for(i=0;i<=n-1;i++){
	if(large<a[i])
		large=a[i];
}
	System.out.println("largest no="+large);
}
}