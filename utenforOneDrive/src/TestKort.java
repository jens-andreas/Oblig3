import java.util.ArrayList;

public class TestKort {

    public static void main(String[] args) {
        
        ArrayList<kort> reg = new ArrayList<kort>();
        
        kort k1 = new ansatt("Ole Olsen", 1234);
        kort k2 = new gjest("Marit Olsen");
        reg.add(k1);
        reg.add(k2);

        for (int i=0; i<reg.size(); i++) {
            kort kort = (kort)reg.get(i);
            System.out.print("\n"+ kort);
            System.out.println("\nTest av kort: med kode 1234 er" + (kort.sjekkPin(1234) ?  " gyldig" :  " ugyldig" ) );
            System.out.println("Test av kort: med kode 9999 er" + (kort.sjekkPin(9999) ?  " gyldig" :  " ugyldig" ) );
        }
    }
}
