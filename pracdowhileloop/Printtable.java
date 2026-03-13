package pracdowhileloop;

public class Printtable {
// print table of any number
	public static void main(String[] args) {

		int n = 7;
		int i = 1;

		do {
			System.out.println(n + " x " + i + " :- " + (n * i));
			i++;
		} while (i <= 10);

	}
}
