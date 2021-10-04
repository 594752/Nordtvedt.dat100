package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class oppgave4 {

	public static void main(String[] args) {
		// Vi skal lage et program som regner en tid gitt i hele sekunder om til timer, minutter og sekunder. 
		//Antall sekunder leses inn fra dialogboks.

//antall sekund /60 gir minutter /60 gir timer
		
		//String Sekunder = showInputDialog("Sekunder ");
		//int a = Integer.parseInt(Sekunder);
		//int b = a/60;
		//int c = b/60;
		
		//System.out.print("Minutter: " + b );
		//System.out.print("Timer: " + c);	

		
		int hours, minutes, seconds;
		String sec1 = showInputDialog("Gi antall sekunder som skal gjøres om: ");
		int a = Integer.parseInt(sec1);
		
		hours = a / 3600;
		minutes = (a%3600) / 60;
		seconds = a % 60;
		
		System.out.println(hours + "timer " + minutes + "minutter og " + seconds + "sekunder. ");
		
	}

}
