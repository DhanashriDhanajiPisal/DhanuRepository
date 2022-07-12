package arryList;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vectorPractice {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Dhanashri");
		v.add("motherson");
		v.add("Pooja");
		v.add("Dhanashri");
		v.add(null);
		v.add("marelli");
		System.out.println(v);
		//for loop
		{
			for(int i=0;i<=v.size()-1;i++)
			{
				System.out.println(v.get(i));
			}
			
	//by using iterate cursor
			{
				Iterator it =v.iterator();
				{
				while(it.hasNext())
				{
					System.out.println(it.next());
				
				
				//by using for each
				
					for(Object j:v) {
						System.out.println(j);
					}
					//by using listtrate 
					{
						ListIterator lltr=v.listIterator();
						{
							while(lltr.hasNext())
							{
								System.out.println(lltr.next());
							}
						}			
						
					}
				}
				}
			}
		}
	}
}			
				
				
			
		

	


