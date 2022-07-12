package array;

public class array11 {

	public static void main(String[] args) 
		 {
			//char a[][]= {{'A','B'},{'C','D'}};//CHARCTER PRGM
			int rollno [][]= {{10,11,12,13}};
			
			for(int i=0;i<=rollno.length-1;i++)//0,1,2 row
			{
			for(int j=0;j<=rollno.length-1;j++)//0,1,2 column
			{
			System.out.print(rollno[i][j]+" ");
			}
			System.out.println();
			}
			
	}

}
