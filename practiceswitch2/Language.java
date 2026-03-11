package practiceswitch2;

public class Language {
	// Write a Java program using switch case to display greeting message.

	public static void main(String args[]) {

		int lang = 3;

		switch (lang) {

		case 1:
			System.out.println("Hello");
			break;

		case 2:
			System.out.println("Namaste");
			break;

		case 3:
			System.out.println("Namaskar");
			break;

		default:
			System.out.println("Invalid Language");

		}

	}

}
