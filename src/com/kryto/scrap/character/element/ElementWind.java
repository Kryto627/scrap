package com.kryto.scrap.character.element;

import com.kryto.scrap.gfx.Assets;
import com.kryto.scrap.gfx.GLSprite;

public class ElementWind implements IElement {

	@Override
	public String getName() {
		return "Wind";
	}
	
	@Override
	public int getDodgeAdditive() {
		return 20;
	}	

	@Override
	public GLSprite getEmblem() {
		return Assets.gui_sheet.getSubSprite(26, 21, 26, 26);
	}
}