package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamDemo {

	
	public static void main(String[] args) {
		
		List <Integer> items=Arrays.asList(10,20,15,35,25);
		List<String> name=Arrays.asList("Aksh","akki","Hardhik","Gourav","Abhi");
		
		// Find even numbers
		
		// Square of the numbers
		
		// Add the squares
		
		name.stream().filter(item->{
			if(item.startsWith("A")||item.startsWith("a"))
			{
				return true;
				//System.out.println(item);
			}
			return false;
		}).forEach(System.out::println);
		
		//item square
		int result = items.stream().filter(item->{
			if(item%2==0) {
				return true;
				}
			return false;
			})
			.mapToInt(item->item*item).sum();
		
//		int result = items.stream().filter(item->{
//			if(item%2==0) {
//				return true;
//				}
//			return false;
//			})
//			.map(item->item*item).reduce((value1,value2)->value1+value2).get();
//		
		System.out.println(result);
		
	}
	
	
}