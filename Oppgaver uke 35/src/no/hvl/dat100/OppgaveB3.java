package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB3 {

	public static void main(String[] args) {
	
	String Feil = "Feil brukernavn eller passord!";	
	String Riktig = "Velkommen! ";

		
	String BN = showInputDialog("Brukernavn: ");
	int a = Integer.parseInt(BN);
	String PO = showInputDialog("Passord: ");
	int b = Integer.parseInt(PO);
	
	int c = 2021;
	int d = 123;
			
	if(a != c && b != d) {
		showMessageDialog(null, Feil);
	}else {
		showMessageDialog(null, Riktig);
	}
		
	
	}
}