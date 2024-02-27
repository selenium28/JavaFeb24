package oops;

public class MethodOverLoadingConcept {

//	Duplicate methods are not allowed in java
//	Can we overload main method in JAva?
//	Yes, We can but it is not a good practice to overload main method
//	MethodOverLoading: Method name is same but different input parameters
//	within the same class is known as MethodOverLoading.
	public static void main(String[] args) {
		MethodOverLoadingConcept obj = new MethodOverLoadingConcept();
		obj.display();
		obj.display(33.22, 10);
		obj.display(100, 200);

	}

//	public static void main() {
//		
//	}

	public void display() {
		System.out.println("Display method with zero input parameter");
	}

	public void display(int a) {
		System.out.println("Display method with one input parameter");
	}

	public void display(int b, int c) {
		System.out.println("Display method with Two input parameter");
	}

	public void display(double d, int m) {
		System.out.println("Display method with one input parameter");
	}

}
