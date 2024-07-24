package fr.isika.javainit.CorrectionExos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciceList {

		public static void main(String[] args) {
			
			// 1 - Création de la liste des langages
			System.out.println("--- Création de la liste ----");
			ArrayList<String> langages = new ArrayList<>();
			
			// 2 - Ajout de quelques valeurs
			System.out.println("--- Ajout de qq valeurs ----");
			langages.add("Java");
			langages.add("C#");
			langages.add("TypeScript");
			langages.add("PHP");
			langages.add("Javascript");
			langages.add("C++");
			langages.add("C");
			langages.add("PHP");
			
			// 2b - indexOf
			System.out.println("--- IndexOf elemt (première occurence) ----");
			System.out.println(langages.indexOf("PHP"));
			
			System.out.println("--- LastIndexOf elemt (dernière occurence) ----");
			System.out.println(langages.lastIndexOf("PHP"));
			
			// 3 - Parcourir la liste avec un index
			System.out.println("--- Affichage de tous les elmts (parcours) ----");
			for(int position = 0; position < langages.size(); position ++) {
				String valeur = langages.get(position);
				System.out.println("la valeur n° " + position + " est " + valeur);
			}
			
			// 4 - Afficher le 3ème élément 
			System.out.println("--- Accès par index ----");
			String third = langages.get(2);
			System.out.println("le 3ème elmt : " + third);
			
			// 5 - Insérer un elemt à la position 0 
			System.out.println("--- Affichage après insertion de deux elmts ----");
			langages.add(0, "Pascal");
			langages.add(5, "Python");
			
			for(int position = 0; position < langages.size(); position ++) {
				String valeur = langages.get(position);
				System.out.println("la valeur n° " + position + " est " + valeur);
			}
			
			System.out.println("--- Affichage après suppression de deux elmts ----");
			// 6 - Supprimer un elemt
				// 6a - par son index (ici c'est Pascal qui est à la pos 0)
				langages.remove(0); 
				
				// 6b - par l'elemt lui même (PHP)
				langages.remove("PHP");
			
			for(int position = 0; position < langages.size(); position ++) {
				String valeur = langages.get(position);
				System.out.println("la valeur n° " + position + " est " + valeur);
			}

			// 7 - Tri d'une liste
			System.out.println("---- Liste triée -----");
				// 7a - avec ArrayList.sort(...)
				//langages.sort(null);
				
				// 7b - avec Collections.sort(...)
				Collections.sort(langages);
			
			for(int position = 0; position < langages.size(); position ++) {
				String valeur = langages.get(position);
				System.out.println("la valeur n° " + position + " est " + valeur);
			}
			
			
			// 8 - Affichage des elemts de façon aléatoire
			System.out.println("---- Liste mélangée ----");
			Collections.shuffle(langages);
			for(int position = 0; position < langages.size(); position ++) {
				String valeur = langages.get(position);
				System.out.println("la valeur n° " + position + " est " + valeur);
			}
			
			// 9- Création d'une liste d'éléments séparés
			List<Double> prix = List.of(20.5d, 10.25d, 11.25d, 8d, 7d, 6.5d);
			for(int i =0; i<prix.size(); i++) {
				System.out.println(prix.get(i));
			}
			
			
			
		}	
	}


