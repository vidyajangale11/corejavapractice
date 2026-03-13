package pracdowhileloop;

public class Sumevenno {
// Sum of even numbers frm 1 to 100

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;

		do {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		} while (i <= 100);

		System.out.println("Sum of Even Numbers :- " + sum);
	}
}
