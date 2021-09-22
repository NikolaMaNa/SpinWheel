package com.mygdx.game.spinwheel;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.spinwheel.screen.SpinWheelAnim;

public class SpinWheel extends Game {

	public static final float HEIGHT = 2220;
	public static final float WIDTH = 1080;
	private SpriteBatch batch;

	private BitmapFont font;

	@Override
	public void create() {
		batch = new SpriteBatch();

		font = new BitmapFont();
		font.getData().setScale(2);

		setScreen(new SpinWheelAnim());
	}

	public static OrthographicCamera getGameCamera() {
		OrthographicCamera camera = new OrthographicCamera();
		camera.setToOrtho(false, WIDTH, HEIGHT);
		return camera;
	}


	@Override
	public void dispose() {
	//	manager.dispose();
		batch.dispose();
	}
}
