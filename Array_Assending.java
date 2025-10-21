//Array [10,60,3,24,1] print in an ascending order
package package57;

import java.util.Arrays;

public class Array_Assending {

	public static void main(String[] args) {
		int[] arr= {10,60,3,24,1};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<=arr.length-1; j++)
			{
			   if(arr[i]>arr[j])
			   {
				  int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			   }
				
			}	
		}
		
		 String output = Arrays.toString(arr);
	        System.out.println(output);
	}

}
