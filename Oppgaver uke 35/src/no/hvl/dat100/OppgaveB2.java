package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveB2 {
	
	public static void main(String[] args) {
	
	int tikroninger, enkroninger;
	String Pris = showInputDialog("Pris ");
	String Beløp = showInputDialog("Beløp ");
	int a = Integer.parseInt(Pris);
	int b = Integer.parseInt(Beløp);
	
	//Mattefeil, må se på formlene
	
    tikroninger = (b-a)/10;
    enkroninger = tikroninger%10;
    
    System.out.println(tikroninger + " Tiere " + " og " + enkroninger + " enere ");
  
	
	}
	

}
