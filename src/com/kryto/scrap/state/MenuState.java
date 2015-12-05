package com.kryto.scrap.state;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import com.kryto.scrap.framework.Window;
import com.kryto.scrap.gfx.Assets;
import com.kryto.scrap.input.Keyboard;

public class MenuState implements IGameState {

	@Override
	public void init(GameStateManager gsm) {
		
	}

	@Override
	public void update(GameStateManager gsm) {
		
		Assets.updateAnimations();
		
		if (Keyboard.getInstance().isPressed(KeyEvent.VK_ESCAPE)) {
			System.exit(0);
		}
	}

	@Override
	public void render(Graphics2D g) {
		
		g.setColor(new Color(0x335F7F));
		g.fillRect(0, 0, Window.WIDTH + 10, Window.HEIGHT + 10);
		
		int width = 57 * 7;
		int height = 21 * 7;
		Assets.logo.render(g, Window.getCenterX() - (width / 2), 100, width, height);
		
		Assets.cruiseAnimated.render(g, Window.getCenterX() - 256, Window.getCenterY(), 128, 128);
		Assets.frigidAnimated.render(g, Window.getCenterX() + 64, Window.getCenterY(), -128, 128);
		Assets.boilerAnimated.render(g, Window.getCenterX() + 256, Window.getCenterY(), -128, 128);
	}

	@Override
	public void onEnter() {
		
	}

	@Override
	public void onLeave() {
		
	}
}