package package57;

public class string_practice {
	public static void main(String[] args)
	{
		String s="madam";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			char c=s.charAt(i);
			
			rev=rev+c;
		}
		System.out.println(s);
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("Pelindrom");
			
		}
		else
		{
		System.out.println("Not Pelindrom");
		}
	}

}
