package Lec_06;

/**
Наследование

  Конструктор родительского класса нужен для того, чтобы собрать по определенным правилам те объекты, которые обращаются к текущему конструктору.

  protected - предоставляет доступ своим наследникам

 От родителя к наследнику - каскадное наследование

 Полиморфизм - изменение формы метода

 Абстрактный метод - это тот метод, у которого нет реализации. Абстрактные методы (классы)
 нельзя создать в качестве объекта. А использовать в качестве родительского класса можно

 **/
public  class Hero {

    protected String name;
    protected int health;
    protected int power;
    protected int attack;
    protected int defense;

    public Hero(String name, int health, int power, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.attack = attack;
        this.defense = defense;
//        System.out.println("this is something text form constructor hero");
    }

    public Hero(String name){
        this.name = name;
        speak();
    }

    public void speak(){
        System.out.println(name + " says Hello!");
    }

    public void dealDamage(){
        System.out.println(name + " deals damage " + attack * power);
    }

    public void healSelf(int valueUpHp){
        this.health += valueUpHp;
        System.out.println(name + " heal self to " + valueUpHp + ". My health now " + health);
    }



}
