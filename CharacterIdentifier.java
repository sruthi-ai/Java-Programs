import java.util.Scanner;

public class CharacterIdentifier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number to check whther the netered num is digit or vowel or consonant ");
       char ch=scan.next().charAt(0);
       identifyCharacter(ch);
       scan.close();
	}
 public static void identifyCharacter(char ch) {
	 if(Character.isDigit(ch)) {
		 System.out.println("entered character"+ch+"is digit");
	 }
	 else if(!Character.isLetter(ch)) {
		 System.out.println("entered character"+ch+"is special symbol");
	 }
	 else {
		 switch(Character.toLowerCase(ch)){
		 case 'a':
		 case 'e':
		 case 'i':
		 case 'o':
		 case 'u':
			 if(Character.isLowerCase(ch)) {
				 System.out.println("entered character"+ch+"is a lower case vowel");
			 }
			 else {
				 System.out.println("entered character"+ch+"is a upper case vowel");
			 }break;
			 default:
				 if(Character.isLowerCase(ch)) {
					 System.out.println("entered character"+ch+"is a lower case consonant");
			 }
				 else {
					 System.out.println("entered character"+ch+"is a upper case consonant");
				 }
		 }
	 }
 }
}
