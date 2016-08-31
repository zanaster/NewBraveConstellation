package com.mygdx.newbraveconstellation;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;
import com.badlogic.gdx.utils.Array;

class Scene {

    public Array<ModelInstance> instances = new Array<ModelInstance>();
    private Constalation constalation;
    
	public void create()
	{
		
        constalation = new Constalation();
        constalation.create();
        
        AddInstances(constalation.getInstances());
	}
    
    public void AddInstances( Array<ModelInstance> array )
    {
    	instances.addAll(array);
    }
    
	
	public Array<ModelInstance> getInstances() {
		return instances;
	}
    
}
