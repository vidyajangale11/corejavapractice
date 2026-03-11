package practiceswitch2;

public class Studresult {

	public static void main(String args[]) {

		char grade = 'A';

		switch (grade) {

		case 'A':
			System.out.println("Distinction");
			break;

		case 'B':
			System.out.println("First Class");
			break;

		case 'C':
			System.out.println("Second Class");
			break;

		case 'D':
			System.out.println("Pass");
			break;

		case 'F':
			System.out.println("Fail");
			break;

		default:
			System.out.println("Invalid Input");

		}

	}

}
