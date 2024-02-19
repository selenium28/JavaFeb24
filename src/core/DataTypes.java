package core;

public class DataTypes {

	public static void main(String[] args) {
		
//		1. int 
		int a = 10;
		System.out.println(a);
//		b = 20;   //cannot be resolved to a variable
//		int a = 50;     Duplicate local variable is not allowed in java.
		a = 20;
		System.out.println(a);
		
//		2. double
		double d = 33.33;
		System.out.println(d);
		double d1 = 100;
		System.out.println(d1);
		
//		3. char
		char c = 'A';
		System.out.println(c);
		char c1 = 'f';
		
//		4. boolean 
//		Are true & false vales in java or keywords in java?
//		Yes - true & false are keywords in java but in data type t will be using as a value
		boolean b = true;
		boolean b1 = false;
		System.out.println(b);
		
//		5. String
//		String is a seq. of char, String is a class in Java. But we can use as data type.
		String str = "ABCD";
		String str1 = "123456";
		String str2 = "10 % 5";
		System.out.println(str);
		

	}

}
