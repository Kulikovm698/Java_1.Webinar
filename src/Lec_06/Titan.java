package Lec_06;

public class Titan extends Paladin{

    public Titan(String name, int health, int power, int attack, int defense) {
        super(name, health, power, attack, defense);
    }

    @Override  //переопределение
    public void healSelf(int valueUpHp){
        System.out.println(name + " don't heal self");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println(name + " do something");
    }
}
