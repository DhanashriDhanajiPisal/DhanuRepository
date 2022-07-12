package arryList;

import java.util.Iterator;
import java.util.LinkedList;

public class linked {

	public static void main(String[] args) {
LinkedList ll= new LinkedList();
		
		ll.add("Pune");
		ll.add("Pune");
		ll.add(null);
		ll.add(null);
		ll.add(123);
		ll.add(12.12);
		ll.add('A');
		ll.add(true);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll.get(3));
		System.out.println(ll.remove());
		System.out.println(ll);
		
		for(int k=0;k<=ll.size()-1;k++)
		{
			
			System.out.println(ll.get(k));
		}

		Iterator itr =ll.iterator();
		{
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		for(Object ob1:ll)
		{
			System.out.println(ob1);
		}
	}

}
