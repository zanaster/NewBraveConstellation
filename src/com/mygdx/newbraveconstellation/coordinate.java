package com.mygdx.newbraveconstellation;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;


public class coordinate {
	
	double x;
	double y;
	double z;
	
	public coordinate(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	
	static public double Hours2RightAscension( String data )
	{
		Matcher matcher = Pattern.compile( "[-+]?\\d*\\.?\\d+([eE][-+]?\\d+)?" ).matcher( data );

		matcher.find();
		double h = Double.parseDouble( matcher.group() );
		matcher.find();
		double m = Double.parseDouble( matcher.group() );
		matcher.find();
		double s = Double.parseDouble( matcher.group() );
		
	    
	    double RightAscension = h * 15 + m * 0.25 + s * 0.0041;
	    
	    System.out.println("h="+h+", m="+m+", s="+s);
	    System.out.println("RightAscension = "+RightAscension);
		
		return RightAscension;	

	}
	
	static public double Hours2Declination( String data )
	{
		Matcher matcher = Pattern.compile( "[-+]?\\d*\\.?\\d+([eE][-+]?\\d+)?" ).matcher( data );

		matcher.find();
		double a = Double.parseDouble( matcher.group() );
		matcher.find();
		double m = Double.parseDouble( matcher.group() );
		matcher.find();
		double s = Double.parseDouble( matcher.group() );
		
	    // Convention base on www.swift.psu.edu/secure/toop/convert.php
		
	    double Declination = a + m * 0.0167 + s * 0.0003;
	    
	    System.out.println("h="+a+", m="+m+", s="+s);
	    System.out.println("Declination = "+Declination);
		
		return Declination;	

	}
	
	
	static public Vector3 Transform2Vector( double declination, double rightAscension, double r )
	{	
	    double x = r * Math.cos(Math.toRadians( declination ));
	    double y = r * Math.sin(Math.toRadians( declination ));
	    double Z = x * Math.sin(Math.toRadians( -rightAscension )); 
	    double X = x * Math.cos(Math.toRadians( -rightAscension )); 
	    
	    System.out.println("X="+X+", Y="+y+", Z="+Z);
	    
	    Vector3 a = new Vector3((float)X,(float)y,(float)Z);
	    return a;
	}
    

	static public int SizeQualifier( float magnitude )
	{	
		// https://en.wikipedia.org/wiki/Apparent_magnitude
		int size = 0;
		if( magnitude <= 2.3 )
		{
			size = 1;
		}
		else if( magnitude <= 4.0)
		{
			size = 2;
		}
		else
		{
			size = 3;
		}
		return size ;
	}

	

	
}
