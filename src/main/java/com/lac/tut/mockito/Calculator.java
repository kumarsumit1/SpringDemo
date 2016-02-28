package com.lac.tut.mockito;

public class Calculator {
	private Rectangle rectangle;

	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	public int getArea() {
		return rectangle.getLength() * rectangle.getBreadth();
	}

}
