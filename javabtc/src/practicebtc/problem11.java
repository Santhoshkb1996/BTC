package practicebtc;

public class problem11 {
	 public static int[] retrievePos(int[] arr1,int[] arr2){
	  int[] c=new int[arr1.length];
	  int i;
	  for(i=0;i<arr1.length;i++){
	   if(i%2==0)
	    c[i]=arr2[i];
	   if(i%2!=0)
	    c[i]=arr1[i]; }
	  return c;
	 }
	 public static void main(String[] args) {
	  int[] arr1={12,1,32,3};
	  int[] arr2={0,12,2,23};
	  int[] arr3=retrievePos(arr1,arr2);
	  for(int i:arr3)
	   System.out.println(i);
	 }
}
