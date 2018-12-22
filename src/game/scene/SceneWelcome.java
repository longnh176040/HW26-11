package game.scene;

import game.GameObject;

public class SceneWelcome extends Scene {

    @Override
    void init() {
    BackgroundWelcome backgroundWelcome = GameObject.recycle(BackgroundWelcome.class);
    }

    @Override
    void clear() {
    GameObject.clearAll();
    }
}
