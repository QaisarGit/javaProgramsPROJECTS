package PROJECTS;

import org.testng.annotations.Test;

public class LargestSmallestSTRINGnumbers {

	@Test
	public void largestWord() {
		
		String  str =" i ma wring a program in java programming language ";
		String words[]= str.trim().split("\s+");
		String less=words[0];
		String larger="";
		for(int i =1;i<str.length()-1;i++) {
		
		if(words.length>larger.length()) {
			larger=words[i];
			
			
		}
			
			
		}
		
		
		
		System.out.println(" largest word  >>>>>>>>> <<<<<<\n" +larger);
	}
}
