package bai9;

import javax.swing.*;
import java.awt.*;

public class Application {
    JFrame jFrame = new JFrame("Câu 9");

    public Application() {
        this.jFrame = jFrame;
    }

    public void initConfig(){

        jFrame.setSize(300,400);
        jFrame.setLocation(50,50);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel menuPanel = new JPanel();
        JPanel playGamePanel = new JPanel();

        JButton playGameButton = new JButton("PlayGame");
        JButton  exitButton= new JButton("ExitGame");

        JButton backToMenuButton = new JButton("BackToMenu");

        jFrame.add(menuPanel);
        jFrame.add(playGamePanel);



        playGameButton.addMouseListener(new CustomMouseListener(playGameButton, menuPanel, playGamePanel));
        exitButton.addMouseListener(new CustomMouseListener(exitButton, menuPanel, playGamePanel));

        backToMenuButton.addMouseListener(new CustomMouseListener(backToMenuButton, playGamePanel, menuPanel));

        menuPanel.setBackground(Color.GREEN);
        playGamePanel.setBackground(Color.RED);

        menuPanel.add(playGameButton);
        menuPanel.add(exitButton);
        playGamePanel.add(backToMenuButton);

        jFrame.add(menuPanel);
        jFrame.add(playGamePanel);

        playGamePanel.setVisible(false);

    }
    public void run(){
        jFrame.setLayout(new FlowLayout());
        jFrame.setVisible(true);
    }
}
