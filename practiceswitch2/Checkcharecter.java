package practiceswitch2;

public class Checkcharecter {
// Write a Java program using switch case to check whether a character is:

	    public static void main(String args[]) {

	        char ch = 'V';

	        switch(ch) {

	        case 'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
	        'O','P','Q','R','S','T','U','V','W','X','Y', 'Z':
	            System.out.println("Uppercase");
	            break;

	        default:
	            System.out.println("Lowercase");

	        }

	    }

	}

