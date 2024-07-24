package fr.isika.javainit.ExemplesCours;

public class ExempleTableaux {

	public static void main(String[] args) {

		/*
		 * Se familiariser avec la notion de tableau (typé)
		 */
		
		// 1 - Déclaration d'un tableau
		String[] nomTableau;

		// 2 - Initialisation à un tableau de taille X (mais vide)
		nomTableau = new String[10];
		
		// 2bis - Initialisation d'un tableau avec des valeurs
		String[] semaine = { "lundi", "mardi", "dimanche" };
				
		// Attention on ne peut pas afficher directement le contenu du tableau
		// cette ligne affichera la référence mémoire du tableau
		System.out.println(semaine);
		
		// Si on veut le contenu il faut boucler et afficher case par case
		// Affichage case par case
		for(int index = 0; index < semaine.length; index++) {
			
			// Accèder à la case n° i du tableau
			System.out.println(semaine[index]);  
			
		}
		
		// Remplissage d'un tableau case par case
		for(int index = 0; index < nomTableau.length; index++) {
			
			// Affecter une valeur à la case n° i du tableau
			nomTableau[index] = "Case N°" + index;  
			
		}

		// Exemple de parcours de tableau avec for
		System.out.println("************* Parcours avec for **************");
		System.err.println();
		for(int index = 0; index < nomTableau.length; index++) {
			System.err.println(nomTableau[index]);  
		}
		
		// Autre exemple de parcours de tableau avec while
		System.out.println("************* Parcours avec while **************");
		System.err.println();
		int compteur = 0;
		while(compteur < nomTableau.length) {
			System.err.println(nomTableau[compteur]);
			compteur += 1;
		}
		
		System.out.println("************* Parcours inverse avec for **************");
		System.err.println();
		for(int index = nomTableau.length-1 ; index >= 0; index--) {
			System.err.println(nomTableau[index]);  
		}
		
	}

}
