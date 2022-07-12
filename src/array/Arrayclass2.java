package array;

public class Arrayclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade[]=new char[4];
		grade[0]='A';
		grade[1]='B';
		grade[2]='B';
		grade[3]='C';
		for(int J=0;J<=grade.length-1;J++)
		{
			System.out.println(grade[J]);
		}
		for(int K=grade.length-1;K>=0;K--)	
		{
			System.out.println(grade[K]);
		}
	}

}
