package methodprac1;

public class Fibonacci {
	 public void showfibo() {		 
		 int n = 8 ,f = 0, s = 1 , t;
		 System.out.println(f);
		 System.out.println(s);
		 for (int i =3; i<= 10; i++) {
			 t= f+s;
			 System.out.println(t);
			 f = s;
			 s = t;
		 }
	 }
}
