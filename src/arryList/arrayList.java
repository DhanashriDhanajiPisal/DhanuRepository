package arryList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrayList {

	public static void main(String[] args) {
		
		ArrayList AR=new ArrayList();
		AR.add("Dhanshri");
		AR.add("Pisal");
		AR.add('A');
		AR.add(null);
		AR.add(1);
		AR.add("Dhanshri");
		AR.add(11.5f);
		AR.add(null);
		AR.add("Dhanshri");
		
			System.out.println(AR);
			System.out.println(AR.size());
			System.out.println(AR.get(3));
			System.out.println(AR.isEmpty());
		System.out.println(AR.remove(7));
		//print array list by using for loop
	
for(int i=0;i<=AR.size()-1;i++)
{
	System.out.println(AR.get(i));
}
//Print array list by using iterator cursor
{
	Iterator itr =AR.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	//print array list by using list iterator cursor
	{
	
	}
		ListIterator litr=AR.listIterator();
		while(litr.hasNext())
    {
			System.out.println(litr.next());
    }	
	//print array list by for each loop
			{
			for(Object j:AR)
			{
				System.out.println(j);
			}
		}
}
	}
}

