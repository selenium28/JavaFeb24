package interf;

public class ICICIBank implements Bank{

	@Override
	public void savingAC() {
		System.out.println("ICICIBank - savingAC");
		
	}

	@Override
	public void currentAC() {
		System.out.println("ICICIBank - currentAC");
		
	}

	@Override
	public void cc() {
		System.out.println("ICICIBank - cc");
		
	}

}
