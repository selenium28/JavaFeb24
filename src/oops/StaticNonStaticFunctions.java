package oops;

public class StaticNonStaticFunctions {
	
//	static int a = 10;

	public static void main(String[] args) {
		StaticNonStaticFunctions stat = new StaticNonStaticFunctions();
		stat.multiply();
		stat.sub();
		
		StaticNonStaticFunctions.display();  // class name 
		divide();   // direct calling
		
//		System.out.println(a);

	}

	public static void display() {
		System.out.println("Static Display method");
	}

	public void sub() {
		System.out.println("Non-Static Sub method");
	}
	
	public void multiply() {
		System.out.println("Non-Static Multiply method");
	}
	
	public static void divide() {
		System.out.println("Static Divide method");
	}



}
