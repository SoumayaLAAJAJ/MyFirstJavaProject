package fr.isika.javainit.ExemplesCours;

public class ExercicesArithmetiques {

	public static void main(String[] args) {
		System.out.println("***** Addition de deux nombres (manuelle) ******");
		int premier = 5;
		int second = 10;
		int resultat = premier + second;
		
		System.out.println("L'addition de " + premier 
				+ " et de " + second 
				+ " donne " + resultat);

		System.out.println("---------------------------------");

		System.out.println("***** Addition de deux nombres (avec Math.addExact()) ******");
		premier = 5;
		second = 10;
		resultat = Math.addExact(premier, second);
		System.out.println("L'addition de " 
				+ premier + " et de " 
				+ second + " donne " + resultat);
		
		System.out.println("---------------------------------");

		
		System.out.println("***** Calcul de moyenne de 3 notes ******");
		double note1 = 5.5;
		double note2 = 5.25;
		double note3 = 10.25;
		double moyenne = (note1 + note2 + note3) / 3;
		System.out.println("La moyenne des 3 notes est " + moyenne);

		System.out.println("---------------------------------");
		
		System.out.println("***** Trouver le max de deux valeurs ******");
		float valeur1 = 5.5f;
		float valeur2 = 5.55f;
		
		if(valeur1 > valeur2) {
			System.out.println("le max est :" + valeur1);
		} else if(valeur2 > valeur1) {
			System.out.println("le max est :" + valeur2);
		} else {
			System.out.println("les valeurs 1 et 2 sont égales");
		}
		
		System.out.println("---------------------------------");
		
System.out.println("---------------------------------");
		
		System.out.println("*****Exemple avec chaines et caractères ******");
		
		String maChaine = "Bonjour, je suis une chaîne";
		char unSeulCaractere = 'A';
		
		System.out.println("String => " + maChaine);
		System.out.println("char => " + unSeulCaractere);
		
		// ascii 
		System.out.println(5 + unSeulCaractere);
		
				
		
		System.out.println("---------------------------------");
				
		

	}

}
