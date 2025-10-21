package package57;

import java.util.Arrays;

public class AnagramProgram
{
	public static void main(String[] args)
	{
		String s1= "arm";
		String s2= "ram1";
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagram");
		}
		else
		{
			char[] c1= s1.toCharArray();
			char[] c2= s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
 		}
		
		
	}
	
}
