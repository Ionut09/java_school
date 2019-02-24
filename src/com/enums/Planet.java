package com.enums;

import java.io.Serializable;
import java.util.stream.Stream;

public enum Planet implements Serializable{  
	MERCURY(3.303e+23, 2.4397e6), 
	VENUS(4.869e+24, 6.0518e6),
	TERRA(4.869e+24, 6.0518e6),
    MARS(4.869e+24, 6.0518e6);
	

    private  double mass;
    private  double radius;
    public static final double G = 6.67300E-11;

    Planet(double mass, double radius) {
        this.mass = mass; 
        this.radius = radius;
    }
    private Planet() {
	}

    double surfaceGravity() {return G * mass / (radius * radius);}
    double weight(double m) {return m * surfaceGravity();}
    
    public static void main(String[] args) {
		System.out.println(MERCURY.surfaceGravity());
		Planet[] values = Planet.values();
		Stream.of(values).forEach(planet -> {
			System.out.println(planet.name() + ": at index: " + planet.ordinal());
		});
		
		//pt a parsa un string intr-un enum
		System.out.println(Planet.valueOf("MERCURY").ordinal());
		
	}
}
