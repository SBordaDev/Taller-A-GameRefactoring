package com.balitechy.spacewar.main.bullet;

import com.balitechy.spacewar.main.Game;

import java.awt.*;
import java.awt.image.BufferedImage;

public class BulletSprites extends AbstractBullet{

    private BufferedImage image;

    public BulletSprites(double x, double y, Game game) {
        super(x, y, game);

        image = game.getSprites().getImage(35, 52, WIDTH, HEIGHT);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(image, (int) x, (int) y, null);
    }
}
