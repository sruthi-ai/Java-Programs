import java.util.Scanner;

public class SumOfNaturalnumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the input");
		int N = scan.nextInt();
		int sum = 0;
		for(int i=0;i<=N;i++) {
			sum = sum+i;
			
		}
		System.out.println(sum);
		scan.close();
	}

}
