package praticaPoo;

import java.util.Random;

public class Fight {
    private Fighter challenged; //desafiado
    private Fighter challenger; //desafiante
    private int rounds;
    private Boolean approved;

    public void markFight(Fighter l1, Fighter l2) {
        if (l1.getCategory().equals(l2.getCategory()) && l1 != l2) {
            this.approved = true;
            this.challenged = l1;
            this.challenger = l2;
        } else {
            this.approved = false;
            this.challenged = null;
            this.challenger = null;
        }
    }

    public void fight() {
        if(this.approved) {
            System.out.println("### DESAFIADO ###");
            System.out.println("---------------------------------");
            this.challenged.toPresent();

            System.out.println("### DESAFIANTE ###");
            System.out.println("---------------------------------");
            this.challenger.toPresent();

            Random random = new Random();
            int winner = random.nextInt(3); // 0 1 2
            System.out.println("Resultado da luta: ");

            switch (winner) {
                case 0 -> { //Empate
                    System.out.println("Empatou!");
                    this.challenged.tieFight();
                    this.challenger.tieFight();
                }
                case 1 -> { //ganhou desafiado
                    System.out.println("Vitoria do " + this.challenged.getName());
                    this.challenged.winFight();
                    this.challenger.loseFight();
                }
                case 2 -> { //ganhou desafiante
                    System.out.println("Vitoria do " + this.challenger.getName());
                    this.challenger.winFight();
                    this.challenged.loseFight();
                }
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
    public Fighter getChallenged() {
        return challenged;
    }
    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }
    public Fighter getChallenger() {
        return challenger;
    }
    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }
}
