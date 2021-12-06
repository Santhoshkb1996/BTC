package collectionbtc;

public class PatternTest{

    public static void main(String []args){
        printPattern(4);
    }
    
    public static void printPattern(int num){
        //Write code to print the pattern
    	//int num2=num*2;
    	//int num2=0;
    	for(int i=0;i<num;i++)
    	{
      		for(int k=num;k>num-i;k++)
       		{
		 	System.out.print("x ");	
       		}
    		for(int j=0;j<i;j++)
    		{
    			System.out.print("* ");
    		}
    		System.out.println("hello");
    	}
    	
    }
}