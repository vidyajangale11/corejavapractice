package practiceswitch2;

public class Weekday {
	// Write a Java program using switch case to print operation name.

		public static void main(String args[]) {

			int day = 6;

			switch (day) {

			case 1, 2, 3, 4, 5:

				System.out.println("Weekday");
				break;

			case 6, 7:

				System.out.println("Weekend");
				break;
				
			 default:
		            System.out.println("Invalid Input");


			}

		}

	}


