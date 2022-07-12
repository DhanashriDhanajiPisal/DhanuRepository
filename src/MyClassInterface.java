
public class MyClassInterface implements myInterface {

	public static void main(String[] args) {
		MyClassInterface MI=new MyClassInterface();
		MI.test();
		MI.test1();
		
		
		
		
	}

	@Override
	public void test() {
		System.out.println("this method is complete in impliment class");
		System.out.println(a);
	}

	@Override
	public void test1() {
		System.out.println("\"this method is complete in impliment class\")");
	}

}

