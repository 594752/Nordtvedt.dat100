package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Tabelløving {

	public static void main(String[] args) {
	
		int [] tab = {1,3,4,65,2,3,5,6,7,8};
		System.out.println("Tabellen tab inneholder følgende: ");
		for(int i = 0; i<=tab.length-1 ; i++) {
			System.out.print(tab[i] + ", ");
		}
		System.out.println();
		int j = LesInnTall("Følgende tall er i tabellen: ");
		System.out.println(finnes(tab, j));
	    System.out.println();
	    System.out.println("Det minste tallet i tabellen er " + minst());

	}
private static boolean finnes(int [] tabell, int tall) {
	
	boolean finnes = false;
	int b =0;
	
	while(!finnes && b < tabell.length ) {
		if(tall == tabell[b]) {
			finnes = true;
		}b++;
	}
	return finnes;
}
private static int LesInnTall(String message) {
	
	String inTxt = showInputDialog(message);
	int a = Integer.parseInt(inTxt);
	
	return a;
}
private static int minst() {
	
	int [] tab = {2,3,5,6,7,8};
	
	int c = Math.min(Math.min(tab[0],Math.min(tab[1], tab[2]) ), Math.min(Math.min(tab[3], tab[4]), tab[5]));
	return c;
	
}

}
