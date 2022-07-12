package methodConsructor;

public class Rivision1 {

	public void display()
	{
		System.out.println("Hi i am non static method");
	}
	
	
	public static void main(String[] args) {
		Rivision1 obj=new Rivision1();
		obj.display();
        display1();

	}
	
		public static void display1()
		{
			System.out.println("Hi i am static method");
		}
	}

