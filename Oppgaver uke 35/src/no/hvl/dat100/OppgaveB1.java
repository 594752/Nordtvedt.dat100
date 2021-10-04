package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class OppgaveB1 {

	public static void main(String[] args) {
		
		Double VolumeSphere;
		String radius = showInputDialog("Skriv kulens radius ");
		Double a = Double.parseDouble(radius);
		
		
		Double b = 4.0;
		Double c = 3.0;
		
		VolumeSphere = (b/c * PI) * Math.pow(a, 3);
		
		System.out.println(" Volum av kula er: " + VolumeSphere);
		
		
	}

	
}