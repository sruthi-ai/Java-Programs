import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the two numbers for the mentioned operations");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int res1 = a+b;
		System.out.println("addition result is"+" "+res1);
		int res2= a-b;
		System.out.println("subtraction result is"+" "+res2);
		int res3 = a*b;
		System.out.println("multiplication result is"+" "+res3);
		int res4 = a/b;
		System.out.println("division result is"+" "+res4);
		int res5 = a%b;
		System.out.println("modulus result is"+" "+res5);
	System.out.println("hiphop hurry done with the programs");
	scan.close();

	}

}
