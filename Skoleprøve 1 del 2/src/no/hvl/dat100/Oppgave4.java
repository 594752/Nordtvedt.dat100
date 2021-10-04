package no.hvl.dat100;

public class Oppgave4 {

	public static void main(String[] args) {
		
   
   int min = minst(2,4,1);
   System.out.println(min);
		
	}
private static int minst(int a, int b, int c) {
	
	int min = Math.min(a, (Math.min(b, c)));
	return min;
}


}
