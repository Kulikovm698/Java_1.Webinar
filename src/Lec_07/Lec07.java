package Lec_07;

import HomeWorkApp06.Cat;
import Lec_06.Titan;

import java.util.Scanner;

/**
 Строка (String) - ссылочный тип данных

 String Pool - ссылки на строковый тип данных, содержащие одинаковое значение - объединяются до компиляции.

Приведение типов

 **/


public class Lec07 extends Object {

//    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String exampleString = "Example";//  String exampleString = new String("Example");
        StringBuilder stringBuilder = new StringBuilder("Example");

        long startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            exampleString += i;
        }

        float deltaTime = System.nanoTime() - startTime;
        System.out.println(exampleString);
        System.out.println("Work for-cycle for String = " + deltaTime * 0.000001f + " millisec.");

        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            stringBuilder.append(i); //Example0123456
        }

        deltaTime = System.nanoTime() - startTime;
        System.out.println(stringBuilder.toString());//stringBuilder.toString() - преобразовываем в строку,т.к. это объект и при попытке распечать - распечается его адрес
        System.out.println("Work for-cycle for StringBuilder = " + deltaTime * 0.000001f + " millisec.");
        System.out.println(exampleString.equals(stringBuilder.toString()));
//        String s0 = "Hello_world"; // s0 = Hello_world
//        String s1 = "Hello_"; // s1 = Hello_world
//        s1 += "world";
//
//        String s2 = scanner.nextLine(); //s2 = Hello_world
//
//        String s3 = "Hello_world"; //s3 = Hello_world
//
//        System.out.println("-----------------");
//        System.out.println(s0 == s1);
//        System.out.println(s0 == s2);
//        System.out.println(s0 == s3);
//
//        System.out.println("-----------------");
//        System.out.println(s0.equals(s1));
//        System.out.println(s0.equals(s2));
//        System.out.println(s0.equals(s3));

//        byte b1 = 40;
//        int i1 =b1;
//
//        int i2 = 40;
//        byte b2 = (byte) i2;
//
//        String testString = "Hello";
//
//        char myChar = 'H';
//        System.out.println((int) myChar);
//        System.out.println((char)b1); //type casting (приведение типов)
//
//        Object[] myObject = new Object[4];
//        myObject[0] = i2;
//        myObject[1] = testString;
//        myObject[2] = new Cat("Barsik", "Cat");
//        myObject[3] = new Titan("Titan", 100, 50, 25,3555);
//
//        for (int i = 0; i < myObject.length; i++){
//            if (myObject[i] instanceof String){
////                ((Cat)myObject[i]).swim(150);
////             ((Titan) myObject[i]).defense();
//                System.out.println(((String) myObject[i]).length());
//            }
//        }

    }

}
