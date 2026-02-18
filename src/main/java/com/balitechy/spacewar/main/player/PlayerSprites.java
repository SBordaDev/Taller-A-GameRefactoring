package com.balitechy.spacewar.main.player;

import com.balitechy.spacewar.main.Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class PlayerSprites extends AbstractPlayer{
	private BufferedImage image;

	public PlayerSprites(double x, double y, Game game) {
		super(x, y, game);

		image = game.getSprites().getImage(219, 304, WIDTH, HEIGHT);
	}

	@Override
	public void render(Graphics g){
		g.setColor(Color.white);
		g.drawImage(image, (int) x, (int) y, null);
	}
}
