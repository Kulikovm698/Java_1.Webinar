package Lec_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class GameMap extends JPanel {

    private int mapSizeX;
    private int mapSizeY;
    private int winLength;

    //кто играет - человек и ИИ
    private  int human = 1;
    private  int ai = 2;
    private  int emptyField = 0;

    private int cellWidth;
    private int cellHeight;

    // ввод значений (карандаш)
    private Random random = new Random();
    private int[][] map;

    private boolean initMap;
    private boolean gameOver;

    private MainWindow mainWindow;

    GameMap(MainWindow mainWindow){
        this.mainWindow = mainWindow;
        setBackground(new Color(0, 0, 0));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                update(e);
            }
        });

        initMap = false;

    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        render(g);
    }

    void startGameWithUserSettings(int mapSizeX, int mapSizeY, int winLen){
        showMessage("User choose map size " + mapSizeX + "x" + mapSizeY + ". Win length is " + winLen);
        this.mapSizeX = mapSizeX;
        this.mapSizeY = mapSizeX;
        this.winLength = winLen;
        map = new int[mapSizeY][mapSizeX];
        gameOver = false;
        initMap = true;
        repaint();
    }

    private void showMessage(String text){
        JOptionPane.showMessageDialog(this, text);
        //Передаем в parentComponent на основе какого окна будет выводиться диалог (т.е. на основе этого, MainWindow)
    }

    private void update(MouseEvent e){   // Рисование 
        if(!initMap) return;
        if(gameOver) return;

        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;

        if(!isValidCell(cellX, cellY) || !isEmptyCell(cellX,cellY)){
            return;
        }

        map[cellY][cellX] = human;
        mainWindow.log("Player > " + (cellX + 1) + ":" + (cellY + 1));

        if(checkWin(human)){
            setupGameOver("Human win!");
            return;
        }

        if(isFullMap()){
            setupGameOver("Draw!");
            return;
        }

        repaint();

        aiTurn();
        repaint();

        if(checkWin(ai)){
            setupGameOver("AI win!");
            return;
        }

        if(isFullMap()){
            setupGameOver("Draw!");
            return;
        }
    }

    private void setupGameOver(String textWin){
        repaint();
        showMessage(textWin);
        mainWindow.log(textWin);
        gameOver = true;
    }

    private void render(Graphics g){
        if(!initMap) return;   //если карта еще не отрисовалась, то выйти из метода

        int width = getWidth();
        int height = getHeight();

        cellWidth = width / mapSizeX;
        cellHeight = height / mapSizeY;

        g.setColor(Color.WHITE);

        for (int i = 0; i < mapSizeY; i++) {  //вычисляем каждую следующую точку линии
            int y = i * cellHeight;
            g.drawLine(0, y, width, y);
        }

        for (int i = 0; i < mapSizeX; i++) {  //вычисляем каждую следующую точку линии
            int x = i * cellWidth;
            g.drawLine(x, 0 , x, height);
        }

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if(isEmptyCell(x,y)) continue;
                if (map[y][x] == human){
                    g.setColor(Color.GREEN);
                    g.fillOval(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
                }else if (map[y][x] == ai){
                    g.setColor(Color.RED);
                    g.fillOval(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
                }

            }
        }
    }

    private void aiTurn() {
        if (turnAIWinCell()) {
            return;
        }

        if (turnHumanWinCell()) {
            return;
        }

        int x;
        int y;
        do {
            x = random.nextInt(mapSizeX);
            y = random.nextInt(mapSizeY);
        } while (!isEmptyCell(x, y));
        map[y][x] = ai;
        mainWindow.log("AI > " + (x + 1) + ":" + (y + 1));
    }

    private boolean turnAIWinCell() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (isEmptyCell(j, i)) {
                    map[i][j] = ai;    // поставим нолик в каждую клетку поля по очереди
                    if (checkWin(ai)) {
                        return true;    // если мы выиграли, вернём истину, оставив нолик в выигрышной позиции
                    }
                    map[i][j] = emptyField;    // если нет - вернём обратно пустоту в клетку и пойдём дальше
                }
            }
        }
        return false;
    }

    // Проверка, выиграет-ли игрок своим следующим ходом
    private boolean turnHumanWinCell() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (isEmptyCell(j, i)) {
                    map[i][j] = human;     // поставим крестик в каждую клетку по очереди
                    if (checkWin(human)) {    // если игрок победит
                        map[i][j] = ai;    // поставить на то место нолик
                        return true;
                    }
                    map[i][j] = emptyField;    // в противном случае вернуть на место пустоту
                }
            }
        }
        return false;
    }

    // проверка на победу
    private boolean checkWin(int player) {
        for (int i = 0; i < mapSizeX; i++) {     // ползём по всему полю
            for (int j = 0; j < mapSizeY; j++) {
                if (checkVector(i, j, 1, 0, winLength, player)) {
                    return true;    // проверим линию по х
                }
                if (checkVector(i, j, 1, 1, winLength, player)) {
                    return true;    // проверим по диагонали х у
                }
                if (checkVector(i, j, 0, 1, winLength, player)) {
                    return true;    // проверим линию по у
                }
                if (checkVector(i, j, 1, -1, winLength, player)) {
                    return true;    // проверим по диагонали х -у
                }
            }
        }
        return false;
    }

    // проверка линии
    private boolean checkVector(int x, int y, int vx, int vy, int len, int player) {
        int farX = x + (len - 1) * vx;    // посчитаем конец проверяемой линии
        int farY = y + (len - 1) * vy;
        if (!isValidCell(farX, farY)) {
            return false;    // проверим не выйдет-ли проверяемая линия за пределы поля
        }
        for (int i = 0; i < len; i++) {    // ползём по проверяемой линии
            if (map[y + i * vy][x + i * vx] != player) {
                return false;    // проверим одинаковые-ли символы в ячейках
            }
        }
        return true;
    }

    private boolean isFullMap() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (map[i][j] == emptyField) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidCell(int x, int y) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    private boolean isEmptyCell(int x, int y) {
        return map[y][x] == emptyField;
    }
}
