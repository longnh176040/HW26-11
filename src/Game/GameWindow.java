package game;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameWindow extends JFrame {
    public static boolean isUpPress, isDownPress, isLeftPress, isRightPress, isFirePress, isAnyKeyPress;
    public GameWindow(){
        this.setVisible(true);
        this.setTitle("Penguin");
        //this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                isAnyKeyPress = true;
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    isUpPress = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    isDownPress = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_A) {
                    isLeftPress = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_D) {
                    isRightPress = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    isFirePress = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                isAnyKeyPress = false;
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    isUpPress = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    isDownPress = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_A) {
                    isLeftPress = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_D) {
                    isRightPress = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    isFirePress = false;
                }
            }
        });
    }

}
