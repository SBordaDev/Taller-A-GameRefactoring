package com.balitechy.spacewar.main.bullet;

import com.balitechy.spacewar.main.Game;

import java.awt.*;

public class BulletColorCanvas extends AbstractBullet{
    public BulletColorCanvas(double x, double y, Game game) {
        super(x, y, game);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect((int) x, (int) y, WIDTH, HEIGHT);

        g.setColor(Color.YELLOW);
        g.drawRect((int) x, (int) y, WIDTH, HEIGHT);
    }
}
