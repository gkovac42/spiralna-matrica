
package edunova;

import javax.swing.JOptionPane;

public class SpiralnaMatrica {
    
    	/* program prima broj stupaca i redova tablice, zatim brojeve ispisuje spiralno	od 1 navise
	
			3.
		^>>>>>>>>>>>>>>>>>
		^|00|01|02|03|04|v
		^|10|11|12|13|14|v
	     2.	^|20|21|22|23|24|v  4.
		^|30|31|32|33|34|v
		^|40|41|42|43|44|v
		<<<<<<<<<<<<<<<<<<    
		   	1. 
		
	*/

	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca i redova"));

		int[][] tablica = new int[x][x];

		// deklariranje pozicija za pocetni i zavrsni stupac i red
		int stupacPrvi = 0, stupacZadnji = x - 1;
		int redPrvi = 0, redZadnji = x - 1;
		// brojac polja
		int polje = 1;
		// vrti petlju dok ne dodjes do ukupnog broja polja tablice (x*x)
		while (polje <= x * x) {

			// puni donji red (od zadnjeg stupca prema prvom)
			for (int i = stupacZadnji; i >= stupacPrvi; i--) {
				tablica[redZadnji][i] = polje++;
			}
			// puni prvi stupac (od predzadnjeg reda prema prvom)
			for (int j = redZadnji - 1; j >= redPrvi; j--) {
				tablica[j][stupacPrvi] = polje++;
			}
			// puni prvi red (od drugog stupca prema zadnjem)
			for (int i = stupacPrvi + 1; i <= stupacZadnji; i++) {
				tablica[redPrvi][i] = polje++;
			}
			// puni zadnji stupac (od drugog reda do predzadnjeg)
			for (int j = redPrvi + 1; j < redZadnji; j++) {
				tablica[j][stupacZadnji] = polje++;
			}
			// pomjeri pocetne tocke i puni unutrasnjost tablice
			stupacPrvi++;
			stupacZadnji--;
			redPrvi++;
			redZadnji--;
		}
		// ispis
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(tablica[i][j] + "\t");
			}
			System.out.println();
		}
	}

}