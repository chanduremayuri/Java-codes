package Package1;
import java.util.*;
class SimpleInterest {
public static void main(String args[]){
	float p,si,n,r;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter principal amount,no of year,rate of interest:");
	p=sc.nextFloat();
	n=sc.nextFloat();
	r=sc.nextFloat();
	si=p*n*r/100;
	System.out.println("The simple interest: "+si);
	
}
}
