package fr.isika.javainit.Exercices;

import java.util.Scanner;

public class TableauMinMax {

	public static void main(String[] args) {
		
		//Demander à l'utilisateur de saisir un certain nombre de valeurs, les stocker et ensuite dire quel est le max, quel est le min.
		
		
		// Demander à l'utilisateur de saisir un certain nombre de valeurs : 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir la taille du tableau");
		int tailleTableau = sc.nextInt();
		
		
		System.out.println("Veuillez entrer les " + tailleTableau + " valeurs");
		
		int[] tableau = new int[tailleTableau];
		
		for(int i = 0; i < tailleTableau ; i++) {
			tableau[i] = sc.nextInt();
			System.out.println(tableau[i]);
		}
		
		int maxVal = tableau[0];
		int minVal = tableau[0];
		for(int i = 1; i < tailleTableau; i++) {
			if(tableau[i] >= maxVal) {
				maxVal = tableau[i];
			}
			if(tableau[i] <= minVal) {
				minVal = tableau[i];
			}
		}
		System.out.println("le maximum est " + maxVal);
		System.out.println("le minimum est " + minVal);
		
		
		
		sc.close();
		
		
	}
	
	

}
