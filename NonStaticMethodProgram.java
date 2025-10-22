package module1;

public class NonStaticMethodProgram {
	
	void add()
	{
		int a=2;
		int b=4;
		System.out.println(a+b);
	}
	public static void main(String args[])
	{
		NonStaticMethodProgram add1 = new NonStaticMethodProgram();
		add1.add();
	}
}
