package thisKeyword;

public class thisClass {

	int a=10;
	
	
	public static void main(String[] args) {
		thisClass G=new thisClass();
		G.sum();
		
		
	}
public void sum()
{
	int a =100;
	int b=20;
	int ADD=a+b;
	int ADD1=this.a+b;
	System.out.println("the sum is"+ADD);
	System.out.println("the golbal variable sum is"+ADD1);
	
}


}
