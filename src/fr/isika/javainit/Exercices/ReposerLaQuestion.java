package fr.isika.javainit.Exercices;

public class ReposerLaQuestion {

	public static void main(String[] args) {
		
		double n = 4;
		//int i = 0;
		String question = "Donnez votre choix (1, 2 ou 3)";
				
		//Quand je mets un autre chiffre que 1, 2 ou 3, ça me fait une boucle infinie
		/*do{
			if(!(1 <= n) || !(n <= 3)) {
			System.out.println(question);
		} else {
			System.out.println("OK");
		}
		} while (i < 1);*/
		
		if(!(1 <= n) || !(n <= 3)) {
			System.out.println(question);
		} else {
			System.out.println(n);
		}
		
		
		
		
		
	
	}
}
