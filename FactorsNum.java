import java.util.Scanner;

public class FactorsNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter N input");
		int N = scan.nextInt();
		for(int i=1;i<=N;i++) {
			if(N%i==0) {
			System.out.println("factors of i are"+i);
		}
		
		scan.close();
	}

}}
