package com.mygdx.newbraveconstellation;

import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.math.Vector3;

public class GameScreen implements Screen, InputProcessor
{
    final NewBraveConstellation game;
    
    private PerspectiveCamera camera;
    private ModelBatch modelBatch;
    private Environment environment;
    private BitmapFont font;
    private SpriteBatch spriteBatch;
    private List<ModelInstance> myList;
    
    private Scene scene;
	
	   public GameScreen ( final NewBraveConstellation gam ) {
	        this.game = gam;
	        
		    System.out.println("GameScreen");
	        
	        camera = new PerspectiveCamera(80,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
	        camera.position.set(0f, 0f, 0f);
	        camera.lookAt(coordinate.Transform2Vector( 30.0f , -20.0f, 10 ));
	        camera.near =0.1f;
	        camera.far = 200f;

	        modelBatch = new ModelBatch();
	        
	        spriteBatch = new SpriteBatch();  
	        
	        scene = new Scene();
	        scene.create();
	        
	        font = new BitmapFont();
	        font.setColor(Color.RED);
	        
	        environment = new Environment();
	        
	        environment.set(new ColorAttribute(ColorAttribute.AmbientLight,0.8f,0.8f,0.8f,1f));

	        Gdx.input.setInputProcessor(this);
	   }

	   public void render () {
	      Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 1);
	      Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT |GL20.GL_DEPTH_BUFFER_BIT);

	        camera.update();
	        modelBatch.begin(camera);
	        modelBatch.render(scene.getInstances());
	        modelBatch.end();
		    System.out.println("domm");
	        
	   }

	    @Override
	    public boolean keyDown(int keycode) {
	        // In the real world, do not create NEW variables over and over, create
	        // a temporary static member instead
	        if(keycode == Input.Keys.LEFT)
	            camera.rotateAround(new Vector3(0f, 0f, 0f), new Vector3(0f, 1f, 0f), 1f);
	        if(keycode == Input.Keys.RIGHT)
	            camera.rotateAround(new Vector3(0f,0f,0f),new Vector3(0f,1f,0f), -1f);
	        if(keycode == Input.Keys.UP)
	            camera.rotateAround(new Vector3(0f, 0f, 0f), new Vector3(1f, 0f, 0f), 1f);
	        if(keycode == Input.Keys.DOWN)
	            camera.rotateAround(new Vector3(0f,0f,0f),new Vector3(1f,0f,0f), -1f);
	        return true;
	    }

	    @Override
	    public boolean keyUp(int keycode) {
	        if(keycode == Input.Keys.H)
	        {
	            camera.position.set(30f, 0f, 0f);
	            camera.lookAt(0f,0f,0f);
	        }
	        if(keycode == Input.Keys.E)
	        {
	            game.setScreen(new MainMenuScreen(game));
	            dispose();
	        }
	        if(keycode == Input.Keys.NUM_1)
	        {
	            camera.position.set(0f, 0f, 0f);
	            camera.lookAt(coordinate.Transform2Vector( 75.0f , 216.0f, 10 ));
	        }
	        if(keycode == Input.Keys.NUM_2)
	        {
	            camera.position.set(0f, 0f, 0f);
	            camera.lookAt(coordinate.Transform2Vector( 70.0f , 22.0f, 10 ));
	        }
	        if(keycode == Input.Keys.NUM_3)
	        {
	            camera.position.set(0f, 0f, 0f);
	            camera.lookAt(coordinate.Transform2Vector( 60.0f , 1.0f, 10 ));
	        }
	        if(keycode == Input.Keys.NUM_4)
	        {
	            camera.position.set(0f, 0f, 0f);
	            camera.lookAt(coordinate.Transform2Vector( coordinate.Hours2Declination("55° 57′ 35.4″"),coordinate.Hours2RightAscension("12h 54m 01.63s"), 10 ));
	        }
	        if(keycode == Input.Keys.NUM_5)
	        {
	            camera.position.set(0f, 0f, 0f);
	            camera.lookAt(coordinate.Transform2Vector( coordinate.Hours2Declination("19° 11′ 14.2″"),coordinate.Hours2RightAscension("14h 15m 40.35s"), 10 ));
	        }
	        if(keycode == Input.Keys.NUM_6)
	        {
	            camera.position.set(0f, 0f, 0f);
	            camera.lookAt(coordinate.Transform2Vector( coordinate.Hours2Declination("20° 11′ 14.2″"),coordinate.Hours2RightAscension("23h 15m 40.35s"), 10 ));
	        }

	        return true;
	    }

	    @Override
	    public boolean keyTyped(char character) {

	        return false;
	    }

	    @Override
	    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
	        return false;
	    }

	    @Override
	    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
	        return false;
	    }

	    @Override
	    public boolean touchDragged(int screenX, int screenY, int pointer) {
	        return false;
	    }

	    @Override
	    public boolean mouseMoved(int screenX, int screenY) {
	        return false;
	    }

	    @Override
	    public boolean scrolled(int amount) {
	        
		    System.out.println("amount = " + amount);
	    	      if(amount == 1){
	    	         camera.fieldOfView += 2f;
	    	      }
	    	      else if(amount == -1){
	    	         camera.fieldOfView -= 2f;
	    	      }
	    	      
	    	      
	    	
	    	return true;
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
		modelBatch.dispose();
		font.dispose();
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
	      Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 1);
	      Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT |GL20.GL_DEPTH_BUFFER_BIT);

	        camera.update();
	        modelBatch.begin(camera);
	        modelBatch.render(scene.getInstances());
	        modelBatch.end();
	}

	
	
}
