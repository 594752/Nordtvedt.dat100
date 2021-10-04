package no.hvl.dat100;

public class Oppgave1 {

	public static void main(String[] args) {
		
   oppgaveC();
   
	}
 private static void oppgaveA() {
	
	int a = 0;
	
	if(a<0) {
		System.out.println(a + " er mindre enn 0.");
	}
	else if(a == 0) {
		System.out.println(a + " er lik 0.");
	}
	else {
		System.out.println(a + " er større enn 0.");
	}
}

 private static void oppgaveB() {
	 
	 int b = 0;
	 
	 if(b >= 5 && b <=7) {
		 System.out.println(b + " er innenfor intervallet.");
	 }else {
		 System.out.println(b + " er utenfor intervallet.");
	 }
 }
 
 private static void oppgaveC() {
	 
	 int c = 4;
	 
	 switch(c) {
	 case 0: //c = 0;
	   System.out.println("null");
	   break;
	 case 1:// c = 1;
	   System.out.println("en");
	   break;
	 case 2: //c = 2;
	   System.out.println("to");
	   break;
	 case 3: //c = 3;
	   System.out.println("tre");
	   break;
	 case 4: //c = 4;
	   System.out.println("fire");
	   break;
	 default:
		System.out.println("andre");
		
	 }
 }
 
 
 
}
