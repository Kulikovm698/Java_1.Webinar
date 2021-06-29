package Lec_05;

public class Hero {

    //параметры героя
    private int health; // поля класса
    private int speed;
    private String name;
    private Sword sword;


    public static String voice = "Hello_I'm_Hero";

    //создаем свой конструктор. Конструктор должен содержать то же имя, что и класс, в котором он находится.
//    Hero(){
//        speak();
//        sword.dealDamage();
//    }

  public  Hero(int valueHealth, int valueSpeed, String valueName){
        health = valueHealth;
        speed = valueSpeed;
        name = valueName;
        sword = new Sword();
    }

//    Hero(int valueHealth, int valueSpeed){
//        health = valueHealth;
//        speed = valueSpeed;
//        name = "Test hero";
//    }


    void move(){
        System.out.println(name + " has move with speed "+ speed);
    }

    void speak(){
        System.out.println(name + " says Hello!");
    }

    void damage(){
        health -= 10;
        System.out.println(name + " has damage 10pnt. My health now is " + health);
    }

    // создаем класс внутри класса (создали мечь для персонажа)
    public static class Sword {
       static int attack = 150;
        int weight;
        float width;
        float atkSpeed;

        void dealDamage(){
            System.out.println("Our sword deal damage " + attack);
        }
    }

    //Getter - отдавать (т.е. используется только для чтения)
    public String getName(){
      return name;
    }

    public int getHealth(){
      return health;
    }
    public int getSpeed(){
      return speed;
    }

    public Sword getSword(){
      return sword;
    }

    //Setter - доступ для записи поля
    public void setName(String name){
      this.name = name;
    }

    public void setSword(Sword sword){
      this.sword = sword;
    }

}
