package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB5 {

	public static void main(String[] args) {
		
		//OPPGAVE B5  A)
		
		String tallStreng = showInputDialog("Poengsum: ");
		int Poengsum = Integer.parseInt(tallStreng);
		
		
		if(Poengsum < 0) {
			System.out.println("Ugyldig poengsum ");
		}
		if(Poengsum >100) {
			System.out.println("Ugyldig poengsum ");
		}	
		if(90 <= Poengsum && Poengsum <= 100) {
			System.out.println("Karakter: " + "A");
		}
		if(80 <= Poengsum && Poengsum <= 89) {
			System.out.println("Karakter: " + "B");
		}
		if(60 <= Poengsum && Poengsum <= 79) {
			System.out.println("Karakter: " + "C");
		}
		if(50 <= Poengsum && Poengsum <= 59) {
			System.out.println("Karakter: " + "D");
    	}
		if(40 <= Poengsum && Poengsum <= 49) {
			System.out.println("Karakter: " + "E");
		}
		if(0 <= Poengsum && Poengsum <= 39) {
			System.out.println("Karakter: " + "F " + "STRYK");
    	}
		
		}
		
			
	}		





