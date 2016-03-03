package test.com.lac.tut.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lac.tut.mockito.Calculator;
import com.lac.tut.mockito.Rectangle;

@ContextConfiguration(locations = { "classpath:/beans.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class CalculatorTestWithSpringAndMockito {

	@Mock
	Rectangle rectangle;

	@InjectMocks
	@Autowired
	Calculator calculator;

	@Before
	public void create() {
		initMocks(this);// Initialize this mock objects
		when(rectangle.getLength()).thenReturn(10);
		when(rectangle.getBreadth()).thenReturn(40);
	}

	@Test
	public void test() {
		assertEquals(calculator.getArea(), 400);
	}

}
