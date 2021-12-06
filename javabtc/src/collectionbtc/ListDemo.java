package collectionbtc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;


public class ListDemo {

	public static void main(String[] args) {
		
		List items = new ArrayList();
		List<Integer> items1 = new ArrayList<>();
		
		items1.add(10);
		
		items1.add(20);
		items1.add(5);

		items1.add(15);
		
		Collections.sort(items1);
		
		items.add(10);
		
		items.add("Hello");
		items.add(true);

		items.add(1,28.39);
		
//		items.remove(2);
		
		items.remove("Hello");
		items.remove((Object)10);
		
		System.out.println("Size = "+items.size());

// Approach 1		
		
		for(Object item:items) {
			System.out.println(item);
		}
		for(int item:items1) {
			System.out.println(item);
		}
//		System.out.println(items.get(2));
	//	Iterator iterator=items.iterator();
		
		//while(iterator.hasNext()) {
			//System.out.println(iterator.next());
		//}

	}

}