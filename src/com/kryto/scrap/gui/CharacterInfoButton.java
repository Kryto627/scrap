package com.kryto.scrap.gui;

import java.awt.Rectangle;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;

import com.kryto.scrap.Assets;
import com.kryto.scrap.Game;
import com.kryto.scrap.character.Character;

public class CharacterInfoButton {

	private Rectangle bounds;
	private Character character;
	
	private static boolean canCallClick;
	
	public CharacterInfoButton(int x, int y, Character character) {
		this.bounds = new Rectangle(x - (200 / 2), y - (200 / 2), 200, 200);
		this.character = character;
	}
	
	public void render() {
		
		character.render((float)bounds.getX(), (float)bounds.getY(), (float)bounds.getWidth(), (float)bounds.getHeight());	
		
		if (isMouseOver()) {
			
			Assets.PIXEL_OPERATOR.renderCentered(character.getType().getName(), (float)bounds.getCenterX(), (float)(bounds.getY() + bounds.getHeight() + 25), Color.white);			
		}
	}
	
	public boolean isMouseOver() {		
		return bounds.contains(Mouse.getX(), Game.getRealMouseY());
	}
	
	public boolean isClicked() {
		
		if (isMouseOver() && Mouse.isButtonDown(0) && canCallClick) {
			canCallClick = false;
			return true;
		}
		
		if (!Mouse.isButtonDown(0)) {
			canCallClick = true;
		}	
		
		return false;
	}
}