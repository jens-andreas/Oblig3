import java.util.ArrayList;
import java.util.Collections;

public class TestKort {

    public static void main(String[] args) {
        
        ArrayList<kort> reg = new ArrayList<kort>();
        reg.add(new ansatt("Ole Olsen", 1234,200,20));
        reg.add(new ansatt("Vidar Weq", 8080, 220, 40));
        reg.add(new gjest("Marit Olsen"));
        reg.add(new gjest("Jørgen Olsen"));
        reg.add(new ansatt("Are Amundsen", 1234, 160, 1));
        
        Collections.sort(reg);
        
        for (int i=0; i<reg.size(); i++) {
            kort kort = (kort)reg.get(i);
            System.out.print("\n"+ kort);
            System.out.println("\nTest av kort: med kode 1234 er" + (kort.sjekkPin(1234) ?  " gyldig" :  " ugyldig" ) );
            System.out.println("Test av kort: med kode 9999 er" + (kort.sjekkPin(9999) ?  " gyldig" :  " ugyldig" ) );
        }
        
        ansatt kort = (ansatt)reg.get(0);
       
        try {
        	ansatt kortKlone = (ansatt)kort.clone();
        	System.out.println("\nFølgende er resultatet fra klonen: \n"+ kortKlone);
            System.out.println("\nTest av kort: med kode 1234 er" + (kortKlone.sjekkPin(1234) ?  " gyldig" :  " ugyldig" ) );
            System.out.println("Test av kort: med kode 9999 er" + (kortKlone.sjekkPin(9999) ?  " gyldig" :  " ugyldig" ) );
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone is not suppoerted.");
		} 
        
        
        
    }
}
