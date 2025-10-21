package package57;

import java.util.Arrays;
import java.util.Scanner;

public class String_findSpecial {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter the string:");
		String s1=s.nextLine();
		
		int alpha=0, digit=0, spec=0, spcl=0;
		
		for(int i=0; i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if((c>='a' && c<='z')||(c>='A' && c<='Z'))
			{
				alpha++;
			}
			else if((c>='0' && c<='9'))
			{
				digit++;
			}
			else if(c==' ')
			{
				spec++;
			}
			else
			{
				spcl++;
			}
		}
		System.out.println("Alphabates "+alpha);
		System.out.println("Digits "+digit);
		System.out.println("Space "+spec);
		System.out.println("Special "+spcl);
	}

}
