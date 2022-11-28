//program to find the largest of three integer accepted from thr command line
package Package1;

public class Largest {
public static void main(String[] args) {
	int n1,n2,n3,large;
	n1=Integer.parseInt(args[0]);
	n2=Integer.parseInt(args[1]);
	n3=Integer.parseInt(args[2]);
	large=(n1>n2)?n1:n2;
	large=(large>n3)?large:n3;
	System.out.println("Largest no:"+large);
}
}
//command line argument***********