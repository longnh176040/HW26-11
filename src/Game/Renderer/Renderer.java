package Game.Renderer;

import Game.GameObject;

import java.awt.*;

public abstract class Renderer {
    abstract public void render(Graphics g, GameObject master);
}
