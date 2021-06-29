package HomeWorkApp06;

public class Animals {

    protected String name;
    protected String type;

    public static int countAnimals = 0;
    protected Animals(String name,String type){
        this.name = name;
        this.type = type;
        ++countAnimals;
    }

    public void run(int length){
        System.out.println(type + " " + name + " ran a distance equal to " + length + " м ");

    }

    public void swim(int length){
        System.out.println(type+ " " + name + " swam the distance " + length + " м ");
    }

}
