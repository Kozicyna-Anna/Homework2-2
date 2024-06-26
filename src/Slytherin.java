public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lust;
    public Slytherin(String name,
                     int magicPower,
                     int transgressionDistance,
                     int cunning, int determination,
                     int ambition, int resourcefulness,
                     int lust) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lust = lust;
    }
    public int getCunning() {
        return cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public int getLust() {
        return lust;
    }
    public void compare(Slytherin other) {
        var s1 = this.sum();
        var s2 = other.sum();
        if (s1 > s2) {
            System.out.println(this.getName() + "лучший Слизиринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + "лучший Слизиринец, чем " + this.getName());
        }
    }
    public String toString() {
        return ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lust=" + lust;
    }
}



