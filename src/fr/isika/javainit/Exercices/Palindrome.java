package fr.isika.javainit.Exercices;

public class Palindrome {
	public static void main(String[] args) {
		
		String mot = "LAVAL";
		
		
		int middle = mot.length() / 2; 
		String firstHalf = mot.substring(0, middle);
		String secondHalf = mot.substring(middle);
		
		if(middle % 2 !=0) {
			middle = middle - 1;
			secondHalf = mot.substring(middle + 1);

		}
		
		System.out.println("milieu => " + middle);
		System.out.println("firsthalf => " + firstHalf);
		System.out.println("secondhalf => " + secondHalf);
		
		

		
		
		
		
		
	}

}
