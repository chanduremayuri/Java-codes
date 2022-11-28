//accept two and display the result of their AND,OR,EXOR,NOT operation 
package Package1;
import java.util.*;
public class BitwiseOperator {
public static void main(String[] args) {
	int a,b;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter two no:");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("After ANDing:"+(a&b)+"\nAfter ORing: "+(a|b)+"\nAfter EXORing: "+(a^b)+"\nNOT of a :"+(~a)+ "\nNOT of b: "+(~b));
	
}
}
