package praticaPoo;
public class Fighter {
    private String name, nation, category;
    private double height, weight;
    private int age, victories, ties, defeats;

    public void toPresent() {
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + getName());
        System.out.println("Origem " + getNation());
        System.out.println(getAge() + " anos");
        System.out.println(getHeight() + " m de altura");
        System.out.println(getWeight() + " Kg");
        System.out.println("Vitórias: " + getVictories());
        System.out.println("Derrotas: " + getDefeats());
        System.out.println("Empates: " + getTies());
    }
    public void status() {
        System.out.println(getName());
        System.out.println("é um peso " + getCategory());
        System.out.println(getVictories() + " vitórias");
        System.out.println(getDefeats() + " derrotas");
        System.out.println(getTies() + " empates");
    }
    public void winFight() {
        this.setVictories(this.getVictories() + 1);
    }
    public void loseFight() {
        this.setDefeats(this.getDefeats() + 1);
    }
    public void tieFight() {
        this.setTies(this.getTies() + 1);
    }

    public Fighter(String name, String nation, int age, double height, double weight, int victories, int ties, int defeats) {
        this.name = name;
        this.nation = nation;
        this.age = age;
        this.height = height;
        this.setWeight(weight);
        this.victories = victories;
        this.ties = ties;
        this.defeats = defeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if (this.weight < 52.2) {
            this.category = "Inválido";
        } else if (this.weight <= 70.3) {
            this.category = "Leve";
        } else if (this.weight <= 83.9) {
            this.category = "Médio";
        } else if (this.weight <= 120.2) {
            this.category = "Pesado";
        } else {
            this.category = "Inválido";
        }
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    @Override
    public String toString() {
        return "Lutador " +
                "name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", category='" + category + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                ", victories=" + victories +
                ", ties=" + ties +
                ", defeats=" + defeats;
    }
}
