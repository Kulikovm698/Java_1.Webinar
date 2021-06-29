package HomeWorkApp06;

import java.util.Random;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobik", "Dog");
        Dog dog2 = new Dog("Bim" , "Dog");
        Cat cat1 = new Cat("Barsik","Cat");
        Cat cat2 = new Cat("Pushok", "Cat");
        Cat cat3 = new Cat("Tim", "Cat");

        dog1.run(random.nextInt(500));
        dog1.swim(random.nextInt(10));
        System.out.println("*****************************");

        dog2.run(random.nextInt(500));
        dog2.swim(random.nextInt(10));
        System.out.println("*****************************");

        cat1.run(random.nextInt(200));
        cat1.swim(10);
        System.out.println("*****************************");

        cat2.run(random.nextInt(200));
        cat2.swim(10);
        System.out.println("*****************************");

        cat3.run(random.nextInt(200));
        cat3.swim(10);

        System.out.println("Animals: " + Animals.countAnimals + ";" + " Dog: " + Dog.countDog + ";" + " Cat: " + Cat.countCat + ";");

    }

}
