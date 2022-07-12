package stringclass;

public class singlearray {

	public static void main(String[] args) {
		int serialno []=new int[4];
		serialno[0]=10;
		serialno[1]=20;
		serialno[2]=30;
		serialno[3]=40;
		System.out.println(serialno[2]);
		
		System.out.println(serialno.length);
		for(int i=0;i<=serialno.length-1;i++)
		{
			System.out.println(i);
		}
for (int j=serialno.length;j>=0;j--)
{
System.out.println(j);
}
		
	}

}
