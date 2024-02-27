package oops;

public class GlobalVariableAndLocalVariable {
//  Scope of global variables are within all over class.
	static int b = 20;  // Global variable

	public static void main(String[] args) {
//Scope of the local variables within the methods / functions.
		int a = 10;  // local variable
		System.out.println(a);
//		System.out.println(b);
		display();
	}
	
	public static void display() {
		
		System.out.println(b);
	}
	

}
