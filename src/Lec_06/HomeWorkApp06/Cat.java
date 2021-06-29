package HomeWorkApp06;

public class Cat extends Animals {

    public static int countCat = 0;

    public Cat(String name, String type) {
        super(name, type);
        ++countCat;
    }
    @Override
    public void swim(int length){
        System.out.println(type + " " + name + " can't swim ");
    }
}
