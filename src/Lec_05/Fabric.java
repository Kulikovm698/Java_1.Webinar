package Lec_05;

/**
   Класс - это новый тип данных. Это шаблон (чертеж)
 Когда декомпозируем какой-то объект до мельчайших частиц - это и будут примитивы. Из примитивов создаем совой объект,
 который потом закладывается в классе.


   Главное правило Java  - если явно не объявили конструктор в Java, а
 именно в классе, то конструктор создается по умолчанию пустой (без
 аргументов)

  Конструктор - это определенный набор правил, по которому собирается
 объект. Сборка объекта - это некое действие (действие - это методы).
 Конструктор - это тот же самый метод, только этот метод вызывается всегда
 при создании объекта в первую очередь.

   ООП строится на трех китах: инкапсуляция, наследование и полиморфизм

 Инкапсуляция по-простому - сокрытие информации (или сокрытие реализации):
 1. При создании класса - поля класса должны быть private;

   Модификатор доступа public - любое поле, класс, метод либо конструктор будет доступен
 всегда, везде и из любой точки проекта.

   Модификатор доступа private - любое поле, конструктор, методы или вложенный класс
 никогда не будет доступен из вне, только внутри класса.

   Модификатор доступа default (или package private) - любое поле, вложенный класс,
 конструктор либо метод будет доступен в рамках одного пакета (package).

   Модификатор доступа protected - все поля, методы, вложенные классы либо конструкторы
 будут доступны только классом наследником.

   Конвенция разработчиков Java: когда создаем новый класс, который будущий объект,
 все поля, только поля, должны быть private всегда и везде, за исключением некоторых
 случаев.

  Механизм getter или(setter) - это методы, которые создает разработчик, чтобы дать явный доступ
 либо к чтению, либо к записи текущего поля. Эти методы всегда public.


   Static - если помечаем поле, метод и класс, то данная сущность, которая перечислена,
 хранится не внутри объекта, а внутри класса.
 Статичные методы, статичные поле или статичный класс принадлежит самому классу ,а не объекту
 и из статики нельзя взаимодействовать с полями объекта.

 Делая каждый класс, каждый метод, каждое поле внутри класса - мы уходим от ООП и возвращаемся
 к процедурному.

 **/


public class Fabric {

    public static void main(String[] args) {
//        Hero hero1 = new Hero();
       Hero hero1 = new Hero(150, 50, "Patric");

//        Hero hero2 = new Hero(999, 1508, "Lancelot");
//
//
//        System.out.println(hero1.getHealth());
//        System.out.println(hero1.getSpeed());
//        System.out.println(hero1.getName());
//
//
//        hero1.setName("Qwerty");
//        System.out.println(hero1.getName());

//        System.out.println(Hero.voice);

//        Hero.Sword.attack = 999999;
//        System.out.println(Hero.Sword.attack);
//
//        Hero.Sword sword = new Hero.Sword();
//        sword.dealDamage();

//        Hero hero3 = new Hero();
//        hero3.speak();
//        hero3.move();
//        hero3.damage();



        System.out.println("***********************");

        //обращаемся к объекту (конкретному полю)
//        hero1.health = 150;
//        hero1.speed = 50;
//        hero1.name = "Patrik";

//        hero2.health = 999;
//        hero2.speed = 1508;
//        hero2.name = "Lancelot";

//        System.out.println(hero1.name);
//        System.out.println(hero1.health);
//        System.out.println(hero1.speed);
//        System.out.println(hero1.name + " has health " + hero1.health);
//
//        hero1.move();
//        hero1.speak();
//        hero1.damage();
//
//        hero1.sword.atkSpeed = 10.5f;
//        hero1.sword.attack = 169;
//        hero1.sword.weight = 900;
//
//
//        hero2.sword.attack = 999;
//        hero2.sword.weight = 1500;
//        hero2.sword.atkSpeed = 10;
//
//        System.out.println(hero1.sword.attack + " " + hero2.sword.weight);

//        System.out.println("**************************");
//
//        System.out.println(hero2.name + " has health " + hero2.health);
//
//        hero2.move();
//        hero2.speak();
//        hero2.damage();

//        System.out.println("I print hero - object: " + hero1);


    }
}
