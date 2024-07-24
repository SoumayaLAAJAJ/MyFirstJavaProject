package fr.isika.javainit.Exercices;

public class Temperature {

	public static void main(String[] args) {
		double temp = 100; 
		
		if( temp < 0) {
			System.out.println("L'eau est à l'état Glace");
		} else if((temp >= 0) && (temp < 100)) {
			System.out.println("L'eau est à l'état Liquide");
		} else {
			System.out.println("L'eau est à l'état Vapeur");
		}

	}

}
