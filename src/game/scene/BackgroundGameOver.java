package game.scene;

import game.GameObject;
import game.Settings;
import game.renderer.SingleImageRenderer;
import tklibs.SpriteUtils;

public class BackgroundGameOver extends GameObject {
    public BackgroundGameOver() {
        this.renderer = new SingleImageRenderer(SpriteUtils.loadImage("assets/images/background/backgroundgameover.jpg"));
        this.position.set(Settings.SCREEN_WIDTH/2, Settings.SCREEN_HEIGHT/2);
    }

    @Override
    public void run() {
        super.run();
    }
}
