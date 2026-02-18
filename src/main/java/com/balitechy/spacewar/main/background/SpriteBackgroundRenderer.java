package com.balitechy.spacewar.main.background;

import com.balitechy.spacewar.main.SpritesImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpriteBackgroundRenderer extends AbstractBackgroundRenderer {
    private BufferedImage background;

    public SpriteBackgroundRenderer() {
        try {
            SpritesImageLoader bg = new SpritesImageLoader("/bg.png");
            bg.loadImage();
            background = bg.getImage(0, 0, 640, 480);
        } catch (IOException e) {
            System.out.println("Error cargando el fondo de sprites");
            e.printStackTrace();
        }
    }

    @Override
    public void render(Graphics g, Canvas c){
        if(background != null){
            g.drawImage(background, 0, 0, c.getWidth(), c.getHeight(), c);
        }
    }
}
