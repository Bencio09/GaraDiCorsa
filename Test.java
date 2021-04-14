
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author loreb
 */
public class Test {
    public static void main(String[] args) {
        
        Corridore.setMetri(100);
        Corridore.setTempoDiStampa(1);
        Corridore.setArrivato(true);
        ArrayList<Corridore> listaCorridori = new ArrayList<>();
        int n = 10;
        
        for (int i = 0; i < n; i++) {
            listaCorridori.add(new Corridore("Corridore" + (i+1)));
        }
        
        for (int i = 0; i < listaCorridori.size(); i++) {
            Corridore c = listaCorridori.get(i);
            c.start();
        }
        for (int i = 0; i < listaCorridori.size(); i++) {
            Corridore c = listaCorridori.get(i);
            try {
                c.join();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        Corridore.stampaClassifica();
    }
}
