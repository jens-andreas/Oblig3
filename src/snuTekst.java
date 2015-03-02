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
		int lengde = tekst.length();
		if(lengde > 0){
			System.out.print(tekst.charAt(lengde - 1));
			baklengs(tekst.substring(0, lengde - 1));
		}
	}
}