//swapping of two integer
package Package1;
import java.util.*;
class Swap {
public static void main(String[] args) {
	int a,b,temp;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter two no");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("a="+a +"\nb="+b);
    temp=a;
    a=b;
    b=temp;
    System.out.println("After swapping:\na="+a+"\nb="+b);
    
}
}
