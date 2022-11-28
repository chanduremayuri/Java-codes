//Area of circle
package Package1;
import java.util.*;
public class CircleArea {
public static void main(String[] args) {
	float r,area;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius:");
	r=sc.nextFloat();
	area=3.14f*r*r;
	System.out.println("Area of circle is "+area);
}
}
