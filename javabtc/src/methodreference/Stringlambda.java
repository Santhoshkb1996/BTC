package methodreference;

import java.util.Arrays;
import java.util.List;

public class Stringlambda {

	
	public  String modifyString(String str) {
		return str+"....";
	}
	
	public static void main(String[] args) {
		
		List<String> strList=Arrays.asList("Rahul","Mahesh","Tushar");
		
		strList.stream().map(new MethodReferenceDemo()::modifyString).forEach(System.out::println);
		
	}
	
}