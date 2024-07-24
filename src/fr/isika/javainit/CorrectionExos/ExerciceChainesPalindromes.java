package fr.isika.javainit.CorrectionExos;

import java.util.Scanner;

/*
 * En Java tout est classe, donc pour coder n'importe quel programme
 * nous avons besoin d'une classe au minimum.
 */
public class ExerciceChainesPalindromes {

	/*
	 * La méthode main doit exister dans tout programme Java car elle est lancée
	 * automatiquement par la machine virtuelle Java dès qu'on exécute le programme
	 * Java qui la contient
	 */
	public static void main(String[] args) {

		/*
		 * On va utiliser la classe Scanner qui permet de demander à l'utlisateur de
		 * saisir des valeurs depuis la console.
		 * 
		 * ATTENTION : Dans cette version de l'exercice on ne gère pas encore les cas
		 * d'erreur.
		 */
		System.out.println("Programme Chaînes palindrômes - Début - ");
		System.out.println("-----------------------------------------");
		System.out.println(); // ligne vide
		
		
		// 1 - On déclare l'objet Scanner (il faut importer la classe java.util.Scanner)
		// vous pouvez consulter la Javadoc de cette classe pour voir
		// les différentes méthodes de saisie selon les valeurs souhaitées
		Scanner saisieUtilisateur = new Scanner(System.in);

		// 2 - On met un petit message à l'utilisateur pour
		// lui demander ce qu'il doit saisir
		System.out.println("Veuillez saisir un mot : ");

		// 3 - On va récupérer la valeur saisie par l'utilisateur
		// dans notre cas on souhaite qu'il saisisse une chaîne de caractères
		// et puis on l'affecte dans une variable pour pouvoir l'utiliser
		String mot = saisieUtilisateur.next();

		// 3bis - Comme une chaine palindrome est une chaine égale à son inverse
		// par exemple : kayak ou laval se lisent
		// de gauche à droite comme de droite à gauche

		// On va d'abord inverser la chaine, pour ce faire
		// on va utiliser une classe Java qui existe déjà (java.lang.StringBuilder)
		// (au lieu de coder nous même la fonction)

		StringBuilder builder = new StringBuilder(mot);

		// On utilise la méthode reverse() pour inverser le mot initial
		// le toString() permet de récupérer la valeur
		String motInverse = builder.reverse().toString();

		// 4 - On vérifie si la chaine initiale (mot) est égale à son inverse
		// (motInverse)
		// rappel : pour les String on utilise equals(...) et non pas le ==

		if (mot.equals(motInverse)) {

			// Le mot initial est égal à son inverse ==> palindrome
			System.out.println(mot + " est une chaine palindrome");

		} else {

			// sinon : le mot n'est pas égal à son inverse ==> pas un palindrome
			System.out.println(mot + " n'est pas une chaine palindrome");

		}

		// 5 - On ferme le scanner pour libérer les ressources (mémoire)
		saisieUtilisateur.close();
		
		System.out.println(); // ligne vide
		System.out.println("-----------------------------------------");
		System.out.println("Programme Chaînes palindrômes - Fin - ");
	}

}
