package org.lessons.java;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalcolaBiglietto {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Kms number
		System.out.println("Inserisci il numero di chilometri che vuoi percorrere: ");
        int km = scanner.nextInt();
        
        // Age of passenger
        System.out.println("Inserisci l'età del passeggero: ");
        int age = scanner.nextInt();
        
        // Full price ticket
        double fullPrice = km * 0.21;

        // Ticket discounts
        if (age < 18) {
            fullPrice *= 0.8; 
        } else if (age >= 65) {
            fullPrice *= 0.6;  
        }

        // Result
        System.out.println("Il prezzo del biglietto è: " + df.format(fullPrice) + " €");

        scanner.close();
	}
}
