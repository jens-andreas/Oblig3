/**kort-klassen brukes for � lagre og administerere kortinformasjon */
public abstract class kort {

	String navn;
	short pin;
	boolean sperret;
	int aksessKode;
	
	/**Konstrukt�r. Setter navn og pin til gitte verdeier.
	 * Sier at kortet ikke er sperret.
	 * Genererer en tilfeldig aksesskode*/
	kort(String navn, short pin){
		this.navn = navn;
		this.pin = pin;
		sperret = false;
		aksessKode = (int)(Math.random() * 99999999);
	}
	
	/** Returnerer navnet p� kortholderen */
	public String getNavn(){
		return navn;
	}
	
	/**Returnerer om kortet er sperret eller ikke.*/
	public boolean isSperret(){
		return sperret;
	}
	
	public String toString(){
		return  "Navn:       " + navn +
				"\nPin :       " + pin  +
				"\nSperret:    " + sperret +
				"\nAksesskode: " + aksessKode;
	}
	
	public abstract boolean sjekkPin(short pin);
}
