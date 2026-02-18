package com.balitechy.spacewar.main.bullet;

import com.balitechy.spacewar.main.Game;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class AbstractBullet {
    public double x;
    public double y;
    public static final int WIDTH = 11;
    public static final int HEIGHT = 21;

    public AbstractBullet(double x, double y, Game game){
        this.x = x;
        this.y = y;
    }

    public void tick(){
        y -= 5;
    }

    public abstract void render(Graphics g);

    public double getY(){
        return y;
    }
}
