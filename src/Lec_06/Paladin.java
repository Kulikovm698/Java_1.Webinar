package Lec_06;

/**
 *
 * super - всегда должно быть в самом начале (пример ниже).
 * super - передает аргументы, обращаясь к родительскому классу.
 *
 */

public class Paladin extends Hero {

    private float dex;
//    public String name;

    public Paladin(String name, int health, int power, int attack, int defense) {
        super(name, health, power, attack, defense);
//        this.name = "Vasya";
    }

    public Paladin(String name){
        super (name);
    }

    public Paladin(String name, float dex){
        super(name);
        this.dex = dex;
    }

    public void defense(){
        System.out.println(name + " defense " + defense + " points");
    }

//    @Override
//    public void sleep(){
//        System.out.println(name + " sleep 1");
//    }
}
