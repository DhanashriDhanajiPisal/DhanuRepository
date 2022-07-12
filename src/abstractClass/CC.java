package abstractClass;

public class CC extends abstractclass {

	public static void main(String[] args) {
	
		CC c=new CC();
		c.test();
		c.test1();
c.test4();
	}
	@Override
public void test()

{
		System.out.println("i am abstrct  method");
}
public void test4()
{
	int a=50;
	int b=100;
	int sum=a+b;
	System.out.println(sum);
}
}
