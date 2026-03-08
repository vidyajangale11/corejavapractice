package ifelsepractice2;
//check the day name based on number
public class Daynocheck {
	
		public static void main(String args[]) {

			int day = 1;

			if(day == 1) {
				System.out.println("Monday :- " + "Day No " + day );
			}
			else if(day == 2) {
				System.out.println("Tuesday :-"+ "Day No " + day);
			}
			else if(day == 3) {
				System.out.println("Wednesday :-"+ "Day No " + day);
			}
			else if(day == 4) {
				System.out.println("Thursday :-"+ "Day No " + day);
			}
			else if(day == 5) {
				System.out.println("Friday :-"+ "Day No " + day);
			}
			else if(day == 6) {
				System.out.println("Saturday :-"+ "Day No " + day);
			}
			else if(day == 7) {
				System.out.println("sunday :-"+ "Day No " + day);
			}
			else {
				System.out.println("Weekend");
			}

		}

}
