package com.lac.tut.mockito.main;

import com.lac.tut.mockito.Calculator;
import com.lac.tut.mockito.Rectangle;

public class MainWithOutSpring {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setBreadth(20);
		Calculator c = new Calculator();
		c.setRectangle(r);
		System.out.println(c.getArea());
	}
}
