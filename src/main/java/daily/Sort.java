package daily;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
	
/**
 * This function sorts an array in ascending order and prints the sorted array.
 * Created By-Anup
 * 	
 */
	 public static void Ascending() {
	        // Create an array of integers
	        int[] numbers = {5, 3, 8, 1, 2, 7, 4, 6};

	        // Print the original array
	        System.out.println("Original array: " + Arrays.toString(numbers));

	        // Sort the array
	        Arrays.sort(numbers);

	        // Print the sorted array
	        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));
	    }
	 
	 /**
	  * This function sorts an array in ascending order and prints the sorted array.
	  * Created By-Anup
	  * 	
	  */ 
	    public static void Descending() {
	        // Create an array of integers (boxed as Integer objects)
	        Integer[] numbers = {5, 3, 8, 1, 2, 7, 4, 6};

	        // Print the original array
	        System.out.println("Original array: " + Arrays.toString(numbers));

	        // Sort the array in descending order
	        Arrays.sort(numbers, Collections.reverseOrder());

	        // Print the sorted array
	        System.out.println("Sorted array in descending order: " + Arrays.toString(numbers));
	    } 
	 
	 
	    public static void main(String [] args) {
	    	 Ascending();
	    	Descending();
	    }
	    
}


