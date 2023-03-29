package liuMud;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    JFrame window;
     Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, overlayPanel;
    JLabel titleNameLabel, overlayHP, overlayEquip;
    Font titleFont = new Font("Courier", Font.PLAIN, 40);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 40);
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;

    TitleScreenHandler tsHandler = new TitleScreenHandler();





    public static void main(String[] args) {
        new Game();

    }
    public Game() {

        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel= new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);

        titleNameLabel = new JLabel("liuMUD");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("START");
        startButton.setBounds(300, 400, 200, 100);
        startButton.setText("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);


        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        con.add(titleNamePanel);
        con.add(startButtonPanel);
        con.add(startButton);





    }

    public void createGameScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        startButton.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.blue);
        con.add(mainTextPanel);


        mainTextArea = new JTextArea("Dett är maintext area, kollar om wrappern klipper som den ska.. ");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);


        choice1 = new JButton("Choice1");
        choice1.setBounds(200, 350, 400, 50);
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.addActionListener(tsHandler);
        choiceButtonPanel.add(choice1);


        choice2 = new JButton("Choice2");
        choice2.setBounds(200, 400, 400, 50);
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.addActionListener(tsHandler);
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Choice3");
        choice3.setBounds(200, 450, 400, 50);
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.addActionListener(tsHandler);
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("Choice4");
        choice4.setBounds(200, 500, 400, 50);
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.addActionListener(tsHandler);
        choiceButtonPanel.add(choice4);

        overlayPanel = new JPanel();
        overlayPanel.setBounds(10,10,780,90);
        overlayPanel.setBackground(Color.black);
        overlayPanel.setForeground(Color.white);
        overlayPanel.setLayout(new GridLayout(1, 4));
        overlayPanel.setFont(titleFont);
        con.add(overlayPanel);

        overlayHP = new JLabel("HP:");
        overlayHP.setFont(titleFont);
        overlayHP.setBounds(1,1,20,20);
        overlayHP.setBackground(Color.black);
        overlayHP.setForeground(Color.white);
        overlayPanel.add(overlayHP);

        overlayEquip = new JLabel("Equipped: ");
        overlayEquip.setBounds(799,1,20,20);
        overlayEquip.setBackground(Color.black);
        overlayEquip.setForeground(Color.white);
        overlayEquip.setFont(titleFont);
        overlayPanel.add(overlayEquip);











        con.repaint();






    }

    public class TitleScreenHandler implements ActionListener{

        public void actionPerformed(ActionEvent event) {

            createGameScreen();


        }

    }
}