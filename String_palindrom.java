package package57;

public class String_palindrom {
	public static void main(String[] args)
	{
		String s1= "Madam";
		String rev="";
		
		for(int i=s1.length()-1; i>=0;i--)
		{
			char[] c= s1.toCharArray();
			rev=rev+c[i];
		}
		System.out.println(rev);
		if(s1.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not pelindrom");
		}
	}

}
