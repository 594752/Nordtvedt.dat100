package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveB5c {

	public static void main(String[] args) {
	
        //OPPGAVE B5  C

final int ANTALL_ELEVER = 10;


for(int i=1; i<= ANTALL_ELEVER;i++) {
   String inTxt = showInputDialog("Skriv inn antall poeng: ");
   int a = Integer.parseInt(inTxt);

   if( a >= 0 && a <= 39) {
       System.out.println("Karakter: F");
   } else if (a >=40 && a <=49) {
       System.out.println("Karakter: E.");
   } else if (a >=50 && a <=59) {
       System.out.println("Karakter: D");
   } else if ( a >= 60 && a <=79) {
       System.out.println("Karakter: C.");
   } else if ( a >= 80 && a <= 89) {
       System.out.println("Karakter: B.");
   } else if ( a >= 90 && a <=100) {
       System.out.println("Karakter: A.");
   } else {
       System.out.println("Ugyldig antall poeng.");
       
   }
}
 

	}


}
