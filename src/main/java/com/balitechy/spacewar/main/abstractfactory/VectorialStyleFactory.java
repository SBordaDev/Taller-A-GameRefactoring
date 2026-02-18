package com.balitechy.spacewar.main.abstractfactory;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.background.AbstractBackgroundRenderer;
import com.balitechy.spacewar.main.background.CanvasBackgroundRenderer;
import com.balitechy.spacewar.main.bullet.AbstractBullet;
import com.balitechy.spacewar.main.bullet.BulletCanvas;
import com.balitechy.spacewar.main.player.AbstractPlayer;
import com.balitechy.spacewar.main.player.PlayerCanvas;

public class VectorialStyleFactory extends GameFactory{
    @Override
    public AbstractPlayer createPlayer(double x, double y, Game game) {
        return new PlayerCanvas(x,y,game);
    }

    @Override
    public AbstractBullet createBullet(double x, double y, Game game) {
        return new BulletCanvas(x,y,game);
    }

    @Override
    public AbstractBackgroundRenderer createBackground() {
        return new CanvasBackgroundRenderer();
    }
}
