package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveB1 {

	public static void main(String[] args) {
		
		String inTxt = showInputDialog("Øvre grense: ");
			int ovre = parseInt(inTxt);
			
	    String inTxt2 = showInputDialog("Nedre grense: ");
			int nedre = parseInt(inTxt2);	
				
			for(int i = nedre; i <= ovre; i++) {
			if(i % 2 != 0) {
				showMessageDialog(null, i + " ");
		
				
				
				
			}
			
				
			
		}
		
		
	}
}


		

	
