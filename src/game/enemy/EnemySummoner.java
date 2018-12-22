package game.enemy;

import game.FrameCounter;
import game.GameObject;

public class EnemySummoner extends GameObject {
    FrameCounter summonCounter;

    public EnemySummoner() {
        this.summonCounter = new FrameCounter(180);
    }

    @Override
    public void run() {
        super.run();
        if (summonCounter.run()) {
            Enemy enemy = GameObject.recycle(Enemy.class);
            enemy.position.set(100, -30);
            this.summonCounter.reset();
        }
    }


}
