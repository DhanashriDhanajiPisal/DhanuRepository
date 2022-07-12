package interFACE;

public interface Father {

	void money();
	void car();
	default void keys()
	 {
		 System.out.println("FATHER KEYS");
	 }
}
