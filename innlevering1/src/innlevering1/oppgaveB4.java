package innlevering1;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class oppgaveB4 {

	public static void main(String[] args) {
		
		
		String funksjonTxt = "Bruttoinntekt:";

		String valgTxt = showInputDialog(funksjonTxt);
		
		
		int BInntekt = parseInt(valgTxt);
		
		
		
		
		double Skatt = 0 ;
		int SkattInt = 0;
		
		if(0<BInntekt && BInntekt < 190000) {
			System.out.println("Ingen trinnskatt");
			
			System.out.print(SkattInt + "kr skatt på inntekt("+ BInntekt + "kr)");
		
		}
		else if (190000 < BInntekt && BInntekt <= 267000) {
			System.out.println("1,7% trinnsaktt");
			Skatt = BInntekt*0.017;
			SkattInt = (int)Skatt;
			
			System.out.print(SkattInt + "kr skatt på inntekt("+ BInntekt + "kr)");
		}
		else if (267000 < BInntekt && BInntekt <= 643000) {
			System.out.println("4% trinnsaktt");
			Skatt = BInntekt*0.04;
			SkattInt = (int)Skatt;
			
			System.out.print(SkattInt + "kr skatt på inntekt("+ BInntekt + "kr)");
			
		}
		else if (643000 < BInntekt && BInntekt <= 969000) {
			System.out.println("13,4% trinnsaktt");
			Skatt = BInntekt*0.134;
			SkattInt = (int)Skatt;
			
			System.out.print(SkattInt + "kr skatt på inntekt("+ BInntekt + "kr)");
		}
		else if (969000 < BInntekt && BInntekt <= 2000000) {
			System.out.println("16.4% trinnsaktt");
			Skatt = BInntekt*0.164;
			SkattInt = (int)Skatt;
			
			System.out.print(SkattInt + "kr skatt på inntekt("+ BInntekt + "kr)");
		}
		else if (2000000 < BInntekt) {
			System.out.println("17.4% trinnsaktt");
			Skatt = BInntekt*0.174;
			SkattInt = (int)Skatt;
			
			System.out.print(SkattInt + "kr skatt på inntekt("+ BInntekt + "kr)");
		}
		else {
			System.out.println("Ugyldig");
			
		}
		
		

	}

}
