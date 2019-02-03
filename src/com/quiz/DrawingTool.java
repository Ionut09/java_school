package com.quiz;

import java.util.ArrayList;
import java.util.List;

public class DrawingTool {

	private List<Shape> shapes = new ArrayList<>();

	public void addShape(Shape shape) {
		if (shapes.contains(shape)) {
			System.out.println("This shape has been already added to the tool!");
			return;
		}
		shapes.add(shape);
	}

	public double computeAreaForAllShapes() {
		double area = 0;
		for (Shape shape : shapes) {
			area += shape.computeArea();
		}
		return area;
	}

	public double computePerimeterForAllShapes() {
		double perimeter = 0;
		for (Shape shape : shapes) {
			perimeter += shape.computePerimeter();
		}
		return perimeter;
	}

	public double computeAreaForShape(Shape shape) {
		if (shapes.contains(shape)) {
			return shape.computeArea();
		}
		System.out.println("This shape is not present in the drawing tool, please add it first!");
		return 0; //should throw an exception
	}
	
	public double computePerimeterForShape(Shape shape) {
		if (shapes.contains(shape)) {
			return shape.computePerimeter();
		}
		System.out.println("This shape is not present in the drawing tool, please add it first!");
		return 0;
	}
	
	public double computeAreaForShapeAtIndex(int index) {
		return shapes.get(index).computeArea();
	}
	
	public double computePerimeterForShapeAtIndex(int index) {
		return shapes.get(index).computePerimeter();
	}

	public List<Shape> getShapes() {
		return shapes;
	}

	public void setShapes(List<Shape> shapes) {
		this.shapes = shapes;
	}

}
