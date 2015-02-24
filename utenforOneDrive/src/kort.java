/**kort-klassen brukes for å lagre og administerere kortinformasjon.
 * Klassen er abstrakt og skal brukes av underklasser. */
public abstract class kort {

	String navn;
	int pin;
	boolean sperret;
	int aksessKode;
	
	/**Konstruktør. Setter navn og pin til gitte verdeier.
	 * Sier at kortet ikke er sperret.
	 * Genererer en tilfeldig aksesskode*/
	kort(String navn, int pin){
		this.navn = navn;
		this.pin = pin;
		sperret = false;
		aksessKode = (int)(Math.random() * 99999999);
	}
	
	/** Returnerer navnet på kortholderen */
	public String getNavn(){
		return navn;
	}
	
	/**Returnerer om kortet er sperret eller ikke.*/
	public boolean isSperret(){
		return sperret;
	}
	
	/** Sperrer ett kort */
	public void sperrKort(){
		sperret = true;
	}
	
	/** Åpner ett kort */
	public void opneKort(){
		sperret = false;
	}
	
	/**Returnerer en streng med all data i kort-klassen*/
	public String toString(){
		return  "Navn:       " + navn +
				"\nPin :       " + pin  +
				"\nSperret:    " + sperret +
				"\nAksesskode: " + aksessKode;
	}
	
	/** Abstrakt metode som skal brukes av underklassene*/
	public abstract boolean sjekkPin(int pin);
	
	public abstract boolean brukKort(int pin);
}
