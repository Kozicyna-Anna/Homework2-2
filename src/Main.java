public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Harry Potter", 55, 27, 44, 32,20);
        Gryffindor ron = new Gryffindor("Ron Weasley", 40,23,19,55,12 );
        harry.compare(ron);

        Slytherin drako = new Slytherin("Drako Malfoy", 33, 9, 45, 20, 12, 28, 18);

        harry.compare(drako);
    }
}