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
		
		con.m_List.add( new Star( coordinate.Hours2RightAscension("02h 31m 47.08s"), coordinate.Hours2Declination("89Ă‚Â° 15Ă˘â‚¬Ë› 50.9"), coordinate.SizeQualifier(1.97f), "Pole Star"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 50m 42.40s"), coordinate.Hours2Declination("74Ă‚Â° 09Ă˘â‚¬Ë› 19.7"), coordinate.SizeQualifier(2.07f), "Kochab"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("15h 20m 43.75s"), coordinate.Hours2Declination("71Ă‚Â° 50Ă˘â‚¬Ë› 02.3"), coordinate.SizeQualifier(3.00f), "Pherkad"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("16h 45m 58.16s"), coordinate.Hours2Declination("82Ă‚Â° 02Ă˘â‚¬Ë› 14.1"),	coordinate.SizeQualifier(4.21f), "Urodelus"));
		// m_List.add(new Star( coordinate.Hours2RightAscension("14h 27m 31.52s"), coordinate.Hours2Declination("75Ă‚Â° 41Ă˘â‚¬Ë› 45.4"),	coordinate.SizeQualifier(4.25f), "No"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("16h 17m 30.50s"), coordinate.Hours2Declination("+75Â° 45â€˛ 16.9â€ł"),    coordinate.SizeQualifier(4.95f), "Anwar al Farkadain, Alasco"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("15h 44m 03.46s"), coordinate.Hours2Declination("77Ă‚Â° 47Ă˘â‚¬Ë› 40.2"),	coordinate.SizeQualifier(4.29f), "Alifa al Farkadain"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("17h 32m 12.90s"), coordinate.Hours2Declination("86Ă‚Â° 35Ă˘â‚¬Ë› 10.8"),	coordinate.SizeQualifier(4.35f), "Yildun"));
	
		m_List.addAll(con.m_List);
	}
	
	public void create2()
	{
		
		Constellation con = new Constellation( "Cepheus", 70f, 22f );
		
		con.m_List.add( new Star( coordinate.Hours2RightAscension("21h 18m 34.58s"), coordinate.Hours2Declination("62Â° 35â€˛ 07.6â€ł"), coordinate.SizeQualifier(2.45f), "Alderamin, Alderaimin; gwiazda zmienna"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("23h 39m 20.98s"), coordinate.Hours2Declination("77Â° 37â€˛ 55.1â€ł"), coordinate.SizeQualifier(3.21f), "Arrai, Alrai, Errai, Er Rai; "));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("21h 28m 39.58s"), coordinate.Hours2Declination("70Â° 33â€˛ 38.5â€ł"), coordinate.SizeQualifier(3.23f), "Alfirk, Alphirk; prototyp gwiazd zmiennych "));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 10m 51.26s"), coordinate.Hours2Declination("58Â° 12â€˛ 04.5â€ł"), coordinate.SizeQualifier(3.39f), "Tsao Fu; zmienna"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("20h 45m 17.27s"), coordinate.Hours2Declination("61Â° 50â€˛ 12.5â€ł"), coordinate.SizeQualifier(3.41f), "Al Agemim, Al Agimim"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 49m 40.91s"), coordinate.Hours2Declination("66Â° 12â€˛ 02.6â€ł"), coordinate.SizeQualifier(3.50f), "Alvahet, Alvahat, Al Wahat; zmienna"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 29m 10.25s"), coordinate.Hours2Declination("58Â° 24â€˛ 54.7â€ł"), coordinate.SizeQualifier(4.07f), "Alrediph, Al Radif; prototyp cefeid; "));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 15m 01.68s"), coordinate.Hours2Declination("57Â° 02â€˛ 36.5â€ł"), coordinate.SizeQualifier(4.18f), "Phicares, Phicareus; zmienna typu Î´ Sct"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("20h 29m 34.83s"), coordinate.Hours2Declination("62Â° 59â€˛ 38.9â€ł"), coordinate.SizeQualifier(4.21f), "Al Kidr; gwiazda spektroskopowo podwĂłjna"));
		//con.m_List.add( new Star( coordinate.Hours2RightAscension("21h 43m 30.45s"), coordinate.Hours2Declination("58Â° 46â€˛ 48.2â€ł"), coordinate.SizeQualifier(4.23f), "Erakis; gwiazda zmienna pĂłĹ‚regularna"));

		// add to StarMap list
		m_List.addAll(con.m_List);
	}

	public void create3()
	{
		
		Constellation con = new Constellation( "Cassiopeia", 60f, 1f );
		
		con.m_List.add( new Star( coordinate.Hours2RightAscension("00h 56m 42.50s"), coordinate.Hours2Declination("60Â° 43â€˛ 00.3â€ł"), coordinate.SizeQualifier(2.15f), "Cih, Tsih, Marj, Navi"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("00h 40m 30.39s"), coordinate.Hours2Declination("56Â° 32â€˛ 14.7â€ł"), coordinate.SizeQualifier(2.24f), "Schedar, Szedar, Szedir"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("00h 09m 10.09s"), coordinate.Hours2Declination("59Â° 09â€˛ 00.8â€ł"), coordinate.SizeQualifier(2.28f), "Caph, Al Sanam al Nakah"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("01h 25m 48.60s"), coordinate.Hours2Declination("60Â° 14â€˛ 07.5â€ł"), coordinate.SizeQualifier(2.66f), "Ruchba, Ruchbah, Ksora;"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("01h 54m 23.68s"), coordinate.Hours2Declination("63Â° 40â€˛ 12.5â€ł"), coordinate.SizeQualifier(3.35f), "Segin"));
		//con.m_List.add( new Star( coordinate.Hours2RightAscension("00h 49m 05.10s"), coordinate.Hours2Declination("57Â° 48â€˛ 59.6â€ł"), coordinate.SizeQualifier(3.46f), "Achird; gwiazda podwĂłjna"));
		
		// add to StarMap list
		m_List.addAll(con.m_List);
	}
	
	
	public void create4()
	{
		
		Constellation con = new Constellation( "BoĂ¶tes", 30f, 20.5f );
		

		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 15m 40.35s"), coordinate.Hours2Declination("19Â° 11â€˛ 14.2â€ł"), coordinate.SizeQualifier(-0.05f), "Haris-el-sema"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 44m 59.25s"), coordinate.Hours2Declination("27Â° 04â€˛ 27.0â€ł"), coordinate.SizeQualifier( 2.35f), "Izar, Mirak, Pulcherrima, Mizar"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("13h 54m 41.12s"), coordinate.Hours2Declination("18Â° 23â€˛ 54.9â€ł"), coordinate.SizeQualifier( 2.68f), "Muphrid"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 44m 59.20s"), coordinate.Hours2Declination("27Â° 04â€˛ 27.0â€ł"), coordinate.SizeQualifier( 2.70f), "skĹ‚adnik ukĹ‚adu Îµ Boo"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 32m 04.76s"), coordinate.Hours2Declination("38Â° 18â€˛ 28.4â€ł"), coordinate.SizeQualifier( 3.04f), "Seginus, Segin, Ceginus, Haris; zmienna typu Î´ Sct"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("15h 15m 30.10s"), coordinate.Hours2Declination("33Â° 18â€˛ 54.4â€ł"), coordinate.SizeQualifier( 3.46f), "Princeps"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("15h 01m 56.79s"), coordinate.Hours2Declination("40Â° 23â€˛ 26.3â€ł"), coordinate.SizeQualifier( 3.49f), "Nekkar, Meres"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 31m 49.86s"), coordinate.Hours2Declination("30Â° 22â€˛ 16.1â€ł"), coordinate.SizeQualifier( 3.57f), "Hemelein Prima, Al Hamalain"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 41m 08.92s"), coordinate.Hours2Declination("13Â° 43â€˛ 42.0â€ł"), coordinate.SizeQualifier( 3.78f), "gwiazda podwĂłjna"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 25m 12.02s"), coordinate.Hours2Declination("51Â° 51â€˛ 06.2â€ł"), coordinate.SizeQualifier( 4.04f), "F7V	Asellus primus"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("13h 49m 28.70s"), coordinate.Hours2Declination("15Â° 47â€˛ 52.1â€ł"), coordinate.SizeQualifier( 4.05f), "nothing"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 16m 23.18s"), coordinate.Hours2Declination("46Â° 05â€˛ 16.5â€ł"), coordinate.SizeQualifier( 4.18f), "nothing"));
		con.m_List.add( new Star( coordinate.Hours2RightAscension("15h 24m 29.54s"), coordinate.Hours2Declination("37Â° 22â€˛ 37.1â€ł"), coordinate.SizeQualifier( 4.31f), "Alkalurops, Inkalunis, Clava, Venabulum"));
		//con.m_List.add( new Star( coordinate.Hours2RightAscension("14h 41m 08.90s"), coordinate.Hours2Declination("13Â° 43â€˛ 42.0â€ł"), coordinate.SizeQualifier( 4.43f), "A2III"));
				
		// add to StarMap list
		m_List.addAll(con.m_List);
	}
	
	public void create5()
	{
	Constellation con = new Constellation( "Bootes", 55f, 11f );
	con.m_List.add( new Star( coordinate.Hours2RightAscension("12h 54m 01.63s"), coordinate.Hours2Declination("55Â° 57â€˛ 35.4â€ł"), coordinate.SizeQualifier(1.76f), "Alioth, Aliot"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("11h 03m 43.84s"), coordinate.Hours2Declination("61Â° 45â€˛ 04.0â€ł"), coordinate.SizeQualifier(1.81f), "Dubhe, Dubh, Dubb, Thahr al Dub alAkbar, Ak"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("13h 47m 32.55s"), coordinate.Hours2Declination("49Â° 18â€˛ 47.9â€ł"), coordinate.SizeQualifier(1.85f), "Benetnasch, Alkaid, Elkeid"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("13h 23m 55.42s"), coordinate.Hours2Declination("54Â° 55â€˛ 31.5â€ł"), coordinate.SizeQualifier(2.23f), "Mizat, Mirza, Mizar; gwiazda poczwĂłrna, "));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("11h 01m 50.39s"), coordinate.Hours2Declination("56Â° 22â€˛ 56.4â€ł"), coordinate.SizeQualifier(2.34f), "Merak, Mirak"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("11h 53m 49.74s"), coordinate.Hours2Declination("53Â° 41â€˛ 41.0â€ł"), coordinate.SizeQualifier(2.41f), "Phad, Phecda, Phegda, Phekha,Phacd"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("11h 09m 39.86s"), coordinate.Hours2Declination("44Â° 29â€˛ 54.8â€ł"), coordinate.SizeQualifier(3.00f), "Ta Tsun"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("10h 22m 19.80s"), coordinate.Hours2Declination("41Â° 29â€˛ 58.0â€ł"), coordinate.SizeQualifier(3.06f), "Tania Australis, AlkafzahAustralis"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("08h 59m 12.84s"), coordinate.Hours2Declination("48Â° 02â€˛ 32.5â€ł"), coordinate.SizeQualifier(3.12f), "Talitha Borealis, Talita Borealis,Dnoces, Alphikra Borealis"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("09h 32m 52.33s"), coordinate.Hours2Declination("51Â° 40â€˛ 43.0â€ł"), coordinate.SizeQualifier(3.17f), "Al Haud, Sarir, Sarir Bonet"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("12h 15m 25.45s"), coordinate.Hours2Declination("57Â° 01â€˛ 57.4â€ł"), coordinate.SizeQualifier(3.32f), "Megrez, Kaffa"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("08h 30m 16.03s"), coordinate.Hours2Declination("60Â° 43â€˛ 06.4â€ł"), coordinate.SizeQualifier(3.35f), "Muscida"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("10h 17m 05.93s"), coordinate.Hours2Declination("42Â° 54â€˛ 52.1â€ł"), coordinate.SizeQualifier(3.45f), "Tania Borealis, AlkafzahBorealis"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("11h 18m 28.76s"), coordinate.Hours2Declination("33Â° 05â€˛ 39.3â€ł"), coordinate.SizeQualifier(3.49f), "Alula Borealis"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("09h 03m 37.56s"), coordinate.Hours2Declination("47Â° 09â€˛ 24.0â€ł"), coordinate.SizeQualifier(3.57f), "Talitha Australis, Al Kaprah,Alphikra Australis"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("09h 31m 31.57s"), coordinate.Hours2Declination("63Â° 03â€˛ 42.5â€ł"), coordinate.SizeQualifier(3.65f), "n"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("11h 46m 03.13s"), coordinate.Hours2Declination("47Â° 46â€˛ 45.6â€ł"), coordinate.SizeQualifier(3.69f), "Alkafzah, Alkaphrah, El Koprah"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("09h 50m 59.69s"), coordinate.Hours2Declination("59Â° 02â€˛ 20.8â€ł"), coordinate.SizeQualifier(3.78f), "Î´ zmienna typu Sct"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("11h 18m 11.24s"), coordinate.Hours2Declination("31Â° 31â€˛ 50.8â€ł"), coordinate.SizeQualifier(3.79f), "Alula Australis; gwiazdapodwĂłjna"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("13h 23m 56.40s"), coordinate.Hours2Declination("54Â° 55â€˛ 18.0â€ł"), coordinate.SizeQualifier(3.95f), "n"));
	// add to StarMap list
	m_List.addAll(con.m_List);
	}
	
	public void create6()
	{
	Constellation con = new Constellation( "Pegaz", 55f, 11f );
	

	con.m_List.add( new Star( coordinate.Hours2RightAscension("21h 44m 11.14s"), coordinate.Hours2Declination("09° 52′ 30.0″"), coordinate.SizeQualifier(2.38f), "Enif, Enf, Enir, Al Anf, Fom, Fum al Faras, Os Pegasi"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("23h 03m 46.33s"), coordinate.Hours2Declination("28° 04′ 56.8″"), coordinate.SizeQualifier(2.44f), "Scheat, Sheat, Seat Alpheras, Menkib"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("23h 04m 45.62s"), coordinate.Hours2Declination("15° 12′ 19.3″"), coordinate.SizeQualifier(2.49f), "Markab, Marchab, Menkib al Faras, Matn al Faras"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("00h 13m 14.15s"), coordinate.Hours2Declination("15° 11′ 01.0″"), coordinate.SizeQualifier(2.83f), "Algenib"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 43m 00.13s"), coordinate.Hours2Declination("30° 13′ 16.7″"), coordinate.SizeQualifier(2.93f), "Matar, Sad al Matar"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 41m 27.67s"), coordinate.Hours2Declination("10° 49′ 53.0″"), coordinate.SizeQualifier(3.41f), "Homam, Homan, Humam, Al Hammam"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 50m 00.10s"), coordinate.Hours2Declination("24° 36′ 06.1″"), coordinate.SizeQualifier(3.51f), "Sadalbari, Sad al Bari, Sad al Nazi"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 10m 11.82s"), coordinate.Hours2Declination("06° 11′ 52.0″"), coordinate.SizeQualifier(3.52f), "Baham, Biham, Sad al Baham"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 07m 00.47s"), coordinate.Hours2Declination("25° 20′ 42.2″"), coordinate.SizeQualifier(3.77f), "n"));
	con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 46m 31.84s"), coordinate.Hours2Declination("23° 33′ 56.4″"), coordinate.SizeQualifier(3.97f), "Sadalpheretz, Sadalpheris, Sad al Faris"));
//	con.m_List.add( new Star( coordinate.Hours2RightAscension("21h 22m 05.13s"), coordinate.Hours2Declination("19° 48′ 15.7″"), coordinate.SizeQualifier(4.08f), "n"));
//	con.m_List.add( new Star( coordinate.Hours2RightAscension("21h 44m 38.70s"), coordinate.Hours2Declination("25° 38′ 42.0″"), coordinate.SizeQualifier(4.14f), "n"));
//	con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 46m 41.44s"), coordinate.Hours2Declination("12° 10′ 26.7″"), coordinate.SizeQualifier(4.20f), "n"));
//	con.m_List.add( new Star( coordinate.Hours2RightAscension("22h 09m 59.25s"), coordinate.Hours2Declination("33° 10′ 41.8″"), coordinate.SizeQualifier(4.28f), "n"));
//	con.m_List.add( new Star( coordinate.Hours2RightAscension("21h 44m 30.69s"), coordinate.Hours2Declination("17° 21′ 00.2″"), coordinate.SizeQualifier(4.34f), "n"));
//	con.m_List.add( new Star( coordinate.Hours2RightAscension("23h 25m 22.66s"), coordinate.Hours2Declination("23° 24′ 14.4″"), coordinate.SizeQualifier(4.42f), "n"));
//	
	m_List.addAll(con.m_List);
	}
	
	public Array<Star> getInstances() {
		return m_List;
	}
	
}
