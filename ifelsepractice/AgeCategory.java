package ifelsepractice;

public class AgeCategory {
	// Check the user is child, teenager, adult or senior citizen based on age.
	public static void main(String args[]) {

		int age = 22;

		if(age < 13) {
			System.out.println("CHILD" + " Because user age is :-" + age);
		}
		else if(age < 20) {
			System.out.println("TEENAGER" + " Because user age is :-" + age);
		}
		else if(age < 60) {
			System.out.println("ADULT" + " Because user age is :-" + age);
		}
		else {
			System.out.println("SENIOR CITIZEN" + " Because user age is :-" + age);
		}
		
		System.out.println("WE ARE CHECKING USER IS ADULT, CHILD, TEENAGER, OR SENIOR CITIZEN BASED ON THEIR AGE");

	}


}
