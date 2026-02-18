package com.balitechy.spacewar.main.player;

import com.balitechy.spacewar.main.Game;

import java.awt.*;

public class PlayerColorCanvas extends AbstractPlayer{

    public PlayerColorCanvas(double x, double y, Game game) {
        super(x, y, game);
    }

    @Override
    public void render(Graphics g) {
        int puntaX = (int) x + (WIDTH / 2);
        int puntaY = (int) y;

        // 2. La base izquierda (Izquierda en X, Abajo en Y)
        int baseIzqX = (int) x;
        int baseIzqY = (int) y + HEIGHT;

        // 3. La base derecha (Derecha en X, Abajo en Y)
        int baseDerX = (int) x + WIDTH;
        int baseDerY = (int) y + HEIGHT;

        int[] xPoints = {puntaX, baseIzqX, baseDerX};
        int[] yPoints = {puntaY, baseIzqY, baseDerY};

        g.setColor(Color.RED);
        g.fillPolygon(xPoints, yPoints, 3);

        g.setColor(Color.MAGENTA);
        g.drawPolygon(xPoints, yPoints, 3);
    }
}
