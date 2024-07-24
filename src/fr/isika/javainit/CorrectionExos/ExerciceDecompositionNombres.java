package fr.isika.javainit.CorrectionExos;

import java.util.Scanner;

/*
 * En Java tout est classe, donc pour coder n'importe quel programme
 * nous avons besoin d'une classe au minimum.
 */
public class ExerciceDecompositionNombres {

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
		System.out.println("----------------------------------------");
		System.out.println("Programme Décompositon nombres - Fin - ");
		System.out.println(); // ligne vide
		
		
		// 1 - On déclare l'objet Scanner (il faut importer la classe java.util.Scanner)
		// vous pouvez consulter la Javadoc de cette classe pour voir
		// les différentes méthodes de saisie selon les valeurs souhaitées
		Scanner saisieUtilisateur = new Scanner(System.in);

		// 2 - On met un petit message à l'utilisateur pour
		// lui demander ce qu'il doit saisir
		System.out.println("Veuillez saisir un nombre entier (entre 100 et 999) : ");

		// Cette valeur booléenne (vrai / faux) permet de savoir si 
		// la saisie utilisateur est valide ou pas
		boolean saisieValide = false;
		
		// On déroule l'algorithme
		while (saisieUtilisateur.hasNext() || !saisieValide) {

			// 3 - On va récupérer la valeur saisie par l'utilisateur
			// dans notre cas on souhaite qu'il saisisse un nombre
			// et puis on l'affecte dans une variable pour pouvoir l'utiliser
			
			// lire une première valeur entière
			int nombreSaisi = saisieUtilisateur.nextInt();

			if (nombreSaisi >= 1000 || nombreSaisi < 100) {

				System.out.println("Nombre saisi pas entre 100 et 999, veuillez saisir un nouveau nombre");
				saisieValide = false;

			} else {

				int centaines = nombreSaisi / 100;
				int dizaines = (nombreSaisi - (centaines * 100)) / 10;
				int unites = nombreSaisi - (centaines * 100 + dizaines * 10);

				System.out.println("Vouz avez saisi : " + nombreSaisi 
						+ " - décomposé comme suit : " + "100 x "
						+ centaines + " + 10 x " + dizaines + " + " + unites);

				saisieValide = true;

				// Forcer à quitter la boucle while si jamais l'utilisateur continue à saisir
				// des choses
				// dans ce cas scanner.hasNext() répond true
				// et du coup la condition du while reste active
				break;
			}
		}

		// 5 - On ferme le scanner pour libérer les ressources (mémoire)
		saisieUtilisateur.close();
		
		System.out.println(); // ligne vide
		System.out.println("----------------------------------------");
		System.out.println("Programme Décompositon nombres - Fin - ");
	}

}
