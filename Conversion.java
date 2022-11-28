package Package1;

public class Conversion {
	public static void main(String args[]){
		byte b;
		int i=500;
		float f=123.942f;
		System.out.println("\nConversion of float to byte");
		b=(byte)f;
		System.out.println("\nFloat was " + f + " and byte is "+b);
		System.out.println("\nConversion of float to byte");
		f=i;
		System.out.println("\nInteger was " + i +" and float is "+f);
	}
}
