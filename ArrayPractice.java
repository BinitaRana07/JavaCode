package package57;

import java.util.Arrays;

public class ArrayPractice {
	public static void main(String[] args)
	{
		int[] arr1=new int[3];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		int[] arr2=new int[arr1.length];
 		for(int i=0,j=2; i<3;i++,j--)//revers array
		{
			arr2[j]=arr1[i];
			
			
		}
		String arr= Arrays.toString(arr1);
		System.out.println(arr);
		String arr3= Arrays.toString(arr2);
		System.out.println(arr3);
			
	}
	

}
