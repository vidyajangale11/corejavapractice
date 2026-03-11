package practiceswitch;

public class Vowel {

	public static void main(String args[]) {

		char charecter = 'a';

		switch (charecter) {

		case 'a' , 'e' , 'i', 'o','u' :
		
			System.out.println("Vowel");
			break;

		default:
			System.out.println("Consonant");

		}

	}

}
