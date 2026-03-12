package StringManipulation;

import java.util.Arrays;

import org.testng.annotations.Test;

public class anagrams {
	
	@Test
	public void anagramsStr() {
		
		 String str1 = "listen";
	        String str2 = "silent";

	        // Convert strings to lowercase
	        str1 = str1.toLowerCase();
	        str2 = str2.toLowerCase();

	        // Convert to character array
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray(); 

	        System.out.println("array 1 is =========\n\t"+arr1.toString()); 
	        System.out.println(new String(arr1)); 
	        // Sort both arrays
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        System.out.println(" sorted array 1 is =========\n\t"+arr1.toString()+"\n new string \n"+(new String(arr1))); 

	        // Compare arrays
	        if(Arrays.equals(arr1, arr2)) {
	            System.out.println("Strings are Anagrams");
	        } else {
	            System.out.println("Strings are NOT Anagrams");
	        } 
	    }
	
	}


