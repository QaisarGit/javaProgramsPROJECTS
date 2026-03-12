package PROJECTS;

import org.testng.annotations.Test;

public class LargestSmallestSTRINGnumbers {

	@Test(description="smallest", priority=1)
	public void smallest() {

		String str = " immmm mammm wring asss program in java programming language ";
		String word[] = str.trim().split("\\s+");
		System.out.println("word array "+word);
		
      //  System.out.println("new "+(new String(word))); 


		String small = word[0];
		for (int i = 0; i < word.length; i++) {
			if (word[i].length() < small.length()) {
				small = word[i];
			}
		}
		System.out.println("smallest word is ---------- \n\t"+small); 
	}

	@Test(description = "largest word", priority=2)
	public void largest() {
		String str = " immmm mam wring asss program in java programming language ";
		String word[]=str.trim().split("\\s+");
		String large="";
		//String large=word[0];
		for(int i =1;i<word.length;i++) {
			if(word[i].length()>large.length()) {
				large=word[i];
				
				
			}
			
			
		}
		System.out.println("largestes word ============  \n \t"+large);
		
	}

}
