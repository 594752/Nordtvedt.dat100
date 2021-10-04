package no.hvl.dat100;

public class OppgaveG4 {

	public static void main(String[] args) {

			    int i;

			    System.out.println("Test av repetisjonssetning.");
			    System.out.println("***************************");

			    i = 1;

			    while (i <= 10) {
			      System.out.println("Dette er linje nr. " + i);

			      if (i == 4) {
			        System.out.println();
			      }

			      if (i == 8) {
			        System.out.println();
			      }

			      i = i + 1;
			    }
			  }
			

	}

// Programmet printer linje 9 og 10 deretter teller den nedover med "dette er linje nr." også variabelen  (i). Siden linje 25 endrer variabelen så 
// vil linje 17 og 21 printes med 1 verdi høyere 5 istedenfor 4 og 9 istedenfor 8.
