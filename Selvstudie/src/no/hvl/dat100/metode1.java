package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class metode1 {

	public static void main(String[] args) {

		int heltall = lesHeltall();
		showMessageDialog(null, "Heltall: " + lesHeltall());
		

	}
  private static int lesHeltall() {
	  String tallTxt = showInputDialog("Gi heltall ");
	  int tall = parseInt(tallTxt);
	  return tall;
	  
	  
  }
}
