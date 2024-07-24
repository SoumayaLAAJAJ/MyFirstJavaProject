package fr.isika.javainit.CorrectionExos;

import java.util.Scanner;

/*
 * En Java tout est classe, donc pour coder n'importe quel programme
 * nous avons besoin d'une classe au minimum.
 */
public class ExerciceOccurencesDansUneChaine {

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
		System.out.println("Programme Occurences lettre dans une phrase - Début - ");
		System.out.println("------------------------------------------------------");
		System.out.println(); // ligne vide
		
		// 1 - On déclare l'objet Scanner (il faut importer la classe java.util.Scanner)
		// vous pouvez consulter la Javadoc de cette classe pour voir
		// les différentes méthodes de saisie selon les valeurs souhaitées
		Scanner saisieUtilisateur = new Scanner(System.in);

		// 2 - On met un petit message à l'utilisateur pour
		// lui demander ce qu'il doit saisir
		System.out.println("Veuillez saisir une phrase : ");

		// 3 - On va récupérer la valeur saisie par l'utilisateur
		// dans notre cas on souhaite qu'il saisisse une phrase (une ligne entière avec nextLine())
		// et puis on l'affecte dans une variable pour pouvoir l'utiliser
		String phrase = saisieUtilisateur.nextLine().toLowerCase();
		
		// le toLowerCase() => avoir toute la phrase en minuscule 
		// pour éviter les problème de casse
		String phraseEnMinuscule = phrase.toLowerCase();

		// 3bis - On va demander à l'utilisateur de saisir une lettre
		// comme dans le scanner il n'y a pas de méthode 
		// pour saisir un seul caractère => on saisi une String
		// puis on récupère la première lettre avec charAt(0);
		System.out.println("Veuillez saisir une lettre à rechercher dans la phrase ci-dessus : ");
		String saisieLettre = saisieUtilisateur.next().toLowerCase();

		// le toLowerCase() => avoir toute la phrase en minuscule 
		// pour éviter les problème de casse
		String saisieLettreMinuscule = saisieLettre.toLowerCase();
		char lettreRecherchee = saisieLettreMinuscule.charAt(0);

		// 4 - On va itérer (répéter) le traitement sur la phrase saisie
		// lettre par lettre pour compter les occurences
		
		// la boucle for permet de faire un traitement séquentiel
		// on commence par la première lettre de la phrase jusqu'à la dernière
		// à chaque fois qu'on trouve la lettre recherchée on 
		// ajoute +1 au compteur d'occurences
		int compteurOccurences = 0;
		
		for(int position = 0; position < phraseEnMinuscule.length(); position++) {
			
			// la lettre à la position X est égale à la lettre recherchée
			if( phrase.charAt(position) == lettreRecherchee ) {
				
				compteurOccurences = compteurOccurences + 1;
				
				// autres formes pour augmenter le compteur
				// compteurOccurences++;
				// compteurOccurences += 1;
			}
		}
		
		// On affiche le nombre d'occurences trouvées
			System.out.println("La lettre " + "'" + lettreRecherchee + "'" 
					+ " a été trouvée " + compteurOccurences + " fois dans la phrase : "
					+ phrase);

		// 5 - On ferme le scanner pour libérer les ressources (mémoire)
		saisieUtilisateur.close();
		
		System.out.println(); // ligne vide
		System.out.println("------------------------------------------------------");
		System.out.println("Programme Occurences lettre dans une phrase - Fin - ");
	}

}
