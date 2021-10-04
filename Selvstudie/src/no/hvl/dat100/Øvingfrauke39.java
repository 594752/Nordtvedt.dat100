package no.hvl.dat100;

public class Øvingfrauke39 {

	public static void main(String[] args) {
		
		int [][] mat = {
				{1, 2, 3, 4, 5, 6, 7,},
				{8, 9, 10, 11, 12, 13}
		};
		
		skrivUt(mat);
		System.out.println("Summen av linje 1 er; " + sum(mat[0]));
		System.out.println(finnes(mat, 13));
		System.out.println(skaler(mat, 2));
	}
	public static void skrivUt(int [][] matrise) {
		
		
		
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
			System.out.print(matrise[i][j] + ", ");
			
			
		}
		System.out.println();
	}
		
	
	}
    public static int sum(int [] matriser) {
    	
    	int total = 0;
    	for(int tall : matriser) {
    		total += tall;
    		
    	}
    	
    	
    	
      return total;
    	
    }
    public static boolean finnes(int [][] matrise, int tall) {
    	
    	boolean finnes = false;
    	int a = 0;
    	
    	for(int i = 1; i <= 2; i++) 
    		for  (int j = 1; j <= 7; j++ )
    	
    	
    	while(!finnes && a < matrise[0].length) {
    		if(tall == matrise[i][j]) {
    			finnes = true;
    		}a++;
    	
    	}
    
    	
    	
    
    	return finnes;
    }
    private static int[][] skaler(int [][] matrise, int tall) {
    	
    	int skalert [][] = new int [matrise.length][matrise[0].length];
    	
        for(int i = 0; i < matrise.length-1; i++) 
    	for( int j = 0; j < matrise[0].length; j++) 
    			skalert[i][j] = matrise[i][j]*tall;
        
        
    		
    	
return skalert;
    	
    	
    	
    	
    } 
}
