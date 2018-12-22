package game.scene;

import game.GameObject;

public class SceneGameOver extends Scene{
    @Override
    void init() {
        BackgroundGameOver backgroundGameOver = GameObject.recycle(BackgroundGameOver.class);
    }

    @Override
    void clear() {
        GameObject.clearAll();
    }
}
