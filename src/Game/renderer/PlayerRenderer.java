package game.renderer;

import game.GameObject;
import game.player.Player;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class PlayerRenderer extends Renderer {
    Renderer textRenderer;
    Renderer animation;
    boolean blind;

    public PlayerRenderer(String text, ArrayList<BufferedImage> image) {
        this.textRenderer = new TextRenderer(text);
        this.animation = new Animation(image);
        this.blind = false;
    }

    @Override
    public void render(Graphics g, GameObject master) {
        Player player = (Player) master;
        if (player.immune) {
            if (this.blind){
            this.animation.render(g, master);
        }
        this.blind = !this.blind; }
        else {
            //this.textRenderer.render(g, master);
            this.animation.render(g, master);
        }
    }
}
