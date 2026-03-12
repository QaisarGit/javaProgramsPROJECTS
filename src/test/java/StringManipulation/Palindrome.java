package StringManipulation;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Palindrome {
	//@Test
	public void  palindrome() {
		
		String str = "Radar";
		String reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) { 
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
		
	}
	
	@Test (description="loop reverse string")
	public void palindromeLoop() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first string ");
		String str1= sc.next();
		System.out.println("ur frst str is  \n\t"+str1);
		//System.out.println("enter second  string ");
		//String str2= sc.next();
		//System.out.println("your second string is  \n\t"+str2);
		String Lostr1=str1.toLowerCase();
		//String lostr2=str2.toLowerCase();
		String rev= "";
		for(int i =(str1.length()-1);i>=0;i--) {
			rev=rev+str1.charAt(i);
			
			
		}
		
		System.out.println("reversed string is " +rev);
		if(str1.equals(rev)) {
			System.out.println("this is a palindrome"+str1);
		}
		else
		{
			System.out.println("NOT  A PALINDROME ");
		}
	}

}
