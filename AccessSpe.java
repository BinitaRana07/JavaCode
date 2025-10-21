//Assign 36 : WAP to demonstrate access Specifier outside the package
package package57;

import packageNew.AccessSpePro1;
//import packageNew.AccessSpePro2;

public class AccessSpe extends AccessSpePro1 {
	public static void main(String[] args)
	{
		AccessSpePro1.method1();//public 
		AccessSpePro1.method2();// protected 
	}

}
