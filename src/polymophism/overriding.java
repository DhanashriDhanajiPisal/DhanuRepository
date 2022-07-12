package polymophism;

public class overriding {

	public static void main(String[] args) {
	overriding1 ov=new overriding1();	
ov.day();
overriding2 ov1=new overriding2();
ov1.day();
overriding1 ov2=new overriding1();	
ov2.wish();
overriding2 ov3=new overriding2();	
ov3.wish();
	}

}
