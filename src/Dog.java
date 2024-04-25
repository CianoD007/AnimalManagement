public class Dog extends Mammal implements AnimalBehavior, AnimalMove,AnimalName {

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public String getVoice() {
        return "Woof";
    }

    public void bark() {
        System.out.println("Dog is barking.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Dog runs.");
    }
}
