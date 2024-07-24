package fr.isika.javainit.Exercices;

import java.util.ArrayList;

public class ExempleList {
	public static void main(String[] args) {
		// 1 - ecrivez un programme java pour créer une ArrayList nommée "langages"
		ArrayList<String> langages = new ArrayList<String>();
		
		//Ajouter des chaines
		langages.add("PHP");
		langages.add("Java");
		langages.add("C++");
		langages.add("Python");

		System.out.println("**boucle for***");
		//Afficher la collection
		for(int i = 0; i < langages.size(); i++) {
			// insérer l'élement Pascal en première position
			langages.set(0, "Pascal");
			System.out.println(langages.get(i));
			
		}
		
		System.out.println("***boucle forEach***");
		// Parcourir tous les éléments de la liste en utilisant la boucle forEach
		for(String langage: langages){

			
			System.out.println(langage);
			
		}
		
		// Récupérer le 3eme élément
		System.out.println("3eme élément: " + langages.get(2));
		
System.out.println("tri dans l'ordre alphabétique");
		// tri dans l'ordre alphabetique
			
			langages.sort(null);
			System.out.println(langages);
			
		// tri de façon aléatoire
			
			
		// tri par taille du mot
	}

}
