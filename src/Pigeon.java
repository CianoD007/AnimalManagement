public class Pigeon extends Bird implements AnimalBehavior, AnimalMove ,AnimalName{
    private String species;

    public Pigeon() {
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("Pigeon is eating.");
    }

    @Override
    public String getVoice() {
        return "Coo";
    }

    public void fly() {
        System.out.println("Pigeon is flying.");
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Pigeon flies.");
    }
}