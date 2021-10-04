package no.hvl.dat100;

public class OppgaveG1 {

	public static void main(String[] args) {
		
		double[][] obs = {
				{1.4,1.7,1.9,2.0},
				{5.4,7.8,9.8,7.9,3.0},
				{-1.7,-1.7,-2.8}
		};
		
		
		skrivUt(obs);
		System.out.println(finnes(obs, 7.3));
		
		System.out.println(obs.length);
		System.out.println(obs[0].length);
		System.out.println(obs[1].length);
		System.out.println(obs[2].length);
	
	
	}

public static void skrivUt(double[][] tabell) {     //FEIL!!!!!!!
	
   double [][] obs = {
			{1.4,1.7,1.9,2.0},
			{5.4,7.8,9.8,7.9,3.0},
			{-1.7,-1.7,-2.8}
	};
   double [] tmp = obs[0];
  	obs[0] = obs [2];
  	obs[2] = tmp;
    
    for(int i = 0; i < obs.length; i++) {
		for(int j = 0; j < obs[i].length; j++) 
			System.out.print(obs[i][j] + " ");
	
	System.out.println();

	}
   
	
	
}
	
	
	

public static boolean finnes(double[][] obs, double limit) {
	
	double a = 0;
	boolean finnes = false;
	
	while(!finnes && a <= obs.length) {
		if(limit == a) {
			finnes = true;
		}a++;
	}
	
	return finnes;

} 


}

	