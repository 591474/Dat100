package innlevering1;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class oppgave3 {
public static void main(String[] args) {
		
		
		
		for (int i=1; i<11; i++) {
			
			String funksjonTxt = "Poeng:";

		String valgTxt = showInputDialog(funksjonTxt);
		
		
		int Poeng = parseInt(valgTxt);
		
			
			if(0<=Poeng && Poeng<=39) {
				System.out.println("Elev: "+i+" F");
			}
			else if(40<=Poeng && Poeng<=49) {
				System.out.println("Elev: "+i+" E");
			}
			else if(50<=Poeng && Poeng<=59) {
				System.out.println("Elev: "+i+" D");
			}
			else if(60<=Poeng && Poeng<=79) {
				System.out.println("Elev: "+i+" C");
			}
			else if(80<=Poeng && Poeng<=89) {
				System.out.println("Elev: "+i+" B");
			}
			else if(90<=Poeng && Poeng<=100) {
				System.out.println("Elev: "+i+" A");
			}
			else {
				System.out.println("Feil, prøv på nytt");
				i--;
			}
			
		}
		
		
		
		

	}

}
