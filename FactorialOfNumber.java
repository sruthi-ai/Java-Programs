import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the input N");
		int N = scan.nextInt();
		int factorial = 1;
		for(int i=1;i<=N;i++) {
			factorial = factorial*i;
		}
System.out.println(factorial);
scan.close();
	}

}
