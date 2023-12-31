import java.util.Scanner;

public class CheckMultipleofTwoparameters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two parameters");
		int n = scan.nextInt();
		int m = scan.nextInt();
		checkMultipleOftwoparamters(n,m);
		scan.close();
	}
	public static void checkMultipleOftwoparamters(int n,int m)
	{
		if(n%m==0) {
			System.out.println("entered num"+n+"is multiple of"+m);
		}else {
			System.out.println("entered num"+n+"is not a multiple of"+m);}
		}
}