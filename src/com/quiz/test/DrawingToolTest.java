package com.quiz.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.quiz.*;

public class DrawingToolTest {

	private DrawingTool drawingTool = new DrawingTool();

	@Before //tineti cont ca @Before se executa inainte de fiecare test case (metoda anotata cu @Test)
	public void setUp() {
		drawingTool.addShape(new Triangle(4.7));
		drawingTool.addShape(new Triangle(4.5));
		drawingTool.addShape(new Square(4));
		drawingTool.addShape(new Square(3.5));
		drawingTool.addShape(new Circle(3.5));
		drawingTool.addShape(new Circle(6.6));
		drawingTool.addShape(new Rectangle(4.2, 2.2));
		drawingTool.addShape(new Rectangle(4.2, 3));
	}

	@Test
	public void addShapeTest() {
		DrawingTool tool = new DrawingTool();
		tool.addShape(new Circle(3.5));
		tool.addShape(new Circle(3.5));
		tool.addShape(new Circle(3.5));
		tool.addShape(new Circle(3.5));
		// tool-ul trebuie sa aiba un singur shape
		assertTrue(tool.getShapes().size() == 1);
	}

	@Test
	public void computeAreaForAllShapesTest() {
		assertEquals(243.75, drawingTool.computeAreaForAllShapes(), 0.01);
	}

	@Test
	public void computePerimeterForAllShapesTest() {
		assertEquals(148.26, drawingTool.computePerimeterForAllShapes(), 0.01);
	}

	@Test
	public void computeAreaForShapeTest() {
		Square square = new Square(4);
		assertEquals(16, drawingTool.computeAreaForShape(square), 0.1);
	}

	@Test
	public void computePerimeterShapeTest() {
		Square square = new Square(3.5);
		assertEquals(14, drawingTool.computePerimeterForShape(square), 0.1);
	}

}
