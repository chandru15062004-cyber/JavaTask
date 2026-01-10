package org.lo;



public class StringRepeated {
//	 public static void main(String[] args) {
//	        String str = "Apple";
//	        str = str.toLowerCase();
//
//	        // Array to hold counts for each character (ASCII size)
//	        int[] count = new int[256];
//
//	        // Count each character
//	        for (int i = 0; i < str.length(); i++) {
//	            char c = str.charAt(i);
//	            if (c != ' ') { // ignore spaces
//	                count[c]++;
//	            }
//	        }
//
//	        // Print repeated characters
//	        System.out.println("Repeated characters in \"" + str + "\":");
//	        for (int i = 0; i < count.length; i++) {
//	            if (count[i] > 1) {
//	                System.out.println((char) i + " → " + count[i]);
//	            }
//	        }
//	    }
	
	
	
	
	public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 7, 5, 9, 1, 3,1,5,8,8};

        System.out.println("Duplicate numbers are:");

        // Compare each number with the rest
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    break; // avoid printing the same number multiple times
                }
            }
        }
    }
}
