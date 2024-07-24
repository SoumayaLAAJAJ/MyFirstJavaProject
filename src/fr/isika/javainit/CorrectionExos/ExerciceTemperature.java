package fr.isika.javainit.CorrectionExos;

import java.util.Scanner;

/*
 * En Java tout est classe, donc pour coder n'importe quel programme
 * nous avons besoin d'une classe au minimum.
 */
public class ExerciceTemperature {

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
		System.out.println("Programme Température - Début - ");
		System.out.println("---------------------------------");
		System.out.println(); // ligne vide
		
		// 1 - On déclare l'objet Scanner (il faut importer la classe java.util.Scanner)
		// vous pouvez consulter la Javadoc de cette classe pour voir
		// les différentes méthodes de saisie selon les valeurs souhaitées
		Scanner saisieUtilisateur = new Scanner(System.in);

		// 2 - On met un petit message à l'utilisateur pour
		// lui demander ce qu'il doit saisir
		System.out.println("Veuillez saisir la température de l'eau : ");

		// 3 - On va récupérer la valeur saisie par l'utilisateur
		// dans notre cas on souhaite qu'il saisisse une valeur numérique entière
		// et puis on l'affecte dans une variable pour pouvoir l'utiliser
		int temperatureEau = saisieUtilisateur.nextInt();

		// 4 - On va vérifier cette valeur selon les critères de l'énoncé
		// pour les différents cas on va utiliser une condition if(...)
		if (temperatureEau < 0) {

			// Premier cas : température négative => Glace
			System.out.println("L'eau est à l'état GLACE");

		} else if (temperatureEau >= 0 && temperatureEau < 100) {

			// 2ème cas : température entre 0 et 100 (0 inclus et 100 exclu) => Liquide
			System.out.println("L'eau est à l'état LIQUIDE");

		} else {

			// pour le dernier cas : le else signifie
			// tous les autres cas donc logiquement temperature >= 100

			System.out.println("L'eau est à l'état VAPEUR");
		}

		// 5 - On ferme le scanner pour libérer les ressources (mémoire)
		saisieUtilisateur.close();

		System.out.println(); // ligne vide
		System.out.println("---------------------------------");
		System.out.println("Programme Température - Fin - ");
	}

}
