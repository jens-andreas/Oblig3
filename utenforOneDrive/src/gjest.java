import java.util.Calendar;

/** Ansatt utvider kort
 	Klassen lagrer og administerer data om gjesters kort*/
public class gjest extends kort{
	Calendar creationDate;
	Calendar expirationDate;
	
	gjest(){
		this("Gjest");
	}
	
	gjest(String navn){
		super(navn, 9999);
		creationDate = Calendar.getInstance();
		expirationDate = Calendar.getInstance();
		expirationDate.add(Calendar.DAY_OF_YEAR, 7);
	}
	
	@Override
	public boolean sjekkPin(int pin) {
		return ((int)this.pin == (int)pin);
	}
	
	public Calendar getCreationDate(){
		return this.creationDate;
	}
	
	public boolean gyldigTid(){
		return Calendar.getInstance().before(expirationDate);
	}
	
	public boolean brukKort(int pin){
		boolean rettPin = sjekkPin(pin);
		boolean sperret = isSperret();
		return !sperret && rettPin;
	}
	
}
