package fr.isika.javainit.Exercices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExempleHashSet {

	public static void main(String[] args) {
		// 1 - Création de la liste des langages
		Set<String> langages = new HashSet<>();
		
		// 2 - Ajout de quelques valeurs
		langages.add("PHP");
		langages.add("Java");
		langages.add("Typescript");
		langages.add("Javascript");
		langages.add("C++");
		
		
		// 4 - Supprimer un élément 
		langages.remove("PHP");
		
		//3- Afficher la liste
		Iterator<String> iter = langages.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		
		}
		
		

	}

}
