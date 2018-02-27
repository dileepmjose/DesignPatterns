package com.designpattern.abstractfactory;

public class ColorFactory extends AbstractFactory {

	Color getColor(String color) {

		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase("RED")) {
			return new Red();

		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}

		return null;
	}

	public Shape getShape(String shapeType) {
		return null;
	}
}