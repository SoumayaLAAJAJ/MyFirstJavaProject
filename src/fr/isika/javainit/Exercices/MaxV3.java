package fr.isika.javainit.Exercices;

public class MaxV3 {

	public static void main(String[] args) {
		int a = 3456;
		int b = 98764;
		int c = 589;
		int max;
		
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		
		if(max < c ) {
			max = c;
		}
		
		System.out.println("max => " + max);
	}

}
