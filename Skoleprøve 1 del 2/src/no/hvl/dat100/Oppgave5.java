package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave5 {

	public static void main(String[] args) {
		
        String inTxt = showInputDialog("Skriv inn radius på sirkel: ");
        int a = Integer.parseInt(inTxt);
		
		int r = a;
		
		System.out.println("Arealet av sirkel med radius: " + r + " er " + Math.PI * Math.pow(r, 2));

	}

}
