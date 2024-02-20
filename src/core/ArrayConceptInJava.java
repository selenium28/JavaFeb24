package core;

public class ArrayConceptInJava {

	public static void main(String[] args) {
//		To store similar data types in array variable
//		array will start from index i.e - zero 
		
		int i[] = new int[7];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		i[5] = 60; 
		i[6] = 70; //Exception:- java.lang.ArrayIndexOutOfBoundsException:
		
		System.out.println(i[2]);
		
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
	
	}

}
