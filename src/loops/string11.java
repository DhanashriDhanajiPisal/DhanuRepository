package loops;

public class string11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	String name = "VISHWAJEET";
			int l=name.length();
			 String rev ="";
			 
			for(int i=5+1;i<=9;i++)     // i =index of last character, index of char at 0 , i-- = decrement;
			{
				rev=rev+name.charAt(i);  
				// rev=T, rev: T+E --- Rev =TE,
			}
			
			System.out.println(rev);
	}

}
