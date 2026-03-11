package practiceswitch2;

public class Season {
// Write a Java program using switch case to print season.
	
	

	    public static void main(String args[]) {

	        int month = 1;

	        switch(month) {

	        case 12,1,2:
	        
	            System.out.println("Winter");
	            break;

	        case 3,4,5:
	        
	            System.out.println("Summer");
	            break;

	        case 6,7,8,9:
	       
	            System.out.println("Monsoon");
	            break;

	        case 10, 11:
	            System.out.println("Autumn");
	            break;

	        default:
	            System.out.println("Invalid Input");

	        }

	    }

	}

