package org.lessons.java;

public class CibiPreferiti {
	public static void main(String[] args){
		String[] cibiPreferiti = {"Pizza", "Pasta al sugo", "Salmone", "Polenta", "Gelato al cioccolato", "Gesù"};
		
		// Ranking length
        System.out.println("Lunghezza della classifica: " + cibiPreferiti.length);
        
        // Ranking top
        System.out.println("Cibo top: " + cibiPreferiti[0]);
        
        // Ranking bottom
        System.out.println("Cibo preferito ma non troppo: " + cibiPreferiti[cibiPreferiti.length - 1]);
        
        // Ranking middle
        int posizioneMedia = cibiPreferiti.length / 2;
        System.out.println("Il cibo di mezza classifica è: " + cibiPreferiti[posizioneMedia]);
     
	}
}
