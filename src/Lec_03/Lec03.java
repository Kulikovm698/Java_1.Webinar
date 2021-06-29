package Lec_03;

import java.util.Random;
import java.util.Scanner;

public class Lec03 {

    public static Random random = new Random(); // [0;1) 0.9999999

    public static Scanner scanner = new Scanner(System.in);

    /**
     * Массив - это набор данных, причем тип данных одинаковый.
     */

    public static void main(String[] args) {

        recordUserData("Your result: ", userInt());

        String stringUser = scanner.next();
        System.out.println("Your string data is " + stringUser);
//        int[] myArray = new int[5];
//        myArray[0] = 89;
//        myArray[1] = -15;
//        myArray[2] = 150;
//        myArray[3] = 198;
//        myArray[4] = -1;

//        System.out.println(myArray[2]);
//        myArray[2] = 999;
//        System.out.println(myArray[2]);

//        String[] myArrayString = {"String1","String2","String3","String4","String5",};

//        String[] myArrayString = new String[500];
//        float[] myArrayFloat = new float[120];
//
//        for (int i = 0; i < myArrayFloat.length; i++) {
//            myArrayFloat[i] = random.nextFloat();
//        }
//
//        for (int i = 0; i < myArrayFloat.length; i++) {
//            System.out.print(i + "=" + myArrayFloat[i] + " | ");
//        }
//        myArrayString[0] = "String1";
//        myArrayString[1] = "String2";
//        myArrayString[2] = "String3";
//        myArrayString[3] = "String4";
//        myArrayString[4] = "String5";
//        System.out.println(myArrayString[3]);
//
//        fillArray(myArrayString);
//        printArray(myArrayString);
//        String[] myStringFromFloat = workWithArray(myArrayFloat);
//        printArray(myStringFromFloat);
//
//
//        for (int i = 0; i < myArrayString.length; i++) {
//            myArrayString[i] = "String " + (i + 1);               //заполняем массив
//        }
//        for (int i = 0; i < myArrayString.length; i++) {
//            System.out.print(i + "=" + myArrayString[i] + " | ");  // читаем массив
//        }

//        String[] myArrayString = new String[500];
//
//        String[] box = new String[50];
//
//        fillBox(box, "Cat");
//        printArray(box);

//        fillArray(myArrayString);
//        printArray(myArrayString);

//        int[][] myArrayDouble = new int[5][10];
//        int count = 0;
//
//        //заполнение массива
//        for (int y = 0; y < myArrayDouble.length; y++) {
//            for (int x = 0; x < myArrayDouble[y].length; x++) {
//                myArrayDouble[y][x] = count;
//                count++;
//            }

    }
    // прочитали массив, обратившись к каждому элементу массива
//        for (int i = 0; i < myArrayDouble.length; i++) {
//            for (int j = 0; j < myArrayDouble[i].length; j++) {
//                System.out.print(myArrayDouble[i][j] + "\t");
//            }
//            System.out.println();
//        }

    public static void recordUserData(String welcomeMessage, int userValue){
        System.out.println(welcomeMessage + (userValue * 20));
    }

    public static int userInt (){
        System.out.print("Enter your value: ");
        return scanner.nextInt();
    }

    /**
     Если вы создаете массив и не задаете внутренние значения, массив инициализирует в себе каждый элемент по умолчанию,
     в зависимости от того, какой элемент передали
     **/


//    public static void fillArray(String[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = "String " + (i + 1);
//        }
//    }


//    public static void fillBox(String[] inputArray, String inputString){
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = inputString + (i + 1);
//        }
//    }

//    public static void fillArray(String[] inputArray){
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = "String" + random.nextInt(150);
//        }
//    }
//
//    public static String[] workWithArray(float[] inputArrayFloat) {
//        String[] tmp = new String[inputArrayFloat.length];
//        for (int i = 0; i < tmp.length; i++) {
//            tmp[i] = Float.toString(inputArrayFloat[i]);
//        }
//        return tmp;
//    }
//
//        public static void printArray (String[]inputArray){
//            for (int i = 0; i < inputArray.length; i++) {
//                System.out.print(i + " = " + inputArray[i] + " | ");
//            }
//        }

}