import java.util.Scanner;

public class ComparisonOperator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values a,b,c,d, to perform the operations");
		int a =scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		System.out.println("equal to:"+(a==b));
		System.out.println("not equal to:"+(b!=c));
		System.out.println("lesser than:"+(c<b));
		System.out.println("greater than:"+(d>a));
		System.out.println("lesser than or equal to:"+(a<=b));
		System.out.println("greater than or equal to:"+(c>=d));
		System.out.println("done with the operations cheers");
		scan.close();
	}

}
