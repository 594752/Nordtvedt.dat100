package no.hvl.dat100;

public class metoderogtabeller {

	public static void main(String[] args) {
		
		VisOppgaveC();

	}
private static void VisOppgaveA() {
	
	int Antall = 20;
	
	for(int i = 1; i<=Antall;i++) {
		System.out.print(i + ", ");
	}
}	
private static void VisOppgaveB() {
	
	int [] tabell = {1, 4, 6, 7, 8, 10};
	for(int i = 0; i < tabell.length; i++) {
	System.out.println(tabell[i]);
}
}
private static void VisOppgaveC() {
	
	Multipliser(6,5);
	Multipliser(7,7);
	
}
	private static void Multipliser(int a, int b) {
		javax.swing.JOptionPane.showMessageDialog(null, (a * b));

	}


}


