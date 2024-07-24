package fr.isika.javainit.Exercices;

public class PrenomMessage {

	public static void main(String[] args) {
		String prenom = "Basile";
		char genre = 'M';
		String message;
		
		System.out.println("Comment t'appelles-tu ? ");
		System.out.println("Je m'appelle " + prenom);
		
		if(genre == 'F') {
			message = "Bienvenue " + prenom;
		}else if(genre == 'M') {
			message = "Bienvenu " + prenom;
		} else {
			message = "Bonjour " + prenom;
		}
		
		System.out.println(message);
	}

}
