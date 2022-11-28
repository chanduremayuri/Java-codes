//Accept the two digit no as command line argument and display the 2 digit seperayely
package Package1;

public class TwoDigit {
public static void main(String args[]) {
	int no,d1,d2;
	no=Integer.parseInt(args[0]);
	d2=no%10;
	d1=no/10;
	System.out.println("Digit 1:"+d1+" Digit 2:"+d2);
}	
}
//To pass arguments goto -run-run configuration -pass argument -apply -run
