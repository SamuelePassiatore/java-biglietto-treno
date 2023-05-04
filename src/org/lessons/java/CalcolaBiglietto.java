package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il numero di chilometri che vuoi percorrere: ");
        int km = scanner.nextInt();
        
        System.out.println("Inserisci l'età del passeggero: ");
        int age = scanner.nextInt();

        

        scanner.close();
	}
}
