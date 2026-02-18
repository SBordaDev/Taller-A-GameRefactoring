package com.balitechy.spacewar.main.abstractfactory;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.background.AbstractBackgroundRenderer;
import com.balitechy.spacewar.main.background.CanvasColorBackgroundRenderer;
import com.balitechy.spacewar.main.bullet.AbstractBullet;
import com.balitechy.spacewar.main.bullet.BulletColorCanvas;
import com.balitechy.spacewar.main.player.AbstractPlayer;
import com.balitechy.spacewar.main.player.PlayerColorCanvas;

public class ColorfulVectorialStyle extends GameFactory{
    @Override
    public AbstractPlayer createPlayer(double x, double y, Game game) {
        return new PlayerColorCanvas(x, y, game);
    }

    @Override
    public AbstractBullet createBullet(double x, double y, Game game) {
        return new BulletColorCanvas(x, y, game);
    }

    @Override
    public AbstractBackgroundRenderer createBackground() {
        return new CanvasColorBackgroundRenderer();
    }
}
