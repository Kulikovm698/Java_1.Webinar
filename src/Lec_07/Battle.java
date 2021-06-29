package Lec_07;

public class Battle {

    private static int round = 1;

    public static void main(String[] args) throws InterruptedException {

        LightSoldier lightSoldier = new LightSoldier("LightSoldier", 15,25f,100f);
        DarkSoldier darkSoldier = new DarkSoldier("DarkSoldier", 20,5f,150f);


        while (!lightSoldier.isDeadHero() || !darkSoldier.isDeadHero()){
            System.out.println("*** Round " + round + " ***");
            System.out.println(lightSoldier.getMeInfo());
            System.out.println(darkSoldier.getMeInfo());

            lightSoldier.attack(darkSoldier);
            if(darkSoldier.isDeadHero()){
                System.out.println(lightSoldier.getName() + " win!");
                break;
            }

            darkSoldier.attack(lightSoldier);
            if(lightSoldier.isDeadHero()){
                System.out.println(darkSoldier.getName() + " win!");
                break;
            }
            round++;

            Thread.sleep(3000);
        }
    }
}
