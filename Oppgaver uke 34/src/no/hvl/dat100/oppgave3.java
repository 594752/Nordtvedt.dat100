package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class oppgave3  {
		
		
		
	public static void main (String[] args) {
		String Dag = showInputDialog("Dag ");
		String Mnd = showInputDialog("Måned ");
		String År = showInputDialog("Årstall ");
		
		int a = Integer.parseInt(Dag);
		int b = Integer.parseInt(Mnd);
		int c = Integer.parseInt(År);
		
	
  System.out.print("Dato: " + a + "." + b + "." + c );
	
	}

}
