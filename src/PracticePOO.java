import praticaPoo.Fight;
import praticaPoo.Fighter;
import java.util.ArrayList;

public class PracticePOO {
    public static void main(String[] args) {

        ArrayList<Fighter> fighter = new ArrayList<>(){{
           add(new Fighter("Gus","Brasil",23, 1.62,62.5,11,2,1));
           add(new Fighter("Irinov","França",20, 1.82,68.5,8,2,1));
        }};

        System.out.println(fighter);


        Fight ufc = new Fight();
        ufc.markFight(fighter.get(0), fighter.get(1));
        ufc.fight();

        System.out.println("-----------------------------");
        fighter.get(0).status();
        System.out.println("-----------------------------");
        fighter.get(1).status();
    }
}