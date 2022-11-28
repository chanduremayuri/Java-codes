package Package1;
import java.io.*;
class SquareBuffer {
public static void main(String args[])throws IOException {
	int a,b;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str;
	System.out.println("\nEnter a number:");
	str=br.readLine();
	a=Integer.parseInt(str);
	b=a*a;
	System.out.println("The square of entered no:"+b);
}
}
//SQUARE OF NO USING BUFFEREDREADER CLASS