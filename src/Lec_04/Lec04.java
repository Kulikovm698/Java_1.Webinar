package Lec_04;

import java.util.Random;
import java.util.Scanner;

public class Lec04 {
    //размеры поля
    public static char[][] map;
    public static int mapSizeX;
    public static int mapSizeY;
    //кто играет - человек и ИИ
    public static char human = 'X';
    public static char ai = '0';
    public static char empty_field = '_';
    // ввод значений (карандаш)
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    //создаем карту
    public static void createMap() {
        mapSizeX = 3;
        mapSizeY = 3;
        map = new char[mapSizeY][mapSizeX];

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                map[y][x] = empty_field;
            }
        }
    }

    /**
     * еще способ создать поле
     * public static void createMap(int sizeX, int sizeY){
     * mapSizeX = sizeX;
     * mapSizeY = sizeY;
     * map = new char[mapSizeY][mapSizeX];
     * }
     **/

    public static void showMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Enter your turn coordinates from 1 before " + mapSizeX + ": ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        map[y][x] = human;
    }

    public static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(mapSizeX);   //ход ии в пределах поля
            y = random.nextInt(mapSizeY);
        } while (!isEmptyCell(x, y));
        System.out.println("AI turn is [" + (y + 1) + ":" + (x + 1) + "]");
        map[y][x] = ai;
    }

    // методы для проверки перед ходом: проверка, что находимся в пределах поля и проверка, что клетка свободна.
    public static boolean isValidCell(int x, int y) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public static boolean isEmptyCell(int x, int y) {
        return map[y][x] == empty_field;
    }

    //проверка ничьей
    public static boolean isDraw() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[y][x] == empty_field) {
                    return false;
                }
            }
        }
        return true;
    }
    //проверка победы игрока
    public static boolean isWin(char player){
        //проверка по горизонтали
        if(map[0][0] == player && map[0][1] == player && map[0][2] == player) return true;
        if(map[1][0] == player && map[1][1] == player && map[1][2] == player) return true;
        if(map[2][0] == player && map[2][1] == player && map[2][2] == player) return true;

        //проверка вертикали
        if(map[0][0] == player && map[1][0] == player && map[2][0] == player) return true;
        if(map[0][1] == player && map[1][1] == player && map[2][1] == player) return true;
        if(map[0][2] == player && map[1][2] == player && map[2][2] == player) return true;

        //проверка по диагонали
        if(map[0][0] == player && map[1][1] == player && map[2][2] == player) return true;
        if(map[0][2] == player && map[1][1] == player && map[2][0] == player) return true;

        return false;
    }

    public static void main(String[] args) {

        createMap();
        showMap();

       while (true) {
           humanTurn();
           showMap();

           if (isWin(human)) {
               System.out.println("Human win!");
               break;
           }

           if (isDraw()) {
               System.out.println("Is Draw!");
               break;
           }

           aiTurn();
           showMap();

           if (isWin(ai)) {
               System.out.println("AI win!");
               break;
           }

           if (isDraw()) {
               System.out.println("Is Draw!");
               break;
           }
       }
        System.out.println("Game over!");
    }
}
