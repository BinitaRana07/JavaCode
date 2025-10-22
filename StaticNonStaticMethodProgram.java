package module1;

public class StaticNonStaticMethodProgram 
{
	static void country()
	{
		System.out.println("India");
	}
	static void city()
	{
		System.out.println("Rishikesh");
	}
	void name()
	{
		System.out.println("Binita Rana");
	}
	void game()
	{
		System.out.println("Cricket");
	}
	
	public static void main(String args[])
	{
		StaticNonStaticMethodProgram userDetails = new StaticNonStaticMethodProgram();
		country();
		city();
		userDetails.name();
		userDetails.game();	
	}

}
