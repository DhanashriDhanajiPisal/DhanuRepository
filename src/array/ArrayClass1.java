package array;

public class ArrayClass1 {

	public static void main(String[] args) {
		String college[]=new String[4];
		college[0]="DYP";
		college[1]="COEP";
		college[2]="YC";
		college[3]="GPK";
		char grade[]=new char[4];
		grade[0]='A';
		grade[1]='B';
		grade[2]='B';
		grade[3]='C';
		for(int i=0;i<=college.length-1;i++)
			
		{
			System.out.println(college[i]);
			
			
		}
		{
			System.out.println("===============");
			for(int i=3;i>=0;i--)
					
			{
				System.out.println(college[i]);
				
			}
		}
	}

}
