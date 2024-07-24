package fr.isika.javainit.ExemplesCours;

import java.util.Scanner;

public class ExempleScanner {

	public static void main(String[] args) {
		
				// 1 - On Déclare le scanner et on crée une instance 
				// (à partir du flux d'entrée standard depuis la console)
				Scanner sc = new Scanner(System.in);
				
				// 2 - Utiliser le scanner pour lire une ou plusieurs Valeurs
				
					// 2a - lire une valeur entière
					System.out.println("Veuillez saisir votre age");
					int choix = sc.nextInt();
					System.out.println("Vous avez saisi le nombre : " + choix);
					
					// 2b - lire une chaine
					System.out.println("Veuillez saisir votre nom");
					String nom = sc.next();
					System.out.println("Votre nom est : " + nom);
					
					// 2c - lire un décimal (avec une virgule)
					System.out.println("Veuillez saisir votre taille");
					float taille = sc.nextFloat();
					System.out.println("Votre taile est : " + taille);
				
				
				// 3 - On n'oublie pas de fermer le scanner
				// car c'est une ressource qui peut consommer
				// de la mémoire (bonne pratique, exigée)
				sc.close();
				
	}

}
