package HomeWorkApp06;

public class Dog extends Animals {

    public static int countDog = 0;

    Dog(String name, String type) {
        super(name, type);
        ++countDog;
    }

}
