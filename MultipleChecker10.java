import java.util.Scanner;

public class MultipleChecker10 {
	public static void checkMultipleOfTen(int n) {
		if(n%10==0) {
			System.out.println("entered num"+n+"is multiple of 10");}
		else {
			System.out.println("entered num"+n+"is not a multiple of 10");
		}

}
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter  the number");
		int n = scan.nextInt();
		checkMultipleOfTen(n);
scan.close();
	}}
	
