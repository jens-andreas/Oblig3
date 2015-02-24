import java.util.Calendar;

/**Ansatt utvider kort.
 * Klassen lagrer og administerer data om ansattes kort*/
public class ansatt extends kort {
	
	ansatt(String navn, int pin){
		super(navn, pin);
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
}
