package package57;

public class Array_largest {

	public static void main(String[] args) {
		int[] arr= {100,20,10,80};
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
				
		}
		System.out.println(max);

	}

}
