package accessSpecifier;

public class accessSpecifierIntro {

	int a=10;
	public static void main(String[] args) {
		test1();
		accessSpecifierIntro A=new accessSpecifierIntro();
		A.test2();
		test3();
		test4();
		
		

	}
	
		private static void test1()
		{
			System.out.println("a");
		}
		void test2()
		{
			System.out.println("a");
		}
	
		
		
		protected static void test3()
		{
			System.out.println("a");
		}
		public static void test4()
		{
			System.out.println("a");
		}
	
	
}

