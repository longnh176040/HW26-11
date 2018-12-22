package game.enemy;

import game.GameObject;
import game.renderer.Animation;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class EnemyExplosion extends GameObject {

    public EnemyExplosion() {
        this.createRenderer();
    }

    public void createRenderer() {
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("assets/images/enemies/explosion/0.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/explosion/1.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/explosion/2.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/explosion/3.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/explosion/4.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/explosion/5.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/explosion/6.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/explosion/7.png"));
        this.renderer = new Animation(images, true);
    }

    @Override
    public void reset() {
        super.reset();

    }
}
