package practicebtc;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
  public static void main(String args[])
  {
	  List<Integer>list1=new ArrayList<>();
	  List<Integer>list2=new ArrayList<>();
	  List<Integer>output1=new ArrayList<>();
	  

	  list1.add(1);
	  list1.add(2);
	  list1.add(3);
	  list1.add(4);
	 // list1.add(6);
		 
	  list2.add(1);
	  list2.add(2);
	  list2.add(3);
	  list2.add(5);
	  System.out.println();
	  int length1=list1.size();
	  int length2=list2.size();
	 // System.out.println("hello");
//	  int j=0;
//	  int value2=list2.get(j);
//	  System.out.println(value2);
	  for(int i=0;i<length2;i++)
	  {
		  int value=list2.get(i);
		 // System.out.println(value);
		  if(list1.contains(value))
		  {
			 // System.out.println(value);
		  }
		  else {
			  //System.out.println(value);
			  output1.add(value);
		  }
	  }
	  for(int i=0;i<length1;i++)
	  {
		  int value=list1.get(i);
		 // System.out.println(value);
		  if(list2.contains(value))
		  {
			 // System.out.println(value);
		  }
		  else {
			  //System.out.println(value);
			  output1.add(value);
		  }
	  }
	  output1.forEach((v)->System.out.print(v+" "));
	  }
  }

