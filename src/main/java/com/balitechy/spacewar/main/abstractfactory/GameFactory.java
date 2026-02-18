package com.balitechy.spacewar.main.abstractfactory;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.background.AbstractBackgroundRenderer;
import com.balitechy.spacewar.main.bullet.AbstractBullet;
import com.balitechy.spacewar.main.player.AbstractPlayer;

public abstract class GameFactory {
    public abstract AbstractPlayer createPlayer(double x, double y, Game game);
    public abstract AbstractBullet createBullet(double x, double y, Game game);
    public abstract AbstractBackgroundRenderer createBackground();
}
