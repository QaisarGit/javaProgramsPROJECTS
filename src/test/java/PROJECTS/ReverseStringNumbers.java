package PROJECTS;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ReverseStringNumbers {

	// @Test(description="using string builder")
	public void reversedSTRING() {
		System.out.println("reversed word ");
		String str = "I write a program that match the requirements";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("reversed str is ==\n" + sb);

	}

	// @Test(description = "using for loop")
	public void reversedStringLoop() {
		System.out.println("using  for loop ");
		String str = "I write a program that match the requirements";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		System.out.println(rev);
	}

	//@Test(description = "reversed  order words in a sentance")
	public void reveredWordOrder() {
		String str = "I wrote many books and articles";

		String[] words = str.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}

	}
	@Test(description="reversed word")
public void reversedWords() {
		System.out.println("reversed words in a row");
String sentence = "cat dog apple";
        
        String[] words = sentence.split(" ");
        
        // Reverse each word
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
       
        // Sort in ascending order
        Arrays.sort(words);
        
        for (String word : words) {
            System.out.print(word + " ");
            System.out.println("just to add ");
        }
		
	}
}
