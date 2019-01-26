package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.exercises.matrice.MatrixEngine;

public class MatrixEngineTest {
	private MatrixEngine engine = new MatrixEngine();
	
//	@Before
//	public void setUp() {
//		engine.initMatrice();
//	}
	
	@Test
	public void initMatriceTest() {
		engine.initMatrice();
		assertEquals(engine.getMatrice()[1][2], 3);
	}
	
	@Test
	public void maxDiagPrincipalaTest() {
		engine.initMatrice();
		assertEquals(4, engine.maxDiagPrincipala());
	}
	
}
