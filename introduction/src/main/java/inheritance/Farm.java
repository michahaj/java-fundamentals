package inheritance;

public class Farm {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();

//        sasha.scratch() - error, bcs sasha's type is Animal
        ((Cat)sasha).scratch(); // type casting

        feed(sasha);
    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Dog food");
        }
        else if (animal instanceof Cat) {
            System.out.println("Cat food");
        }
    }
}
