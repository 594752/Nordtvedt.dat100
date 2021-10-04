package no.hvl.dat100;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;

public class OppgaveB2 {

	public static void main(String[] args) {
		
		
		String inTall = showInputDialog("Skriv inn variabel av X ");
		double x = Double.parseDouble(inTall);
		
		String inPotens = showInputDialog("Skriv inn potensen til X ");
		int n = Integer.parseInt(inPotens);
		
		
       double a = pow(x, n);
        
      System.out.print("Resultatet av x^n er: " + a);
     
        
        
	}
			
		}
		
		
		
		

	


