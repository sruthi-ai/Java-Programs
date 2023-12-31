import java.util.Scanner;

public class UnaryIncrement2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values a,b:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		b=++a+b--+--a+--a+--b+b--;
		System.out.println(a);
		System.out.println(b);
		scan.close();
	}

}
