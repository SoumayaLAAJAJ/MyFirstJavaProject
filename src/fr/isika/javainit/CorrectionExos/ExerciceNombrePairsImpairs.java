package fr.isika.javainit.CorrectionExos;

import java.util.Scanner;

/*
 * En Java tout est classe, donc pour coder n'importe quel programme
 * nous avons besoin d'une classe au minimum.
 */
public class ExerciceNombrePairsImpairs {

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
		System.out.println("Programme Nombre pair/impair - Début - ");
		System.out.println("------------------------------------------------------");
		System.out.println(); // ligne vide
		
		
		// 1 - On déclare l'objet Scanner (il faut importer la classe java.util.Scanner)
		// vous pouvez consulter la Javadoc de cette classe pour voir
		// les différentes méthodes de saisie selon les valeurs souhaitées
		Scanner saisieUtilisateur = new Scanner(System.in);

		// 2 - On met un petit message à l'utilisateur pour
		// lui demander ce qu'il doit saisir
		System.out.println("Veuillez saisir un nombre : ");

		// 3 - On va récupérer la valeur saisie par l'utilisateur
		// dans notre cas on souhaite qu'il saisisse un nombre
		// et puis on l'affecte dans une variable pour pouvoir l'utiliser
		int nombre = saisieUtilisateur.nextInt();

		// 3bis - On va utiliser l'opérateur % (modulo)
		// pour obtenir le reste de la division entière
		// car si on divise le nombre par 2 et que le reste vaut 0 => pair, sinon impair

		// On va récupérer le reste de la division du nombre par 2 dans une variable
		int resteDivision = nombre % 2;

		// 4 - On vérifie si le reste vaut 0 (cas pair), impair sinon
		if (resteDivision == 0) {

			// Le nombre saisi est pair
			System.out.println(nombre 
					+ " est pair (car le reste de la division par 2 vaut : " 
					+ resteDivision + ")");

		} else {

			// Le nombre saisi est impair
			System.out.println(nombre 
					+ " est impair (car le reste de la division par 2 vaut : " 
					+ resteDivision + ")");
		}

		// 5 - On ferme le scanner pour libérer les ressources (mémoire)
		saisieUtilisateur.close();
		
		System.out.println(); // ligne vide
		System.out.println("------------------------------------------------------");
		System.out.println("Programme Nombre pair/impair - Fin - ");
	}

}
