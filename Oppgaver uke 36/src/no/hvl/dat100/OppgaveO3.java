package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Math.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		
   oppgaveB();
		
	}	
	
	private static void oppgaveA() {
			String inTxt = showInputDialog("Tall n: ");
		int n = Integer.parseInt(inTxt);
			
		int sum = n;
		
		for(int i = n; i > 1; i--) {
			sum *= (n-1);
			n--;

		}
		showMessageDialog(null, sum);
	}	
		
	private static void oppgaveB() {
			
	String inTxt = showInputDialog("Tall ");
    int n = Integer.parseInt(inTxt);
	
    int sum = n;
    
    for(int i = n; i > 1; i--) {
    	sum *= (n-1);
    	n--;
    }
    System.out.println("Tall! = " + sum);
    
		}
	}
