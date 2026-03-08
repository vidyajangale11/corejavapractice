package ifelsepractice2;
 // Write a program to display grade based on marks.

public class Gradecheck {
	public static void main(String args[]) {

		int marks = 94;

		if(marks >= 75) {
			System.out.println("Distinction");
		}
		else if(marks >= 60) {
			System.out.println("First Class");
		}
		else if(marks >= 50) {
			System.out.println("Second Class");
		}
		else if(marks >= 35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
