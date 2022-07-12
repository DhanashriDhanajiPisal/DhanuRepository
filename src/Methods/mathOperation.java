package Methods;

public class mathOperation {

	public static void main(String[] args) {
		mathOperation mo = new mathOperation ();
		mo .Result (500,300);
		artitmatic(10,300,200);

	}
	public  void Result (int a,int b)
	
	{
	
		
		int add = a+b;
		int sub=a-b;
		int mul =a*b;
		System.out.println("Number addition is  "+add);
		System.out.println("Number substarction is "+sub);
		System.out.println("Number multiplication is "+mul);
	}
	
public static void artitmatic(int i,int a,int b )


{
	System.out.println("Number addition is  "+(a/b));
	System.out.println("Number substarction is "+(a-b));
	System.out.println("Number multiplication is "+(a*b));
	System.out.println("my sub nama is "+i);
}
	
	
	
	
}
