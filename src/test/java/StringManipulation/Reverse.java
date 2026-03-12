package StringManipulation;

import org.testng.annotations.Test;

public class Reverse {
	
	@Test(description="string builder")
	public void ReversedSB() {
		
		String str= "I am java coding language fun type guy ";
		StringBuilder sb = new StringBuilder(str);
		StringBuilder rev= sb.reverse();
		System.out.println("reversed string is \n\t"+rev);
	}

	@Test(description="using loop")
	public void ReversedLoop() {
		
		String str= "I am java coding language fun type guy ";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("reveresed string is ====  "+rev);

		
	}
} 
