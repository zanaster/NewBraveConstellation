package com.mygdx.newbraveconstellation;

import java.util.Iterator;
import java.util.List;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.*;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.math.Vector3;

public class NewBraveConstellation extends Game {

    public BitmapFont font;
    public SpriteBatch spriteBatch;
    

    public void create() {
        font = new BitmapFont();
        spriteBatch = new SpriteBatch();  
        this.setScreen(new SplashScreen(this));

    }

    public void render() {
        super.render(); //important!
    }

    public void dispose() {
    	spriteBatch.dispose();
        font.dispose();
    }
   


    
}
