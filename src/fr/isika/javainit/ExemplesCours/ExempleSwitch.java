package fr.isika.javainit.ExemplesCours;

public class ExempleSwitch {

	public static void main(String[] args) {
		
		int choix = -1;
			
			switch(choix) {
			
			case 1 : 
				System.out.println("Le cas 1 s'exécute");
				break;
				
			case 2 : 
				System.out.println("Le cas 2 s'exécute");
				break;
				
			case 3 : 
				System.out.println("Le cas 3 s'exécute");
				break;
				
			default : System.out.println("Le cas par défaut s'exécute");
			}
			
			
			//Switch avec des Strings : 

				String maChaine = "abc";
						switch(maChaine) {
						
							case "abc" : {
								System.out.println("Le cas abc s'exécute");
								System.out.println("Votre chaine est égale a " + maChaine);
								System.out.println("Le premier caractere est : " + maChaine.charAt(0));
								System.out.println("Le dernier caractere est : " + maChaine.charAt(maChaine.length()-1));
								break;
							}
							
							default : 
								System.err.println("Erreur : ces cas n'est pas prévu pour la valeur " + maChaine );
						}
	
		}

}
