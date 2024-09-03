//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //I can use animal as a type since it is the super class and can store them in arrays
        //I can use the same name for them

        Animal my_animal = new Animal();
        Animal my_dog = new Dog();
        Animal my_pig = new Pig();



        Animal[] my_animals = {my_animal, my_dog, my_pig};
        for (Animal animal : my_animals) {
            animal.animalSound();
        }

    }
}