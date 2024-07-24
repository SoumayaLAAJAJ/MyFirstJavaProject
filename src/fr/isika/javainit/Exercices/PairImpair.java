package fr.isika.javainit.Exercices;

import java.util.Scanner;

public class PairImpair {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez écrire un nombre");
		
		int num = sc.nextInt();
		
		if((num % 2) == 0) {
			System.out.println("ce nombre est pair");
		}else {
			System.out.println("ce nombre est impair");
			
			sc.close();
		}
	}

}
