package package57;

//import java.util.Arrays;

public class Reverse_array {

	public static void main(String[] args) {
		int[] arr={10,20,30};
		String rev= " ";
		
		for(int j=arr.length-1; j>=0; j--)
		{
			rev=rev+arr[j];
			System.out.println(arr[j]+" ");
			 
		}
		System.out.println(rev+" ");
		
	

	}

}
