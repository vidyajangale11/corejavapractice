package com.operator;

public class IncrementDecrement {
	
	    public static void main(String[] args) {

	        int i = 90;
	        i++;                 // i = 91

	        int j = i + 9;      // j = 100

	        System.out.println(i++);  //for printing 91, then increment i = 92

	        --j;                // j = 99

	        System.out.println(j * i); // 99 * 92 = 9108

	        i++;                // i 92 the  increment i = 93
	        --i;                // i = 92

	        System.out.println(--i);  // i = 91, for printing  91

	        ++i;                // i = 92

	        System.out.println(j + 3); // 99 + 3 = 102

	        j--;                // (99) then j = 98
	        ++j;                // j = 99

	        System.out.println(j + 7); // 99 + 7 = 106

	        j--;                // j 99 then j = 98
	        i++;                // i = 93
	        --i;                // i 93 then  i = 92

	        System.out.println(i + j);   // 92 + 98 = 190
	        System.out.println(i);     // 92
	        System.out.println(j);     // 98
	  
	}

}
