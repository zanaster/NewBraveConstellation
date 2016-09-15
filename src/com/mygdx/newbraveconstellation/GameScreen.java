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
import com.mygdx.newbraveconstellation.StarMap.Constellation;

public class GameScreen implements Screen, InputProcessor
{
	final NewBraveConstellation game;
     
    private PerspectiveCamera camera;
    private ModelBatch modelBatch;
    private Environment environment;
    private BitmapFont font;
    private SpriteBatch spriteBatch;
    private List<ModelInstance> myList;
    private Vector3 f_vec;
    private float delta;
    private boolean first;
    private Vector3 vec;
    private String starString ;
    
    public enum State {
        THINKING, CHANGING, WINNING, STARTING
    }
    private State state = State.THINKING;
    
    private StarPool starPool;
	
	   public GameScreen ( final NewBraveConstellation gam ) {
	        this.game = gam;
	        
		    System.out.println("GameScreen");
	        
	        camera = new PerspectiveCamera(80,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
	        camera.position.set(0f, 0f, 0f);
	        f_vec = new Vector3(coordinate.Transform2Vector( 30.0f , -20.0f, 10 ));
	        vec = new Vector3( 0.0f, 0.0f, 0.0f );
	        
	        camera.lookAt(f_vec);
	        camera.near =0.1f;
	        camera.far = 200f;
	        
	        starString = "starString";

	        modelBatch = new ModelBatch();
	        
	        spriteBatch = new SpriteBatch();  
	        
	        starPool = new StarPool();
	        starPool.createPool();
	        
	        delta = 2.0f;
	        
	        first = true;
	        
	        
	        font = new BitmapFont();
	        font.setColor(Color.RED);
	        
	        environment = new Environment();
	        environment.set(new ColorAttribute(ColorAttribute.AmbientLight,0.8f,0.8f,0.8f,1f));

	        Gdx.input.setInputProcessor(this);
	   }

	   public void render () {
	      Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 1);
	      Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT |GL20.GL_DEPTH_BUFFER_BIT);

	        
	      if( state == State.CHANGING )
	      {
	    	  Constellation con = starPool.take();
	          camera.position.set(0f, 0f, 0f);
	          camera.lookAt(coordinate.Transform2Vector( con.m_Declination , con.m_RightAscension, 10 ));
	          
	          state = State.THINKING;
	      }
	      
	      camera.update();
	      modelBatch.begin(camera);
	      modelBatch.render(starPool.getInstances());
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
	        
	        if(keycode == Input.Keys.C)
	        {
	  	      state = State.CHANGING;
	        }
	        
	        if(keycode == Input.Keys.NUM_1)
	        {
	            camera.position.set(0f, 0f, 0f);
	            
		        f_vec = new Vector3(coordinate.Transform2Vector( 75.0f , 216.0f, 10 ));
		        camera.lookAt(f_vec);
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
	        
		      if( state == State.CHANGING )
		      {
		    	  if ( first )
		    	  {
			    	  Constellation con = starPool.take();
			    	  vec = new Vector3(coordinate.Transform2Vector( coordinate.Hours2Declination(con.m_Declination) , coordinate.Hours2RightAscension(con.m_RightAscension), 10 ));
			    	  starString = con.m_Name;
			    	  first = false;
		    	  }
		    	  
		          //camera.position.set(0f, 0f, 0f);
		         
		   
		          float dx = (vec.x - f_vec.x) / 100;
		          float dy = (vec.y - f_vec.y) / 100;
		          float dz = (vec.z - f_vec.z) / 100;
		          
		    
		          f_vec.x = f_vec.x + dx;
		          f_vec.y = f_vec.y + dy;
		          f_vec.z = f_vec.z + dz;
		          

		          camera.lookAt( f_vec );

		          float dex = f_vec.x - vec.x; 
		          float dey = f_vec.y - vec.y; 
		          float dez = f_vec.z - vec.z; 
		          
		          if( (dex < 0.15) && (dey < 0.15) && (dez < 0.15) )
		          {
		   		      System.out.println("State changed");
		        	  state = State.THINKING;
		        	  first = true;
		          }

		      }
		      
//		      if( state == State.THINKING )
//		      {
//		    	  starString = 
//
//		      }
		      
		      
		      camera.update();
		      modelBatch.begin(camera);
		      modelBatch.render(starPool.getInstances());
		      modelBatch.end();    
		      
		      
		      game.spriteBatch.begin();
		      //game.spriteBatch.draw(splashScreen, 0, 0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		      game.font.draw(game.spriteBatch, starString , 10, 450);
		      game.spriteBatch.end();
	}
	
	private void ChangeTo( StarMap.Constellation con)
	{
		
	}

	
	
}
