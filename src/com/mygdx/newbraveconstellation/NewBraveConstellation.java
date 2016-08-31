package com.mygdx.newbraveconstellation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.*;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.FloatAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;
import com.badlogic.gdx.math.Vector3;

public class NewBraveConstellation extends ApplicationAdapter implements InputProcessor {
    private PerspectiveCamera camera;
    //private OrthographicCamera camera;
    private ModelBatch modelBatch;
    private ModelBuilder modelBuilder;
    private Model box;
    private Model sphere;
    private ModelInstance modelInstance1;
    private ModelInstance modelInstance2;
    private ModelInstance modelInstance3;
    private ModelInstance modelInstance4;
    private ModelInstance modelInstance5;
    private Environment environment;
    private BitmapFont font;
    private SpriteBatch spriteBatch;
    private Constalation constalation;
	//private ModelInstance[] instancesTab;
    private List<ModelInstance> myList;
    
    private Scene scene;
   
   @Override
   public void create () {
	   
       float w = Gdx.graphics.getWidth();
       float h = Gdx.graphics.getHeight();
	   
        //camera = new OrthographicCamera( 30, 30 * (h / w)); //Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        camera = new PerspectiveCamera(80,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        camera.position.set(0f, 0f, 0f);
        camera.lookAt(coordinate.Transform2Vector( 30.0f , -20.0f, 10 ));
        
//        camera.lookAt(coordinate.Transform2Vector( 70.0f , 22.0f, 10 ));
        camera.near =0.1f;
        camera.far = 200f;

        modelBatch = new ModelBatch();
        modelBuilder = new ModelBuilder();
        
        spriteBatch = new SpriteBatch();  
        
        scene = new Scene();
        scene.create();
        
        font = new BitmapFont();
        font.setColor(Color.RED);
        Texture texture = new Texture(Gdx.files.internal("badlogic.jpg"));
        Material material = new Material(ColorAttribute.createDiffuse(Color.BLUE));
        long attributes = Usage.Position | Usage.Normal;

        sphere = modelBuilder.createSphere(1f, 1f, 1f, 24, 24, material, attributes);

        
        //modelInstance = new ModelInstance(box,0,0,0);
        
        
       // instancesTab1[10] = new ModelInstance(sphere,10,10,0);
        
        modelInstance1 = new ModelInstance(sphere,10,10,0);
        modelInstance2 = new ModelInstance(sphere,10,30,0);
        modelInstance3 = new ModelInstance(sphere,30,10,0);
        modelInstance4 = new ModelInstance(sphere,30,30,0);
        modelInstance5 = new ModelInstance(sphere,45,25,0);
        
        //
        myList = new ArrayList<ModelInstance>();
        myList.add( modelInstance1 );
        myList.add( modelInstance2 );
        myList.add( modelInstance3 );
        myList.add( modelInstance4 );
        myList.add( modelInstance5 );
        
        environment = new Environment();
        
        environment.set(new ColorAttribute(ColorAttribute.AmbientLight,0.8f,0.8f,0.8f,1f));

        Gdx.input.setInputProcessor(this);
   }

   @Override
   public void render () {
      Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 1);
      Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT |GL20.GL_DEPTH_BUFFER_BIT);

        camera.update();
        modelBatch.begin(camera);
        modelBatch.render(scene.getInstances());
        modelBatch.end();
        
        spriteBatch.begin();
        font.draw(spriteBatch, "xxsdfgfdhddddx", 50, 100);
        spriteBatch.end();
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
}
