import static org.junit.Assert.*;

import org.junit.Test;

import com.hello.StringCalculator;

public class StringCalculatorTest {

	@Test
	public void testAdd() {
		StringCalculator.add("1,2");
	
	}
	@Test(expected=RuntimeException.class)
	public void testIsNumberLengthGreaterThanTwo()
	{
		StringCalculator.add("1,2,3");
		System.out.println("hello");
		System.out.println("hi");
		System.out.println("hi hello");
	}

}
