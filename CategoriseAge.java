import java.util.Scanner;

public class CategoriseAge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age to check whether the age belongs to child or teen or adult or senior");
        int n = scan.nextInt();
        CategoriseAge(n);
          scan.close();
	}
	public static void CategoriseAge(int n) {
		if(n>=1 && n<=12) {
			System.out.println("child");
		}
		else if(n>=13 && n<=19) {
			System.out.println("teen");
		}
		else if(n>=20 && n<=59) {
			System.out.println("adult");
		}
		else {
			System.out.println("senior");
		}}}
