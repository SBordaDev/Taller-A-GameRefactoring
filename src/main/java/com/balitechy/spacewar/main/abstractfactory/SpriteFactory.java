package com.balitechy.spacewar.main.abstractfactory;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.background.AbstractBackgroundRenderer;
import com.balitechy.spacewar.main.background.SpriteBackgroundRenderer;
import com.balitechy.spacewar.main.bullet.AbstractBullet;
import com.balitechy.spacewar.main.bullet.BulletSprites;
import com.balitechy.spacewar.main.player.AbstractPlayer;
import com.balitechy.spacewar.main.player.PlayerSprites;

public class SpriteFactory extends GameFactory{

    @Override
    public AbstractPlayer createPlayer(double x, double y, Game game) {
        return new PlayerSprites(x, y, game);
    }

    @Override
    public AbstractBullet createBullet(double x, double y, Game game) {
        return new BulletSprites(x, y, game);
    }

    @Override
    public AbstractBackgroundRenderer createBackground() {
        return new SpriteBackgroundRenderer();
    }
}
