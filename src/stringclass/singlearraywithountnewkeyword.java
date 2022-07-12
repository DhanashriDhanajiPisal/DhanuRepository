package stringclass;

public class singlearraywithountnewkeyword {

	public static void main(String[] args) {
		String Ramayan[]= {"Ram","laxman","seeta"};
		int year[]= {1930,1931,1932};
		char grade[]= {'A','B','C'};
		System.out.println(Ramayan[1]);
		System.out.println(Ramayan.length);
		System.out.println(Ramayan.length-1);
		System.out.println(year[1]);
		System.out.println(year.length);
		System.out.println(year.length-1);
		System.out.println(grade[1]);
		System.out.println(grade.length);
		System.out.println(grade.length-1);
		for(int i=0;i<=Ramayan.length-1;i++) {
			System.out.println(i);
		}
		
			for(int j=Ramayan.length-1;j>=0;j--)
			{
				System.out.println(j);
		}
	}

}
