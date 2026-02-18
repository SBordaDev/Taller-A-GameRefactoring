package com.balitechy.spacewar.main.background;

import java.awt.*;

public class CanvasColorBackgroundRenderer extends AbstractBackgroundRenderer{
    @Override
    public void render(Graphics g, Canvas c) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());
        g.setColor(Color.darkGray);
        g.fillOval(0, 0, 150, 150);
        g.setColor(Color.WHITE);
        g.drawOval(0, 0, 150, 150);
    }
}
