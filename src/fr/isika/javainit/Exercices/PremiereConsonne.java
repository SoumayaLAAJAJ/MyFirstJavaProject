package fr.isika.javainit.Exercices;

public class PremiereConsonne {
	public static void main(String[] args) {
		String mot = "ordinateur";
		char c ='\0'; // initialisation de c à une valeur par défaut
		
		for(int i = 0; i < mot.length(); i++) {
			c = mot.charAt(i);
			
			if((c != 'a') && (c != 'e') && (c != 'i') && (c != 'o') && (c != 'u') && (c != 'y')) {
				System.out.println(c);
				break;
			}
		}
		
	}

}
