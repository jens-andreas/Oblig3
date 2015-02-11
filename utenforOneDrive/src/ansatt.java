/**Ansatt utvider kort.
 * Klassen lagrer og administerer data om ansattes kort*/
public class ansatt extends kort {
	
	ansatt(String navn, int pin){
		super(navn, pin);
	}
	
	public boolean sjekkPin(int pin){
		return pin == this.pin;
	}
}
