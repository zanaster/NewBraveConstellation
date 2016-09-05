package com.mygdx.newbraveconstellation;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

public class SplashScreen implements Screen, InputProcessor {

    final NewBraveConstellation game;

    OrthographicCamera camera;
    Texture splashScreen;

    public SplashScreen(final NewBraveConstellation gam) {
        game = gam;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 1200, 600);
        Gdx.input.setInputProcessor(this);
        splashScreen = new Texture("c2.jpg");
    }
    
    @Override
    public void render(float delta) {

        
        Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 1);

        camera.update();
        game.spriteBatch.begin();
        game.spriteBatch.draw(splashScreen, 0, 0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        game.spriteBatch.end();
        
    }
    
	@Override
	public void show() {
		// TODO Auto-generated method stub

	}


	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		if (keycode == Input.Keys.S) {
			game.setScreen(new MainMenuScreen(game));
			dispose();
		}
        return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		game.setScreen(new MainMenuScreen(game));
		dispose();
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
