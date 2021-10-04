package no.hvl.dat100;

import static java.lang.Math.min;
import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave2lab1 {

	public static void main (String[] args) {
		String tall1 = showInputDialog("Tall nummer 1 ");
		String tall2 = showInputDialog("Tall nummer 2 ");
		String tall3 = showInputDialog("Tall nummer 3 ");
		String tall4 = showInputDialog("Tall nummer 4 ");
		
		
		int a = Integer.parseInt(tall1);
		int b = Integer.parseInt(tall2);
		int c = Integer.parseInt(tall3);
		int d = Integer.parseInt(tall4);
		
		int første = min(a, b);	
		int andre = min(c, d);
		int tredje = min(første, andre);
		int resultat = tredje;
		
		System.out.println("Det minste tallet er " + resultat);
		
}
}
