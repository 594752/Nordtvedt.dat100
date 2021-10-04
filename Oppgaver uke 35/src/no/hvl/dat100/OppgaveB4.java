package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB4 {

	public static void main(String[] args) {
		
		String tallStreng  = showInputDialog("Inntekt: ");
		double lonn = Integer.parseInt(tallStreng);	
		
		//Har brukt tallene og satsene fra oppgavesettet! Skal innleveres!
		
		double a = 0.0;
		double b = lonn *0.9907;
		double c = lonn *0.9759;
		double d = lonn *0.8848;
        double e = lonn *0.8548;
		
	if(0 <= lonn && lonn <= 164100.0) {
		System.out.println( "Trinnskatten med denne lønnen blir  " + ": " + a);
		System.out.println( "Nettolønnen med denne trinnskattn er " + ":" + (lonn - a));
	}
    if(164101.0 <= lonn && lonn <= 230950.0) {
    	System.out.println("Nettolønnen med denne trinnskattn er " + ": " +  b);
    	System.out.println( "Trinnskatten med denne lønnen blir " + ":" + (lonn - b));
    }
	if(230951.0 <= lonn && lonn <= 580650.0) {
		System.out.println("Nettolønnen med denne trinnskattn er " + ": " + c);
		System.out.println( "Trinnskatten med denne lønnen blir " + ":" + (lonn - c));
	}
	if(580651.0 <= lonn && lonn <= 934050.0) {
		System.out.println("Nettolønnen med denne trinnskattn er " + ": " + d);
		System.out.println( "Trinnskatten med denne lønnen blir " + ":" + (lonn - d));
	}
	if(lonn >= 934051.0) {
		System.out.println("Nettolønnen med denne trinnskattn er " + ": " + e);
		System.out.println( "Trinnskatten med denne lønnen blir " + ":" + (lonn - e));
	}if (lonn < 0){
		System.out.println("Ugyldig verdi");
	}	
	
	}
}