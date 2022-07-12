package parameterMethod;

public class Constructor//variable declaration
{
	int a;
	int b;


	public  Constructor()//variable initialization//
	{

	a=100;
	b=500;
	
}
public Constructor(int x) //constructor with one parameter//

{
a=x;

}

	public Constructor(int x,int y)//constructor with two parameter//

	{
	
		a=x;
		b=y;
		
	}	
	
	public static void main(String[] args) {
		Constructor m1=new Constructor();
m1.Mul();
Constructor m2=new Constructor(100);

m2.Mul();
Constructor m3=new Constructor(200,200);
m3. Mul();

	}

	public void Mul()
	{
	
		int mul= a*b;
		
		System.out.println("My multiplication is"+mul);
	}
	
}
