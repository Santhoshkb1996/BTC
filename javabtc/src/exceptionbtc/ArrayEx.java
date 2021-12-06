package exceptionbtc;

public class ArrayEx {
public static void main(String[] args)
	{
	//int a1;	
	int a[]= {1,2,3,4,5};
		for(int i=0;i<=a.length;i++)
		{
			try 
			{
			System.out.println(a[i]);
			//System.out.println();
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array size max");
			}
		}
	}
}
