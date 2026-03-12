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
}
