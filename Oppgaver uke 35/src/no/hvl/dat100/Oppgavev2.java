package no.hvl.dat100;

public class Oppgavev2 {

	public static void main(String[] args) {
				
				Double VolumeSphere;
				String radius = javax.swing.JOptionPane.showInputDialog("Skriv kulens radius ");
				Double a = Double.parseDouble(radius);
				
				
				Double b = 4.0;
				Double c = 3.0;
				
				VolumeSphere = (b/c * java.lang.Math.PI) * Math.pow(a, 3);
				
				System.out.println(" Volum av kula er: " + VolumeSphere);
				
	}

}
