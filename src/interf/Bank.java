package interf;

public interface Bank {
	
	public void savingAC();
	public void currentAC();
	public void cc();
	
//	After java 1.8 we can use default method
	default void roi() {
		System.out.println("Default method in Bank");
	}
	
	
}
