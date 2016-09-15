package com.mygdx.newbraveconstellation;

import java.util.Iterator;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;
import com.badlogic.gdx.utils.Array;
import com.mygdx.newbraveconstellation.StarMap.Constellation;
import com.mygdx.newbraveconstellation.StarMap.Star;

class StarPool {

    public Array<ModelInstance> instances = new Array<ModelInstance>();
    private ModelBuilder modelBuilder;
    private Model[] sphere;
    private StarMap starMap;
    private int i;
    
	public void createPool()
	{

        modelBuilder = new ModelBuilder();
		instances = new Array<ModelInstance>();

		starMap = new StarMap();
		starMap.create();
		starMap.create2();
		starMap.create3();
		starMap.create4();
		starMap.create5();
		starMap.create6();
		
		i = 0;
		
        Material material = new Material(ColorAttribute.createDiffuse(Color.WHITE));
        long attributes = Usage.Position | Usage.Normal;
        
        sphere = new Model[4];
        
        sphere[0] = modelBuilder.createSphere(0.18f, 0.18f, 0.18f, 24, 24, material, attributes);
        sphere[1] = modelBuilder.createSphere(0.12f, 0.12f, 0.12f, 24, 24, material, attributes);
        sphere[2] = modelBuilder.createSphere(0.09f, 0.09f, 0.09f, 24, 24, material, attributes);

        Iterator<Star> iter = starMap.getInstances().iterator();
        while (iter.hasNext()){
        	Star s = iter.next();
        	instances.add(new ModelInstance(sphere[s.m_Size-1],coordinate.Transform2Vector( s.m_Declination , s.m_RightAscension, 10)));
        }
	}
    
    public void AddInstances( Array<ModelInstance> array )
    {
    	instances.addAll(array);
    }
    
	
	public Array<ModelInstance> getInstances() {
		return instances;
	}
    
	public Constellation take(){
		System.out.println("size =" + starMap.m_ConstellationList.size);
		System.out.println("i = " + i);		
		if ( starMap.m_ConstellationList.size - 1 == i )
		{
			System.out.println("kuku");	
			// end of list
		}
		else
		{
			i++;
		}
		return starMap.m_ConstellationList.get(i);
	}
	
}
