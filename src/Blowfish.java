public class Blowfish extends Fish implements AnimalBehavior, AnimalMove,AnimalName {
    public Blowfish() {
    }

    public Blowfish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println("Blowfish is eating.");
    }

    @Override
    public String getVoice() {
        return "Blub";
    }

    public void inflate() {
        System.out.println("Blowfish is inflating.");
    }

    @Override
    public void sleep() {
        System.out.println("Blowfish is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish moves.");
    }
}
