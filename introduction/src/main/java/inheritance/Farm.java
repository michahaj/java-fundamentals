package inheritance;

public class Farm {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.makeSound();

        Animal sasha = new Dog();
        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();
    }

}
