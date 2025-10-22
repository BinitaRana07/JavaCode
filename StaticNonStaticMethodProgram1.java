package module1;

public class StaticNonStaticMethodProgram1 {
	
	static void add()
	{
		System.out.println("Add:" + (10+10));
	}
	static void sub()
	{
		System.out.println("Sub:" + (20-10));
	}
	void mult()
	{
		System.out.println("Multi:" + (10*2));
	}
	void div()
	{
		System.out.println("Div:" + (20/10));
	}
	public static void main(String args[])
	{
		add();
		sub();
		
		StaticNonStaticMethodProgram1 multi = new StaticNonStaticMethodProgram1();
		multi.mult();
		
		StaticNonStaticMethodProgram1 div1 = new StaticNonStaticMethodProgram1();
		div1.div();
	}

}
