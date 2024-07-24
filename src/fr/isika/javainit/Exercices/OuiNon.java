package fr.isika.javainit.Exercices;

public class OuiNon {

	public static void main(String[] args) {
		String q = "Voulez-vous continuer ?";
		char res = 'O';
		
		if((res == 'O') | (res == 'N')) {
			System.out.println("Suite");
		}else {
			System.out.println(q);
		}

	}

}
