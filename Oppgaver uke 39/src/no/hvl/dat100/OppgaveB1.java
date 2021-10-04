package no.hvl.dat100;

public class OppgaveB1 {

public static void main(String[] args) {
	
	int ANTALL = 8;
	int RADER = 6;

	boolean[][] d111 = new boolean[RADER][ANTALL];

	boolean[][] aud = 
		{ 
		  { false, false, false, false},
		  { false, false, true,  false}, 	
		  { true,  true, true,  true }, 
		  { true,  true,  true,  true }, 
	};
		
	
	
    
	int sum =0;
	
	for (int r = 0; r < aud.length; r++) {

		boolean[] rad = aud[r];

		for (int p = 0; p < rad.length; p++) {

			boolean plass = rad[p];
		
			if (plass) {
				sum += 1;
				System.out.print("X ");
			} else {
				System.out.print("O ");
			}
		}
		
	        System.out.println();
	}
	
	System.out.println("Det er totalt " + sum + " ledige plasser i auditoriummet.");
	double p = aud.length * aud[0].length;
    System.out.println((sum/p) * 100 + " av plassene i auditoriummet er ledig.");
	
	

   }
	
  
   }	   
    	
    	   
    	   


	
		
	
	
	
	




	


