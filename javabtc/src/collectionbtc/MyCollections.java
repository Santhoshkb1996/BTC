package collectionbtc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MyCollections {

	public static void main(String[] args) {
		
		Collection items = new LinkedList();
		
		items.add(10);
		items.add("Hello");
		items.add(true);
		items.add(28.39);

// Approach 1		
		
//		for(Object item:items) {
//			System.out.println(item);
//		}

		
// Approach 2		
//		Iterator iterator=items.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
// Approach 3
		
		items.forEach(item->System.out.println(item));
		

	}

}