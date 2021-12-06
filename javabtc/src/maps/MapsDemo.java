package maps;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> numbers=new HashMap<>();
		
		numbers.put(1, "One");
		numbers.put(2, "Two");
		numbers.put(3, "Three");
		
		
		String numString = numbers.get(2);
		System.out.println(numString);
		
	}
	
}