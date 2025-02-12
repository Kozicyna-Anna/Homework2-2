public class Huffiepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honest;

    public Huffiepuff(String name,
                      int magicPower,
                      int transgressionDistance,
                      int diligence,
                      int loyalty,
                      int honest) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonest() {
        return honest;
    }
    public void compare(Huffiepuff other) {
        var s1 = this.sum();
        var s2 = other.sum();
        if (s1 > s2) {
            System.out.println(this.getName() + "лучший Пуффендуец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + "лучший Пуффендуец, чем " + this.getName());
        }
    }
    public String toString() {
        return ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honest=" + honest;

    }
}



