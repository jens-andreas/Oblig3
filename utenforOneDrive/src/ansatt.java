import java.util.Calendar;

/**Ansatt utvider kort og implementerer Fast.
 * Klassen lagrer og administerer data om ansattes kort*/
public class ansatt extends kort implements Fast{

	int timelønn;
	int ansinitet;
	double kredittFaktor = 100;
	double bonusFaktor = 2000;
	
	ansatt(String navn, int pin, int timelønn, int ansinitet){
		super(navn, pin);
		this.timelønn = timelønn;
		this.ansinitet = ansinitet;
		settFulltNavn(navn);
	}
	
	public boolean sjekkPin(int pin){
		return (pin == this.pin);
	}
	
	public boolean sjekkTid(){
		Calendar tid = Calendar.getInstance();
		return (tid.HOUR_OF_DAY > 7) && (tid.HOUR_OF_DAY < 17);
	}
	
	public boolean brukKort(){
		return brukKort(0000);
	}
	
	public boolean brukKort(int pin){
		boolean rettPin = sjekkPin(pin);
		boolean sperret = isSperret();
		boolean tidOK 	= sjekkTid();
		return !sperret && (tidOK || rettPin);
	}
	
	public void settFornavn(String fornavn){
		this.fornavn = fornavn;
	}
	
	public String hentFornavn(){
		return fornavn;
	}
	
	public void settEtternavn(String etternavn){
		this.etternavn = etternavn;
	}
	
	public String hentEtternavn(){
		return etternavn;
	}
	
	
	public String hentFulltNavn(){
		return fornavn + " " + etternavn;
	}
	
	public double beregnKreditt(){
		return timelønn * kredittFaktor;
	}
	
	public double beregnBonus(){
		return ansinitet * bonusFaktor;
	}
	
}
