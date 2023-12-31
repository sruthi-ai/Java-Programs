import java.util.Scanner;

public class BitwiseOperators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values a,b,c to perform to bitwise operations");
        int a = scan.nextInt();
       int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("bitwise AND result is:"+(a&b));
        System.out.println("bitwise OR result is:"+(a|c));
        System.out.println("bitwise XOR result is:"+(a^b));
    System.out.println("bitwise LeftShift result is:"+(a<<b));
    System.out.println("bitwise Compliment result is:"+(~b));
    System.out.println("bitwise RightShift result is:"+(a>>c));
    
        scan.close();
	}

}
