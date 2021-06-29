package Lec_08;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    //Размеры окна
    private int winWidth = 800;
    private int winHeight = 600;
    private int winPosX = 600;
    private int winPosY = 200;
    //Min Max размеры карты и победной длины
    private int minMapSize = 3;
    private int maxMapSize = 10;
    private int minWinLength = 3;
    //Создание кнопок
    private JButton btnStartGame;
    private JButton btnExitGame;
    private JButton btnClearLog;
    //Создаем панельку, для размещения
    private JPanel panelSettings;
    private JPanel panelControls;  //Панель настроек

    private JLabel labelMapSize;
    private JLabel labelWinLength;

    private JSlider sliderMapSizeSetting;
    private JSlider sliderWinLengthSetting;

    private JTextArea gameLog;
    private JScrollPane scrollPane;

    private String mapSizePrefix = "Map size is ";
    private String winLengthPrefix = "Win length is ";
    //Игровое поле
    private GameMap gameMap;

    private int round = 0;

    //Конструктор окна
    MainWindow(){
        prepareWindow();
        prepareButtons();
        //Панелька для размещения кнопок
        panelSettings = new JPanel();
        panelSettings.setLayout(new GridLayout(2,1));

        prepareSettings();
        prepareGameLog();

        panelSettings.add(panelControls);
        panelSettings.add(scrollPane);

        gameMap = new GameMap(this);
        add(gameMap);
        add(panelSettings, BorderLayout.EAST);

//        setLayout(new GridLayout(10, 15));
//        for (int i = 0; i < 10; i++) {
//            add(new JButton("Button" + i));
//        }

//        setLayout(new FlowLayout());
//
//        for (int i = 0; i < 12; i++){
//            add(new JButton("Button" + i));
//        }

        setVisible(true);

    }
    //Метод. Описание окна
    private void prepareWindow(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int screenSizeW = dimension.width;
        int screenSizeH = dimension.height;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(winWidth, winHeight);
//        setLocation(winPosX, winPosY);
        setLocation(screenSizeW / 2 - winWidth / 2, screenSizeH / 2 - winHeight / 2);
        setTitle("Game XO");
        setResizable(false);

    }

    //Настройка кнопок
    private void prepareButtons(){

        btnStartGame = new JButton("Start game");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });

        btnExitGame = new JButton("Exit Game");
        //На кнопку добавляем слушатель событий (т.е. какое-то действие)
        btnExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnClearLog = new JButton("Clear Log");
        btnClearLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLog.setText("");
            }
        });
    }

    //Метод, который описывает настройки
    private void prepareSettings(){

        panelControls = new JPanel();
        panelControls.setLayout(new GridLayout(8,1));

        mapSetupControllers();

        panelControls.add(labelMapSize);
        panelControls.add(sliderMapSizeSetting);
        panelControls.add(labelWinLength);
        panelControls.add(sliderWinLengthSetting);
        panelControls.add(btnStartGame);
        panelControls.add(btnExitGame);
        panelControls.add(btnClearLog);

    }

    private void prepareGameLog(){
        gameLog = new JTextArea();
        scrollPane = new JScrollPane(gameLog);
        gameLog.setEditable(false);
        gameLog.setLineWrap(true);
    }

    void log(String text){
        gameLog.append(text + "\n");
    }

    //Бегунки
    private void mapSetupControllers(){
        labelMapSize = new JLabel(mapSizePrefix + minMapSize);
        labelWinLength = new JLabel(winLengthPrefix + minWinLength);

        sliderMapSizeSetting = new JSlider(minMapSize, maxMapSize, minMapSize);
        sliderMapSizeSetting.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentMapSize = sliderMapSizeSetting.getValue();
                labelMapSize.setText(mapSizePrefix + currentMapSize);
                sliderWinLengthSetting.setMaximum(currentMapSize);
            }
        });

        sliderWinLengthSetting = new JSlider(minWinLength, minMapSize, minMapSize);
        sliderWinLengthSetting.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelWinLength.setText(winLengthPrefix + sliderWinLengthSetting.getValue());
            }
        });
    }

    private void startGame(){
        int mapSize = sliderMapSizeSetting.getValue();
        int winLength = sliderWinLengthSetting.getValue();
        ++round;
        log("--- Round " + round + "---");
        log("New Game " + mapSize + "x" + mapSize + "| win " + winLength);
        gameMap.startGameWithUserSettings(mapSize, mapSize, winLength);

    }
}
