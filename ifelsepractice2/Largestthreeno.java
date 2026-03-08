package ifelsepractice2;
//check the large number between three number.
public class Largestthreeno {
	public static void main(String args[]) {

		int a = 10;
		int b = 25;
		int c = 15;

		if(a>b && a>c) {
			System.out.println("A: " + a +" is Largest");
		}
		else if(b>a && b>c) {
			System.out.println("B: " + b +" is Largest");
		}
		else {
			System.out.println("C: " + c + " is Largest");
		}

	}

}
