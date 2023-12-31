import java.util.Scanner;

public class Discounttt {
public static void checkDiscount(double PurchaseAmount) {
	if(PurchaseAmount>1000) {
		System.out.println("congrats discount Applicable");
	}else{
		System.out.println("oops sorry discount not applicable");}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter purchaseAmount");
		double purchaseAmount = scan.nextDouble();
		checkDiscount(purchaseAmount);
		scan.close();
	}

}
