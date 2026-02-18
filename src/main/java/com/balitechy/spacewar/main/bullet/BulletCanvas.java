package com.balitechy.spacewar.main.bullet;

import com.balitechy.spacewar.main.Game;

import java.awt.*;

public class BulletCanvas extends AbstractBullet{
    public BulletCanvas(double x, double y, Game game) {
        super(x, y, game);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect((int) x, (int) y, WIDTH, HEIGHT);

        g.setColor(Color.BLACK);
        g.drawRect((int) x, (int) y, WIDTH, HEIGHT);
    }
}
