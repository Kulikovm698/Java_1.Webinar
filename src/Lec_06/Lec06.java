package Lec_06;

import java.util.Random;

public class Lec06 {

    private static Random random = new Random();

    public static void main(String[] args) {
//        Hero hero = new Hero("Hero",1,1,1,1);

        Paladin paladin = new Paladin("Paladin", 100,
                2,30,75);
        Archer archer = new Archer("Archer", 50,5,
                100,2);
        Mage mage = new Mage("Mage", 10,10,
                60,1);
        Titan titan = new Titan("Titan", 1000,200,
                150,100);

        Hero[] army = {paladin, archer,mage,titan};
        for (int i = 0; i < army.length; i++) {
            army[i].dealDamage();
            if(army[i] instanceof Paladin){
                Paladin tmpPaladin = (Paladin) army[i]; //преобразование типов. Временная переменная tmpPaladin.
                tmpPaladin.defense();
            }
        }

//        Paladin paladinTest = new Paladin("Test Paladin");
//
//        Paladin paladin0 = new Paladin("Test Paladin 0", 10.0f);

//        paladinTest.speak();
//        paladinTest.dealDamage();
//        paladinTest.healSelf(random.nextInt(500));
//        paladinTest.defense();


//        paladin.speak();
//        paladin.dealDamage();
//        paladin.healSelf(random.nextInt(500));
//        paladin.defense();
//
//        archer.speak();
//        archer.dealDamage();
//        archer.healSelf(random.nextInt(500));
//
//        mage.speak();
//        mage.dealDamage();
//        mage.healSelf(random.nextInt(500));
//
//        titan.speak();
//        titan.dealDamage();
//        titan.healSelf(random.nextInt(1000));
//        titan.defense();

    }
}
