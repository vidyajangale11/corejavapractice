package practiceswitch2;

public class Password {

	public static void main(String args[]) {

		int level = 1;

		switch (level) {

		case 1:
			System.out.println("Weak Password");
			break;

		case 2:
			System.out.println("Medium Password");
			break;

		case 3:
			System.out.println("Strong Password");
			break;

		default:
			System.out.println("Invalid Level");

		}

	}

}
