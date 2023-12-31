import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the product code");
		String code = scan.next();
		getProduct(code);
		scan.close();
	}
	public static void getProduct(String Productcode) {
		switch(Productcode) {
		case "301":
			System.out.println("coco-cola");
			break;
		case "302":
			System.out.println("pep-si");
			break;
		case "303":
			System.out.println("maaza");
			break;
			default:
				System.out.println("cool-drink");
		}

}}
