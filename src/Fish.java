// Fish.java
public class Fish extends Animal {
    public Fish() {
    }

    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating.");
    }

    @Override
    public String getVoice() {
        return ""; // Fish don't have vocal cords
    }
}

