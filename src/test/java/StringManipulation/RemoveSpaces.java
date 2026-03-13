package StringManipulation;

import org.testng.annotations.Test;

public class RemoveSpaces {

	@Test(description="remove spaces ")
	public void rmvSpaces() {
		
		String text = "   Java  is  fun   ";
        // The regular expression "\\s+" matches one or more whitespace characters
        String noSpaces = text.replaceAll("\\s+", "");
        System.out.println("Original string: \"" + text + "\"");
        System.out.println("String without spaces: \"" + noSpaces + "\"");
	}
	
	@Test(description="collective string manipulation")
	public void strManipulation() {  
		
		String originalStr = "  Hello World Java  ";
        System.out.println("Original String: \"" + originalStr + "\"");

        // 1. Get length of a string
        System.out.println("Length: " + originalStr.length());

        // 2. Remove leading/trailing whitespaces
        String trimmedStr = originalStr.trim();
        System.out.println("Trimmed String: \"" + trimmedStr + "\"");

        // 3. Convert to Upper/Lower Case
        System.out.println("Upper Case: " + trimmedStr.toUpperCase());
        System.out.println("Lower Case: " + trimmedStr.toLowerCase());

        // 4. Check for substring existence
        boolean containsJava = originalStr.contains("Java");
        System.out.println("Contains 'Java'? " + containsJava);

        // 5. Replace substrings
        String replacedStr = originalStr.replace("Java", "Programming");
        System.out.println("Replaced String: \"" + replacedStr + "\"");

        // 6. Split string into an array
        String sentence = "Java is awesome";
        String[] words = sentence.split(" ");
        System.out.print("Split words: ");
        for (String word : words) {
            System.out.print(word + ", ");
        }
        System.out.println();

        // 7. Concatenation using StringBuilder (efficient for many joins)
        StringBuilder sb = new StringBuilder();
        sb.append("Learning").append(" String").append(" Manipulation");
        System.out.println("StringBuilder Concatenation: " + sb.toString());

        // 8. String Formatting
        String name = "Alice";
        int age = 30;
        String message = String.format("My name is %s and I'm %d years old.", name, age);
        System.out.println("Formatted Message: " + message);
        
        System.out.println("Formatted Message: " + message);

        
        System.out.println("Formatted Message: " + message);

    
	}
}
