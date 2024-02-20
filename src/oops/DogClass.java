package oops;

public class DogClass {

	//	method is also called as function in java.
	public static void main(String[] args) {
//		DogClass        - Class name 
//		dog             - reference variable
//		new 	        - keyword
//		DogClass()      - Constructor
//		new DogClass(); - object
		
		DogClass dog = new DogClass();
		dog.running();
		dog.barking();
		dog.eat();

	}

	public void running() {
		System.out.println("Dog is Running");
	}

	public void eat() {
		System.out.println("Dog is Eating");
	}

	public void barking() {
		System.out.println("Dog is Barking");
	}

}
