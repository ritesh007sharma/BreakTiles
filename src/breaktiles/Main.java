package breaktiles;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        JFrame jframe = new JFrame();
        Gameplay gamePlay = new Gameplay();
        jframe.setBounds(10, 10, 700, 600);
        jframe.setTitle("Break Tiles");
        jframe.setResizable(false);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePlay);
        jframe.setVisible(true);
    }
}
