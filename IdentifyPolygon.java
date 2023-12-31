import java.util.Scanner;

public class IdentifyPolygon {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the num of sides to check whether they belong to triangle or quadrilateral or pentagon or hexagon");
 int sides = scan.nextInt();
 identifypolygon(sides);
 scan.close();
	}
public static void identifypolygon(int sides) {
	switch(sides) {
	case 1:
		System.out.println("pointer line");
		break;
	case 2:
		System.out.println("line");
		break;
	case 3:
		System.out.println("triangle");
		break;
	case 4:
		System.out.println("quadrilateral");
		break;
	case 5:
		System.out.println("pentagon");
		break;
	case 6:
		System.out.println("hexagon");
		break;
	default:
			System.out.println("polygon");
	}
}
}
