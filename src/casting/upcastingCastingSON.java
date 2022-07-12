package casting;

public class upcastingCastingSON extends upcastingFather {

	public static void main(String[] args) {
		upcastingCastingSON S1=new upcastingCastingSON();
		S1.bike();
		S1.car();
		upcastingFather F1=new upcastingCastingSON();
		F1.bike();
		F1.car();
		//upcastingCastingSON S11=new upcastingFather();
		

		

	}
	void car()
	{
		System.out.println("BMW");
	}
void bike()
{
	System.out.println("KTM");
}
}
