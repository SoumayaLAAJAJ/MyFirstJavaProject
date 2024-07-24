package fr.isika.javainit.Exercices;

import java.util.ArrayList;

public class DonneesEnCommun {

	public static void main(String[] args) {
		
		//Exercice 2 Tableaux : 
			//--> Ecrire un programme Java qui prend en compte les tableaux suivants et affiche tous les éléments en commun

			//Données : 
			String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
			String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
			
			// Initialiser une liste pour stocker les éléments communs 
			
			ArrayList<String> commonElements = new ArrayList<>();
			
			for(int i = 0; i < array1.length ; i++) {
				for (int j = 0; j < array2.length; j++) {
					if(array1[i].equals(array2[j])) {
						commonElements.add(array1[i]);
						System.out.println(commonElements);
					}
				}
			}
			
			
			
	}
		

}
