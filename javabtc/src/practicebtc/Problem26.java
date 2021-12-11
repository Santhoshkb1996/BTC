package practicebtc;

public class Problem26 {
	public static void main(String[] args) {

		int[] a = { 1,3,3,1, 3, 4, 5, 8 };
		System.out.println(sequenceInArray(a));
	}

	public static boolean sequenceInArray(int[] a) {
		boolean b = false;
		int n = 0;
		for (int i = 0; i < a.length - 1; i++)
		{
			if(i<a.length-3) {
			if((a[i]==1)&&(a[i+1]==2)&&(a[i+2]==3))
			{
				System.out.println("sequemce found");
				b=true;
			}
		}
		}
		return b;

	}
}