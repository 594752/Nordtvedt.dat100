package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		String inTxt = showInputDialog("Tall n: ");
		int n = Integer.parseInt(inTxt);
			
		int sum = n;
		for(int i = n; i > 1; i--) {
			sum *= (n-1);
			n--;

		}
		showMessageDialog(null, sum);
		
		}
			
			

	}



