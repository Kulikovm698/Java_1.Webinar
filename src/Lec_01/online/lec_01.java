package Lec_01.online;

import Lec_05.Hero;

public class lec_01 {

  public static void main(String[] args) {

//    System.out.print("Hello_java!");
//    System.out.println("Hello_World");
//    System.out.print("Hello_java2!");

//    String myString1 = "This is my first string";
//    String myString2 = "This is my second string";
//    System.out.println(myString1 + myString2); //конкатенация строк (склейка)


    //Целочисленные

//    byte myBate = 50; // -128...+127 (1 byte)
//    short myShort = 1100; //-32768...32767 (2 byte)
//    int myInteger = 527890; // -2,1 млдр...+2,1млдр (4 byte)
//    long myLong = 3000000000L; // -2^63...+2^63 (8 byte)

//    System.out.println(myInteger);

//    //Числы с точкой (с плавающей точкой)

//    float myFloat = 156.789f; // (4 byte) , 7 знаков после ,
//    double myDouble = 156.789; // (8 byte) , 14 знаков после ,

//    //Символы

//    char myChar = 'f'; // (2 byte)

//    //boolean

//    boolean myBoolean = true; //false (1 byte)

//    //Math

//    int a = 45;
//    int b = 76;
//    System.out.println(a + b);

//    int c = 15;
//    int d = 4;
//    System.out.println(c % d);
//
//  int a = 45;
//
//  if (a > 20) {
//    System.out.println("a > 20");
//    System.out.println("Privet");
//  } else
//    System.out.println("a < 20");
//    System.out.println("Medved");
//  }
    int a = 150;
    int b = 200;
    int result;

//    result = a + b;
//    System.out.println(result);

//    thisIsMethodMyMath(a, b);
    System.out.println(thisIsMethodMyMath(a, b));

    a = a + 1;
    System.out.println(thisIsMethodMyMath(a, b));
//    result = a + b;
//    System.out.println(result);
    b = b + 1;
    System.out.println(thisIsMethodMyMath(a, b));
//    result = a + b;
//    System.out.println(result);
    a = a + 1;
    System.out.println(thisIsMethodMyMath(a, b));
//    result = a + b;
//    System.out.println(result);

      doSomething();

     }

     public static int thisIsMethodMyMath(int valueA, int valueB) {  //возвращающий значения метод

      return valueA * valueB;
     }

     public static void doSomething(){  //метод ничего не возвращающий
      int a = 10;
      int b = 20;
      System.out.println(a + b);
     }
  }