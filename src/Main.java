public class Main {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        // animal[0] = new Animal();
        animal[0] = new Mammal("tim", 2,4);
        animal[1] = new Dog("Butkus", 5,15);
        animal[2] = new Bird("Platypus", 2,1,"White");
        animal[3] = new Pigeon("Pablo", 10,1,"Grey", "spain");
        animal[4] = new Fish("tony", 2,5);
        animal[5] = new Blowfish("Blowfish", 5,2);
//
//        animal[1].getVoice();
//        animal[2].getVoice();

        AnimalBehavior animalBehavior[] = new AnimalBehavior[3];
        animalBehavior[0] = new Dog("Butkus", 5,15);
        animalBehavior[1] = new Pigeon("Pablo", 10,1,"Grey", "spain");
        animalBehavior[2] = new Blowfish("Blowfish", 5,2);

        animalBehavior[0].sleep();
        animalBehavior[1].sleep();
        animalBehavior[2].sleep();

        //foreach loop
        for (Animal a : animal) {
            a.move(a);
        }

        for (Animal a : animal) {
            AnimalName.name(a.getName());
        }
    }
}