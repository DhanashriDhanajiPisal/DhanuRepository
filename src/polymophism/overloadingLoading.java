package polymophism;

public class overloadingLoading {

	public static void main(String[] args) {
		add();
		overloadingLoading ov=new overloadingLoading();
		ov.add(10, 20); 
		ov.add(10, 20, 20);
	}

	public static void add()
	{
	int a=10;
	int b=20;
	int sum=a+b;

		System.out.println(sum);
	
	}

	public void add(int a,int b)
	{
		int sum=a+b;
		{
	System.out.println(sum);
		}
		}
		public void add(int a,int b,int c)
		{
			int sum=a+b+c;
			{
				System.out.println(sum);
			}
}
}

