import java.util.Scanner;

public class Datatypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the data type values");
		char a = scan.next().charAt(0);
		byte b = 10;
		short c = 2220;
		int d = scan.nextInt();
		long e = scan.nextLong();
		float f = scan.nextFloat();
	    double g = scan.nextDouble();
	    boolean h = scan.nextBoolean();
	    System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
	     scan.close();

	}

}
