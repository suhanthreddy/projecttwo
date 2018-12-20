package practice1;

import java.util.Scanner;

public class Firstcharacterisdigitlastchacterisalphabet 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String x=sc.nextLine();
		//String line = "x";
        String firstLetter = String.valueOf(x.charAt(0)); //line had 0 to n string index
        char first = firstLetter.charAt(0);
         /*
         if (Character.isLetter(first)) //for alphabets
         if (Character.isSpaceChar(first)) //for spaces
        */
        if (Character.isDigit(first))  // for Digits
        {
            int number = Integer.parseInt(firstLetter);
            System.out.println("First characcter of the string is Digit: "+number);
        }
        else
        {
            System.out.println("First characcter of the string is Letter: "+firstLetter);
        }
        String lastLetter = String.valueOf(x.charAt(x.length()-1)); //line had 0 to n string index
        char Last = lastLetter.charAt(x.length()-1);
         
         //if (Character.isLetter(Last)) //for alphabets
         //if (Character.isSpaceChar(first)) //for spaces
        if (Character.isDigit(Last))  // for Digits
        {
        	int number = Integer.parseInt(lastLetter);
        	System.out.println("last characcter of the string is Digit: "+number);
            
        }
        else
        {
        	System.out.println("last characcter of the string is Letter: "+lastLetter);
        }
        
        
        
	}

}
