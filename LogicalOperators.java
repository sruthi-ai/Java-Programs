import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values a ,b,c to perform logical operations:");
		boolean a = scan.nextBoolean();
		boolean b = scan.nextBoolean();
		boolean c = scan.nextBoolean();
System.out.println("logical AND result is:"+(a&&b));
System.out.println("logical OR result is:"+(a||c));
System.out.println("logical AND result is:"+(c&&b));
System.out.println("logical AND result is:"+(a||b));
scan.close();
	}

}
