package package2;
import java.util.*;
public class Series3 {
public static void main(String[] args) {
	int i,n,sign=1;
	 float sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value:");
	n=sc.nextInt();
	for(i=1;i<=n;i++){
		sum=sum+1.0f/i*sign;
		sign=sign*-1;
	}
	System.out.println("SUM:"+sum);
}
}
