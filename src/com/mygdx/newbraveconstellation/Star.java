package com.mygdx.newbraveconstellation;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;

public class Star {

	private float declination;
	private float rightAscension;
	private float x, y , z ;
	private String name;
    private ModelBuilder modelBuilder;
    private Model sphere;
    private ModelInstance instance;

	public Star( float fx, float fy, float fz )
	{
		x = fx;
		y = fy;
		z = fz;
        modelBuilder = new ModelBuilder();
		
        Material material = new Material(ColorAttribute.createDiffuse(Color.BLUE));
        long attributes = Usage.Position | Usage.Normal;
        
        sphere = modelBuilder.createSphere(1f, 1f, 1f, 24, 24, material, attributes);
		
        instance = new ModelInstance(sphere,x,y,z);
	}
	
	public Star( float fx, float fy, float fz, String sName )
	{
		x = fx;
		y = fy;
		z = fz;
		name = sName;
	}
	
	public Star( float fDeclination, float fRightAscension )
	{
		declination = fDeclination;
		rightAscension = fRightAscension;
	}
	
	public float GetX ()
	{
		return x;
	}
	
	public float GetY ()
	{
		return y;
	}
	
	public float GetZ ()
	{
		return z;
	}
	
	public float Transform2DeclinationY( double kat, double r  )
	{	
		float y;
		y = (float) (Math.sin( kat ) * r);
		return y ;
	}
	
	public float Transform2DeclinationX( double kat, double r  )
	{	
		float x;
		x = (float) (Math.cos( kat ) * r);
		return x ;
	}
	
	
	public float GetDeclination ()
	{
		return declination;
	}

	public float GetRightAscension ()
	{
		return rightAscension;
	}
	
	public String GetName ()
	{
		return name;
	}
	
	

}
