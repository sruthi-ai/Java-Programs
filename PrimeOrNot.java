import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();		
		boolean isPrime=false;
		if(n<2) {
			System.out.println("enter num"+n+"is not prime");
		}
		else
		{
			for(int i=2;i*i<=n;) {
				if(n%i==0) 
					isPrime=true;
				break;
				}
			if(isPrime==false) {
				System.out.println(n+"is prime");
				}
			else
			{
				System.out.println("entered num"+n+"is not prime");
				scan.close();
				}
			}
		}
}
