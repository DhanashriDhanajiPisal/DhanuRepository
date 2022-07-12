package stringclass;

public class stringClassMethod {

	public static void main(String[] args) {
		String a="DHANASHRI";
		System.out.println(a.length());
		{
			System.out.println(a.toLowerCase());
			System.out.println(a.toUpperCase());
			String b="POOJA";
			String c="POOJA";
			String j="";
			String d=new  String("POOJA");
			String e=new String("POOJA");
			System.out.println(a==b);
			System.out.println(b.equals(c));
			System.out.println(d.equals(e));
			System.out.println(b.equalsIgnoreCase(c));
			System.out.println(a.contains("SHRI"));
			System.out.println(a.contains("RI"));
			System.out.println(a.isEmpty());
			System.out.println(a.isBlank());
			System.out.println(b.charAt(3));
			System.out.println(a.endsWith("ja"));
			System.out.println(b.startsWith("POO"));
			System.out.println(a.concat(b));
			System.out.println(b.substring(2));
			System.out.println(a.substring(2, 4));
			System.out.println(a.indexOf(1));
			System.out.println(a.indexOf(a));
			System.out.println(a.indexOf(a, 2));
			System.out.println(a.replace("NA", "ma"));
			System.out.println(a.lastIndexOf(4));
		}
	}

}
