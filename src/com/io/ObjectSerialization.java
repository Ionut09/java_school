package com.io;

import java.io.*;

import jdk.nashorn.internal.parser.JSONParser;

public class ObjectSerialization {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("gica.ser"));
		Elev gica = new Elev("gica", 23, "F");
		Elev florin = new Elev("gica", 25, "M");
		objectOutputStream.writeObject(gica);
		objectOutputStream.writeObject(florin);
	
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("gica.ser"));
		Elev gicaReloaded = (Elev) objectInputStream.readObject();
		Elev florinReloaded = (Elev) objectInputStream.readObject();
		System.out.println(gicaReloaded.toJson()+"\n"+florinReloaded.toJson());
		
		//putem specifica marimea bufferului
		BufferedReader reader = new BufferedReader(new FileReader("elev_in.txt"), 8 * 1024);
		BufferedWriter writer = new BufferedWriter(new FileWriter("elev_out.txt", true));
		writer.write(gica.toJson());
		writer.newLine();
		writer.flush();
	}
}
