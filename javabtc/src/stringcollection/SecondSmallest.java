package stringcollection;


public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={4,5,2,1,6,7,9};
		System.out.println("Array.. ");
		for(int i=0;i<arr.length;i++) {
			System.out.print("    "+arr[i]);
		}
		System.out.println();
		int secondSmall=secondSmallest(arr);
		System.out.println("Second smallest.. ");
		
		System.out.println(secondSmall);
		

	}
	public static int secondSmallest(int []arr)
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		return arr[1];
	}

}
