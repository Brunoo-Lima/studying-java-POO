import praticaPoo.Luta;
import praticaPoo.Lutador;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Pratica {
    public static void main(String[] args) {

        ArrayList<Lutador> lutador = new ArrayList<>(){{
           add(new Lutador("Bruno","Brasil",23, 1.62,62.5,11,2,1));
           add(new Lutador("Miguel","França",20, 1.82,68.5,8,2,1));
        }};

        System.out.println(lutador);


        Luta ufc = new Luta();
        ufc.markFight(lutador.get(0), lutador.get(1));
        ufc.fight();

        lutador.get(0).status();
        lutador.get(1).status();
    }
}