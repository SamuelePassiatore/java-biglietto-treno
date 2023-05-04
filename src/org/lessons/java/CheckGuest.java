package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args){
		  // Data
		  String[] guestsList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		  
		  // Scanner
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Inserisci il tuo nome: ");
	        String name = scanner.nextLine();
	        
	        // Is guest boolean and for loop
	        boolean isGuest = false;
	        for (int i = 0; i < guestsList.length; i++) {
	        	if (guestsList[i].equals(name)) {
	                isGuest = true;
	                break;
	            }
	        }
	        
	        // Response to user
	        if (isGuest) {
	            System.out.println("Benvenuto alla festa!");
	        } else {
	            System.out.println("Spiacenti, il tuo nome non è sulla lista degli invitati.");
	        }
	        
	        scanner.close();
	}
}
