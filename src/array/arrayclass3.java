package array;

public class arrayclass3 {

	public static void main(String[] args) {
		float Percentage[]=new float[5];
		Percentage[0]=85.5f;
		Percentage[1]=90.5f;
		Percentage[2]=80.5f;
		Percentage[3]=78.5f;
		Percentage[4]=70.5f;
		for(int i=0;i<=Percentage.length-1;i++)
		{
			System.out.println(Percentage[i]);
		}
		int j=Percentage.length-1;
		while(j>=0)
		{
			System.out.println(Percentage[j]);
			j--;
		}
	}

}
