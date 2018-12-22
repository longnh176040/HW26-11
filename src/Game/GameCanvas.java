package game;

import game.enemy.EnemySummoner;
import game.player.Player;
import game.enemy.Enemy;
import game.scene.SceneManager;
import game.scene.SceneWelcome;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

    public GameCanvas() {
        SceneManager.signNewScene(new SceneWelcome());
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, Settings.SCREEN_WIDTH, Settings.SCREEN_HEIGHT);
        GameObject.renderAll(g);
    }

    public void runAll() {
        GameObject.runAll();
    }

    public void renderAll() {
        this.repaint(); //~paint()
    }

    public void gameLoop() {
        long lastTimeRun = 0;
        while (true) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastTimeRun > Settings.FPS) {
                runAll(); //logic game
                renderAll(); //hien thi game
                lastTimeRun = currentTime;
            }
        }
    }


}
