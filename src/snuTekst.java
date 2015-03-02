import java.util.Scanner;

public class snuTekst {
	public static void main(String[] args){
		
			while(true){
			Scanner input = new Scanner(System.in);
			System.out.print("\nSkriv inn en streng: ");
			String inputStreng = input.nextLine();
			System.out.print("Strengen skrevet baklengs: ");
			baklengs(inputStreng, new int[256]);
			
		}
	}
	
	public static void baklengs(String tekst, int[] charListe){
		int lengde = tekst.length();
		if(lengde > 0){
			System.out.print(tekst.charAt(lengde - 1));
			charListe[(int)(Character.toLowerCase(tekst.charAt(tekst.length() - 1)))]++;
			baklengs(tekst.substring(0, lengde - 1),charListe);
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