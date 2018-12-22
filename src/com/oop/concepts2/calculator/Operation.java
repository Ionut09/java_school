package com.oop.concepts2.calculator;

import java.io.Serializable;

/**
 * Am transformat Operation din clasa abstracta on interfata
 * @author ionut.spalatelu
 *
 */
public interface Operation extends Serializable, Cloneable{
	//public final int a = 10; 
	//public si final sunt default pt variabile de clasa
	
	int a = 10;

//	public abstract void calculate(double a, double b);
//	
//	public abstract boolean match(String operator);
//	pt ca public si abstract sunt default intr-o interfata, le putem omite
	 void calculate(double a, double b);
	
	 boolean match(String operator);
	
}
