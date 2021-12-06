package stringcollection;


public class ReverseArraySum {
	public static void main(String[] args)
	{
		int[] arr={4,5,2,1,6,7,9};
		int n=0;
		int []arrRev=new int[arr.length];
		System.out.println("Before reversing.. ");
		for(int i=0;i<arr.length;i++) {
			System.out.print("    "+arr[i]);
		}
		for(int i=arr.length-1;i>0;i--)
		{
			arrRev[n]=arr[i];
			n++;
		}
		
		System.out.println("\nAfter reversing.. ");
		for(int i=0;i<arrRev.length;i++) {
			System.out.print("    "+arrRev[i]);
		}
		int[] revArrSort=reverseArraySorted(arrRev);
		System.out.println("\nAfter Sorting.. ");
		for(int i=0;i<revArrSort.length;i++) {
			System.out.print("    "+revArrSort[i]);
		}
		System.out.println();


	}
	public static int[] reverseArraySorted(int []arrRev)
	{
		int n=arrRev.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arrRev[j]<arrRev[min])
				{
					min=j;
				}
			}
			int temp=arrRev[i];
			arrRev[i]=arrRev[min];
			arrRev[min]=temp;
		}
		return arrRev;
	}
	

}

