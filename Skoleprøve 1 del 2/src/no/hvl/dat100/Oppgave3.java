package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave3 {

	public static void main(String[] args) {
		
		String inTxt = showInputDialog("Gi heltall som skal summeres ");
	    int  n = Integer.parseInt(inTxt);
		int sum = n;
	    int antall = 0;
		while (n != 0) {
	   inTxt = showInputDialog("Gi heltall som skal summeres ");
       n = Integer.parseInt(inTxt);

       antall++;
       sum += n;
		}
       showMessageDialog(null, "Summen av de " + antall + " innskrevne tallene er: " + sum);
		System.out.println("Sum: " + sum);
		System.out.println("Antall " + antall);
  
    	   
    	   
       }
	}


		
		
		
		
	  
	
	
	



