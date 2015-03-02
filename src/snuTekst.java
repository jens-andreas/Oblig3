import java.util.Scanner;

public class snuTekst {
	public static void main(String[] args){
		
			while(true){
			Scanner input = new Scanner(System.in);
			System.out.print("\nSkriv inn en streng: ");
			String inputStreng = input.nextLine();
			System.out.print("Strengen skrevet baklengs: ");
			baklengs(inputStreng);
			
		}
	}
	
	public static void baklengs(String tekst){
		baklengs(tekst, new int[256], tekst.length());
	}
	
	public static void baklengs(String tekst, int[] charListe, int siste){
		int lengde = tekst.length();
		if(siste > 0){
			System.out.print(tekst.charAt(siste - 1));
			charListe[(int)(Character.toLowerCase(tekst.charAt(siste - 1)))]++;
			baklengs(tekst,charListe,siste - 1);
		}else{
			for (int i = 0; i < charListe.length; i++){
				if(charListe[i] > 0){
					System.out.print("\nTegnet " + (char)i + " forekommer " + charListe[i] + " ganger.");
				}
			}
			System.out.println("");
		}
	}
}