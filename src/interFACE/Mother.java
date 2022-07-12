package interFACE;

public interface Mother {

	void love();
	void care();
	 default void keys()
	 {
		 System.out.println("mother keys");
	 }
}
