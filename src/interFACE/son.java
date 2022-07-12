package interFACE;

public class son implements Mother,Father {
	public static void main(String[] args) {
		son S=new son();
		S.car();
		S.care();
		S.love();
		S.money();
		S.keys();
	
		
	}

	@Override
	public void money() {

System.out.println("son Money");
		
	}

	@Override
	public void car() {
System.out.println("son car");

		
	}

	@Override
	public void love() {
		System.out.println("mother love");
		
	}

	@Override
	public void care() {
		System.out.println("mother car");
		
		
	}

	@Override
	public void keys() {
		// TODO Auto-generated method stub
		Father.super.keys();
		Mother.super.keys();
	}

}
