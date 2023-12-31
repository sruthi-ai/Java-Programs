import java.util.Scanner;

public class DiscountApplicablernot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the purchaseAmount ");
		double n = scan.nextDouble();
		if(n>1000) {
			System.out.println("Discount Applicable");
		}else {
			System.out.println("oops sorry discount is only applicable above 1000$");
		}scan.close();
	}

}
