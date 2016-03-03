package test.com.lac.tut.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.lac.tut.mockito.Calculator;
import com.lac.tut.mockito.Rectangle;

public class CalculatorTestWithMockito {

	@Mock
	Rectangle rectangle;

	@Before
	public void create() {
		initMocks(this);// Initialize this mock objects
		when(rectangle.getLength()).thenReturn(10);
		when(rectangle.getBreadth()).thenReturn(20);
	}

	@Test
	public void test() {
		Calculator c= new Calculator();
		c.setRectangle(rectangle);
		assertEquals(c.getArea(),200);
	}

}
