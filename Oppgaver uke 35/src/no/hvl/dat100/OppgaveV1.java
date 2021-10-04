package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveV1 {

	public static void main(String[] args) {
		
		//Oppgave v1 A
	
	String tallStreng = showInputDialog("Tall 1: ");
	int a = Integer.parseInt(tallStreng);
	
	String tallStreng2 = showInputDialog("Tall 2: ");
	int b = Integer.parseInt(tallStreng2);
	
	String tallStreng3 = showInputDialog("Tall 3: ");
	int c = Integer.parseInt(tallStreng3);
	
	if(a < b && b < c) {
		System.out.println(a + "," +  b + "," + c);
		
	}
    if(a < c && c < b) {
    	System.out.println(a + "," +  c + "," + b);
    	
    }
    if(b < c && c < a) {
    	System.out.println(b + "," +  c + "," +  a);
    	
	}
    if(b < a && a < c) {
    	System.out.println(b + "," +  a + "," +  c);
    	
    }
    if(c < b && b < a) {
    	System.out.println(c + "," +  b + "," +  a);
    	
    }
    if(c < a && a < b) {
    	System.out.println(c + "," +  a + "," +  b);
    	
    }	
    	//Oppgave v1 B
    
    
	}    	
    	
    	
	}


