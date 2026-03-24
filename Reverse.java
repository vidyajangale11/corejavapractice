package methodprac1;

public class Reverse {

	public void checkrev() {
		int num = 9874, reverse = 0;

		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}

		System.out.println("Reverse = " + reverse);
	}
}
