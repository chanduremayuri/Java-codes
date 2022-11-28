package Package1;
import java.util.*;
class Rectangle {
public static void main(String args[]){
	float l,b,Area,Perimeter;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the length and breadth of the rectangle:");
	l=sc.nextFloat();
	b=sc.nextFloat();
	Area=l*b;
	Perimeter=2*(l+b);
	System.out.println("The area is "+Area+"\nThe perimeter is "+Perimeter);
	
}
}
