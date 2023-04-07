package praticaPoo;

import java.util.Random;

public class Luta {
    private Lutador challenged; //desafiado
    private Lutador challenger; //desafiante
    private int rounds;
    private Boolean approved;

    public void markFight(Lutador l1, Lutador l2) {
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
    public Lutador getChallenged() {
        return challenged;
    }
    public void setChallenged(Lutador challenged) {
        this.challenged = challenged;
    }
    public Lutador getChallenger() {
        return challenger;
    }
    public void setChallenger(Lutador challenger) {
        this.challenger = challenger;
    }
}
