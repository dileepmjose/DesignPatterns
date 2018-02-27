package com.designpattern.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	
	public Shape getShape(String shapeType) {

		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}

	
	Color getColor(String color) {
		return null;
	}
}