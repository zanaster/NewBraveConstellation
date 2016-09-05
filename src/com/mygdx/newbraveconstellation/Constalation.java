package com.mygdx.newbraveconstellation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.mygdx.newbraveconstellation.StarMap.Star;

public class Constalation {
	
	public Array<Star> stars;
	public Array<ModelInstance> instances;
    private ModelBuilder modelBuilder;
    private Model[] sphere;
    private Model sphereBig;
    private Model sphereX;
    private Model sphereY;
    private Model sphereZ;
    private ModelInstance instance;
    private StarMap starMap;
	
	public void create()
	{
        modelBuilder = new ModelBuilder();
		instances = new Array<ModelInstance>();
		
		//coordi = new coordinate(0, 0, 0);
		starMap = new StarMap();
		starMap.create();
		starMap.create2();
		starMap.create3();
		starMap.create4();
		starMap.create5();
		starMap.create6();
		
        Material material = new Material(ColorAttribute.createDiffuse(Color.WHITE));
        Material material2 = new Material(ColorAttribute.createDiffuse(Color.BROWN));
        long attributes = Usage.Position | Usage.Normal;
        
        sphere = new Model[4];
        
        sphere[0] = modelBuilder.createSphere(0.18f, 0.18f, 0.18f, 24, 24, material, attributes);
        sphere[1] = modelBuilder.createSphere(0.12f, 0.12f, 0.12f, 24, 24, material, attributes);
        sphere[2] = modelBuilder.createSphere(0.09f, 0.09f, 0.09f, 24, 24, material, attributes);
        
        
        sphereBig = modelBuilder.createSphere(1f, 1f, 1f, 24, 24, material2, attributes);

        
        Material materialX = new Material(ColorAttribute.createDiffuse(Color.YELLOW));
        Material materialY = new Material(ColorAttribute.createDiffuse(Color.RED));
        Material materialZ = new Material(ColorAttribute.createDiffuse(Color.VIOLET));
        
        sphereX = modelBuilder.createSphere(0.3f, 0.3f, 0.3f, 24, 24, materialX, attributes);
        sphereY = modelBuilder.createSphere(0.3f, 0.3f, 0.3f, 24, 24, materialY, attributes);
        sphereZ = modelBuilder.createSphere(0.3f, 0.3f, 0.3f, 24, 24, materialZ, attributes);
        

        Iterator<Star> iter = starMap.getInstances().iterator();
        while (iter.hasNext()){
        	Star s = iter.next();
        	instances.add(new ModelInstance(sphere[s.m_Size-1],coordinate.Transform2Vector( s.m_Declination , s.m_RightAscension, 10)));
            }
        
	}
	
	public Array<ModelInstance> getInstances() {
		return instances;
	}

	public void setInstances(Array<ModelInstance> instances) {
		this.instances = instances;
	}

	public void dislay()
	{
	}
	
}
