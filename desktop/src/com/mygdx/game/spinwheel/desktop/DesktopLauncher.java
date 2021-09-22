package com.mygdx.game.spinwheel.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.mygdx.game.spinwheel.SpinWheel;

public class DesktopLauncher {
	public static void main (String[] arg) {

//		TexturePacker.Settings setting = new TexturePacker.Settings();
//		setting.edgePadding = true;
//		setting.duplicatePadding = true;
//		setting.filterMin = Texture.TextureFilter.Linear;
//		setting.filterMag = Texture.TextureFilter.Linear;
//		TexturePacker.process(setting, "android/assets/spin_wheel",".","spin_wheel_ui");

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new SpinWheel(), config);
	}
}
