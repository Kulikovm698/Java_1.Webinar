package Lec_02;

public class Lec02 {

    /**
     * Методы
     * Метод должен выполнять логически атомарную операцию.
     * Методы должны что-то распечатывать или что-то вычислять.
     * Нужно учитьс разделять атомарность процессов.
     **/

    public static String valueFromClass = "Hello from Class!";

    public static void main(String[] args) {

//      String valueFromMethodMain = "Hello from methodMain!";
//      result = a + b + (c / d)  2541.551

//        float result = valueA(10, 25, 10.159f) + valueB(5.456f, 9.9f) + (valueC(5) / valueD(200, 45));
//        System.out.println(result);
//        System.out.println(valueFromClass);
//        System.out.println(valueFromMethodMain);
//
//        printResult(valueA(10, 25, 10.159f), valueB(5.456f, 9.9f), valueC(5), valueD(200, 45) );
//    }
//
//    public static void printResult(float a, float b, float c , int d) {    /** для того, чтобы что-то сделать (например распечатать что-то),
//     то использем метод void. Этот метод просто что-то делаед, ничего не возвращая.
//     **/
//        String valueFromMethodPrintResult = "Hello from method Print Result!";
//        System.out.println(valueFromMethodPrintResult);
//        System.out.println(a + b *(c / d));
//    }
//
//    public static float valueA(int input1, int input2, float input3){
//        return input1 * input2 * input3;
//    }
//
//    public static float valueB(float input1, float input2){
//        return input1 / input2;
//    }
//
//    public static float valueC(int input) {
//        return input * input;
//    }
//
//    public static int valueD(int input1, int input2) {
//        return input1 % input2;
//    }

        /**
         * Циклы:
         Определенный цикл -где все известно (сколько раз он будет повторяться, что там нужно будет делать).
         Неопределенные циклы - где что-то неизвестно.
         **/

//        Определенные циклы
        //счетчик, условие, что делать каждый раз
//        for(int i = 0; i < 10; i++) {                       // i++ инкрементация текущего значения переменной на 1 (i = i+1 то же самое i++)
//            System.out.print(i + " ");
//        }

//        System.out.println("Result a^b = " + myMath(2, 10));
//
//
//        tableFromPifagor(10,10);
//        }
//
//    public static int myMath(int valueBase, int signature){
//        int result = 1;
//        for(int i = 0; i < signature; i++){
//            result = result * valueBase;
//        }
//      return result;
//    }
//
//
//    public static void tableFromPifagor(int width,int height){
//
//        for (int y = 1; y < height; y++) {
//            for (int x = 1; x < width; x++) {
//                System.out.print(y * x + "\t" );
//            }
//            System.out.println();
//        }
//    }
//        /**
//         Неопределенные циклы:
//         Когда мы не знаем сколько раз они будут выполняться, например.
//
//         **/
//        int a = 0;
//        while( a < 10){
//            a++;
//            if (a == 5 || a == 7){
//                continue;
//            }
//            System.out.print(a + " | ");
//        }
//
//        do{                                  //этот цикл (do while)  всегда выполнится хотя бы один раз
//            a++;
//            if (a == 6){
//                break;
//            }
//            System.out.print(a + " | ");
//        } while (a < 10);

        String nameLatter = "qwerty";
        if (nameLatter == "Boris") {
            System.out.println("Give letter Boris");
        } else if (nameLatter == "Olga"){
            System.out.println("Give letter Olga");
        }else if (nameLatter == "Mike"){
            System.out.println("Give letter Mike");
        }else {
            System.out.println("go out office");
        }
        System.out.println("********************");

        switch (nameLatter){
            case "Boris":
                System.out.println("Give letter Boris");
                break;
            case "Olga":
                System.out.println("Give letter Olga");
                break;
            case "Mike":
                System.out.println("Give letter Mike");
                break;
            default:
                System.out.println("go out office");
                break;
        } //условный оператор switch
    }



}
