package StringManipulation;

import org.testng.annotations.Test;

public class DuplicateCharacters {
	
	@Test(description="duplicates char")
	public void dupChar() {
		
		char[] arr = {'a','b','c','a','d','b','e','e'};
        int n = arr.length;

        for(int i = 0; i < n; i++) {
 
            for(int j = i + 1; j < n; j++) {

                if(arr[i] == arr[j]) {
                    arr[j] = ' ';
                   // System.out.println(arr[j]);

                }
            }
        }

        System.out.print("After removing duplicates: \n\t");

        for(int i = 0; i < n; i++) {
            if(arr[i] != ' ') 
                System.out.print(arr[i] + " ");
        }
	}
	

}
