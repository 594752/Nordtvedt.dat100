package no.hvl.dat100;

public class Oppgave2 {

	// Oppgave 2A
	/*public static void main(String[] args) {

		int i = 5;
		int j = 10;
		String s = "dat100";
		boolean b = true;

	   System.out.println(i * j + i);
	   System.out.println(b && i > 5);
	   System.out.println(!b || j == 10);
       System.out.println(s.substring(3, 5));
    */    

  //Oppgave 2B
   /* public static void main(String[] args) {

	System.out.println(5 + 3 * 2);
	System.out.println(9 % 5);
	System.out.println(9 / 5);
	int i = 3;
	int j = 7;

	System.out.println( (i < 3) && (j >= 5) );
	System.out.println( (j != 3) || (i < j) );
	*/



    
	public static int b(int x, int y) {

	while (x != y) {
		System.out.println("x = " + x + ", y = " + y);
		if (x > y) {
			x = x - y;
		} else {
			y = y - x;
		}
	}

	return x;
}

public static void main(String[] args) {
	System.out.println(b(28, 12));
}
}
