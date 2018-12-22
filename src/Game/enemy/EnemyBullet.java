package game.enemy;

import game.GameObject;
import game.GameObjectPhysics;
import game.Settings;
import game.physics.BoxCollider;
import game.player.Player;
import game.renderer.Animation;
import tklibs.SpriteUtils;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class EnemyBullet extends GameObjectPhysics {
    int damage;

    public EnemyBullet() {
        super();
        this.createRenderer();
        this.velocity.set(0, 3);
        this.boxCollider = new BoxCollider(this.position, this.anchor, Settings.ENEMY_BULLET_WIDTH, Settings.ENEMY_BULLET_HEIGHT);
        this.damage = 1;

    }

    public void createRenderer() {
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("assets/images/enemies/bullets/pink.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/bullets/blue.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/bullets/cyan.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/bullets/green.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/bullets/red.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/bullets/white.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/bullets/yellow.png"));
        this.renderer = new Animation(images);
    }

    @Override
    public void run() {
        super.run();
        if (this.position.y > Settings.SCREEN_HEIGHT) {
            this.destroy();
        }
        this.checkIntersect();
    }

    private void checkIntersect() {
        Player player = GameObject.findIntersected(Player.class, this.boxCollider);
        if (player != null) {
            this.destroy();
            player.takeDamage(this.damage);
        }

    }

}
