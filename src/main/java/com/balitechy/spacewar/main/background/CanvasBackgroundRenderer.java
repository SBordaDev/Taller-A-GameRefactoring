package com.balitechy.spacewar.main.background;

import java.awt.*;

public class CanvasBackgroundRenderer extends AbstractBackgroundRenderer{
    @Override
    public void render(Graphics g, Canvas c) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());
        g.setColor(Color.BLACK);
        g.drawOval(0, 0, 150, 150);
    }
}
