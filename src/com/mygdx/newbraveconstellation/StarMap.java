package com.mygdx.newbraveconstellation;

import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.utils.Array;

public class StarMap 
{
	class Constellation
	{
		String m_Name;
		int size;
		double m_Declination;
		double m_RightAscension;
		public Array<Star> m_List;
		
		public Constellation( String name, double declination, double rightAscension )
		{
			m_Name = name;
			m_Declination = declination;
			m_RightAscension = rightAscension;
			m_List = new Array<Star>();
		}
	}
	
	class Star
	{
		//comment
		public Star( double rightAscension, double declination, int size, String name )
		{
			m_Name = name;
			m_Declination = declination;
			m_RightAscension = rightAscension;
			m_Size = size;
		}
		double m_Declination;
		double m_RightAscension;
		int m_Size;
		String m_Name;
	}
	
	public Array<Star> m_List;
	
	public StarMap()
	{
		m_List = new Array<Star>();
	}
	
	public void create () 
	{
		Constellation con = new Constellation( "Ursa Minor", 75f, 15f );
		
		con.m_List.add( new Star( coordinate.Hours2RightAscension("02h 31m 47.08s"), coordinate.Hours2Declination("89Â° 15â€˛ 50.9"), coordinate.SizeQualifier(1.97f), "Pole Star"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 50m 42.40s"), coordinate.Hours2Declination("74Â° 09â€˛ 19.7"), coordinate.SizeQualifier(2.07f), "Kochab"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("15h 20m 43.75s"), coordinate.Hours2Declination("71Â° 50â€˛ 02.3"), coordinate.SizeQualifier(3.00f), "Pherkad"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("16h 45m 58.16s"), coordinate.Hours2Declination("82Â° 02â€˛ 14.1"),	coordinate.SizeQualifier(4.21f), "Urodelus"));
		// m_List.add(new Star( coordinate.Hours2RightAscension("14h 27m 31.52s"), coordinate.Hours2Declination("75Â° 41â€˛ 45.4"),	coordinate.SizeQualifier(4.25f), "No"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("16h 17m 30.50s"), coordinate.Hours2Declination("+75° 45′ 16.9″"),    coordinate.SizeQualifier(4.95f), "Anwar al Farkadain, Alasco"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("15h 44m 03.46s"), coordinate.Hours2Declination("77Â° 47â€˛ 40.2"),	coordinate.SizeQualifier(4.29f), "Alifa al Farkadain"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("17h 32m 12.90s"), coordinate.Hours2Declination("86Â° 35â€˛ 10.8"),	coordinate.SizeQualifier(4.35f), "Yildun"));
	
		m_List.addAll(con.m_List);
	}
	
	public void create2()
	{
		
		Constellation con = new Constellation( "Cepheus", 70f, 22f );
		
		con.m_List.add( new Star( coordinate.Hours2RightAscension("21h 18m 34.58s"), coordinate.Hours2Declination("62° 35′ 07.6″"), coordinate.SizeQualifier(2.45f), "Alderamin, Alderaimin; gwiazda zmienna"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("23h 39m 20.98s"), coordinate.Hours2Declination("77° 37′ 55.1″"), coordinate.SizeQualifier(3.21f), "Arrai, Alrai, Errai, Er Rai; "));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("21h 28m 39.58s"), coordinate.Hours2Declination("70° 33′ 38.5″"), coordinate.SizeQualifier(3.23f), "Alfirk, Alphirk; prototyp gwiazd zmiennych "));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 10m 51.26s"), coordinate.Hours2Declination("58° 12′ 04.5″"), coordinate.SizeQualifier(3.39f), "Tsao Fu; zmienna"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("20h 45m 17.27s"), coordinate.Hours2Declination("61° 50′ 12.5″"), coordinate.SizeQualifier(3.41f), "Al Agemim, Al Agimim"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 49m 40.91s"), coordinate.Hours2Declination("66° 12′ 02.6″"), coordinate.SizeQualifier(3.50f), "Alvahet, Alvahat, Al Wahat; zmienna"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 29m 10.25s"), coordinate.Hours2Declination("58° 24′ 54.7″"), coordinate.SizeQualifier(4.07f), "Alrediph, Al Radif; prototyp cefeid; "));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 15m 01.68s"), coordinate.Hours2Declination("57° 02′ 36.5″"), coordinate.SizeQualifier(4.18f), "Phicares, Phicareus; zmienna typu δ Sct"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("20h 29m 34.83s"), coordinate.Hours2Declination("62° 59′ 38.9″"), coordinate.SizeQualifier(4.21f), "Al Kidr; gwiazda spektroskopowo podwójna"));
		//con.m_List.add( new Star( coordinate.Hours2RightAscension("21h 43m 30.45s"), coordinate.Hours2Declination("58° 46′ 48.2″"), coordinate.SizeQualifier(4.23f), "Erakis; gwiazda zmienna półregularna"));

		// add to StarMap list
		m_List.addAll(con.m_List);
	}

	public void create3()
	{
		
		Constellation con = new Constellation( "Cassiopeia", 60f, 1f );
		
		con.m_List.add( new Star( coordinate.Hours2RightAscension("00h 56m 42.50s"), coordinate.Hours2Declination("60° 43′ 00.3″"), coordinate.SizeQualifier(2.15f), "Cih, Tsih, Marj, Navi"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("00h 40m 30.39s"), coordinate.Hours2Declination("56° 32′ 14.7″"), coordinate.SizeQualifier(2.24f), "Schedar, Szedar, Szedir"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("00h 09m 10.09s"), coordinate.Hours2Declination("59° 09′ 00.8″"), coordinate.SizeQualifier(2.28f), "Caph, Al Sanam al Nakah"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("01h 25m 48.60s"), coordinate.Hours2Declination("60° 14′ 07.5″"), coordinate.SizeQualifier(2.66f), "Ruchba, Ruchbah, Ksora;"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("01h 54m 23.68s"), coordinate.Hours2Declination("63° 40′ 12.5″"), coordinate.SizeQualifier(3.35f), "Segin"));
		//con.m_List.add( new Star( coordinate.Hours2RightAscension("00h 49m 05.10s"), coordinate.Hours2Declination("57° 48′ 59.6″"), coordinate.SizeQualifier(3.46f), "Achird; gwiazda podwójna"));
		
		// add to StarMap list
		m_List.addAll(con.m_List);
	}
	
	
	public void create4()
	{
		
		Constellation con = new Constellation( "Boötes", 30f, 20.5f );
		

		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 15m 40.35s"), coordinate.Hours2Declination("19° 11′ 14.2″"), coordinate.SizeQualifier(-0.05f), "Haris-el-sema"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 44m 59.25s"), coordinate.Hours2Declination("27° 04′ 27.0″"), coordinate.SizeQualifier( 2.35f), "Izar, Mirak, Pulcherrima, Mizar"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("13h 54m 41.12s"), coordinate.Hours2Declination("18° 23′ 54.9″"), coordinate.SizeQualifier( 2.68f), "Muphrid"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 44m 59.20s"), coordinate.Hours2Declination("27° 04′ 27.0″"), coordinate.SizeQualifier( 2.70f), "składnik układu ε Boo"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 32m 04.76s"), coordinate.Hours2Declination("38° 18′ 28.4″"), coordinate.SizeQualifier( 3.04f), "Seginus, Segin, Ceginus, Haris; zmienna typu δ Sct"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("15h 15m 30.10s"), coordinate.Hours2Declination("33° 18′ 54.4″"), coordinate.SizeQualifier( 3.46f), "Princeps"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("15h 01m 56.79s"), coordinate.Hours2Declination("40° 23′ 26.3″"), coordinate.SizeQualifier( 3.49f), "Nekkar, Meres"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 31m 49.86s"), coordinate.Hours2Declination("30° 22′ 16.1″"), coordinate.SizeQualifier( 3.57f), "Hemelein Prima, Al Hamalain"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 41m 08.92s"), coordinate.Hours2Declination("13° 43′ 42.0″"), coordinate.SizeQualifier( 3.78f), "gwiazda podwójna"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 25m 12.02s"), coordinate.Hours2Declination("51° 51′ 06.2″"), coordinate.SizeQualifier( 4.04f), "F7V	Asellus primus"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("13h 49m 28.70s"), coordinate.Hours2Declination("15° 47′ 52.1″"), coordinate.SizeQualifier( 4.05f), "nothing"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 16m 23.18s"), coordinate.Hours2Declination("46° 05′ 16.5″"), coordinate.SizeQualifier( 4.18f), "nothing"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("15h 24m 29.54s"), coordinate.Hours2Declination("37° 22′ 37.1″"), coordinate.SizeQualifier( 4.31f), "Alkalurops, Inkalunis, Clava, Venabulum"));
		//con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 41m 08.90s"), coordinate.Hours2Declination("13° 43′ 42.0″"), coordinate.SizeQualifier( 4.43f), "A2III"));
				
		// add to StarMap list
		m_List.addAll(con.m_List);
	}
	
	public void create5()
	{
	Constellation con = new Constellation( "Bootes", 55f, 11f );
	con.m_List.add( new Star( coordinate.Hours2RightAscension("12h 54m 01.63s"), coordinate.Hours2Declination("55° 57′ 35.4″"), coordinate.SizeQualifier(1.76f), "Alioth, Aliot"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("11h 03m 43.84s"), coordinate.Hours2Declination("61° 45′ 04.0″"), coordinate.SizeQualifier(1.81f), "Dubhe, Dubh, Dubb, Thahr al Dub alAkbar, Ak"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("13h 47m 32.55s"), coordinate.Hours2Declination("49° 18′ 47.9″"), coordinate.SizeQualifier(1.85f), "Benetnasch, Alkaid, Elkeid"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("13h 23m 55.42s"), coordinate.Hours2Declination("54° 55′ 31.5″"), coordinate.SizeQualifier(2.23f), "Mizat, Mirza, Mizar; gwiazda poczwórna, "));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("11h 01m 50.39s"), coordinate.Hours2Declination("56° 22′ 56.4″"), coordinate.SizeQualifier(2.34f), "Merak, Mirak"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("11h 53m 49.74s"), coordinate.Hours2Declination("53° 41′ 41.0″"), coordinate.SizeQualifier(2.41f), "Phad, Phecda, Phegda, Phekha,Phacd"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("11h 09m 39.86s"), coordinate.Hours2Declination("44° 29′ 54.8″"), coordinate.SizeQualifier(3.00f), "Ta Tsun"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("10h 22m 19.80s"), coordinate.Hours2Declination("41° 29′ 58.0″"), coordinate.SizeQualifier(3.06f), "Tania Australis, AlkafzahAustralis"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("08h 59m 12.84s"), coordinate.Hours2Declination("48° 02′ 32.5″"), coordinate.SizeQualifier(3.12f), "Talitha Borealis, Talita Borealis,Dnoces, Alphikra Borealis"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("09h 32m 52.33s"), coordinate.Hours2Declination("51° 40′ 43.0″"), coordinate.SizeQualifier(3.17f), "Al Haud, Sarir, Sarir Bonet"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("12h 15m 25.45s"), coordinate.Hours2Declination("57° 01′ 57.4″"), coordinate.SizeQualifier(3.32f), "Megrez, Kaffa"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("08h 30m 16.03s"), coordinate.Hours2Declination("60° 43′ 06.4″"), coordinate.SizeQualifier(3.35f), "Muscida"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("10h 17m 05.93s"), coordinate.Hours2Declination("42° 54′ 52.1″"), coordinate.SizeQualifier(3.45f), "Tania Borealis, AlkafzahBorealis"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("11h 18m 28.76s"), coordinate.Hours2Declination("33° 05′ 39.3″"), coordinate.SizeQualifier(3.49f), "Alula Borealis"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("09h 03m 37.56s"), coordinate.Hours2Declination("47° 09′ 24.0″"), coordinate.SizeQualifier(3.57f), "Talitha Australis, Al Kaprah,Alphikra Australis"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("09h 31m 31.57s"), coordinate.Hours2Declination("63° 03′ 42.5″"), coordinate.SizeQualifier(3.65f), "n"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("11h 46m 03.13s"), coordinate.Hours2Declination("47° 46′ 45.6″"), coordinate.SizeQualifier(3.69f), "Alkafzah, Alkaphrah, El Koprah"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("09h 50m 59.69s"), coordinate.Hours2Declination("59° 02′ 20.8″"), coordinate.SizeQualifier(3.78f), "δ zmienna typu Sct"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("11h 18m 11.24s"), coordinate.Hours2Declination("31° 31′ 50.8″"), coordinate.SizeQualifier(3.79f), "Alula Australis; gwiazdapodwójna"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("13h 23m 56.40s"), coordinate.Hours2Declination("54° 55′ 18.0″"), coordinate.SizeQualifier(3.95f), "n"));
	// add to StarMap list
	m_List.addAll(con.m_List);
	}
	
	public Array<Star> getInstances() {
		return m_List;
	}
	
}