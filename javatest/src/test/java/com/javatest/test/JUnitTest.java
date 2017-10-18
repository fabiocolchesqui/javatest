package com.javatest.test;

import static com.javatest.utils.CalculationUtils.add;
import static com.javatest.utils.CalculationUtils.sumValues;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class JUnitTest {

	@Test
	public void testAdd() {
		assertEquals(add(0, 0), (0 + 0));
		assertEquals(add(10, 0), (10 + 0));
		assertEquals(add(500, 300), (300 + 500));
	}
	
	@Test
	public void testAddMethod() {
		assertEquals(add(-10, 10), (-10 + 10));
		assertEquals(add(0, 800), (0 + 800));
		assertEquals(add(Integer.MAX_VALUE, 110), (Integer.MAX_VALUE + 110));
	}

	@Test
	public void testSumValues() {
		assertEquals(sumValues(2, 3), sumValues(3, 2));
	}

	@Test(expected = AssertionError.class)
	public void testSumValuesError() {
		assertEquals(sumValues(-100, 3), sumValues(3, 2));
	}

	@Test(expected = NumberFormatException.class)
	public void testSumValuesParse() {
		assertEquals(sumValues(Integer.parseInt("a"), 3), sumValues(3, 2));
		Assert.fail("NumberFormatException");
	}
	
	@Test(expected = NullPointerException.class)
	public void testSumValuesNull() {
		assertEquals(null, sumValues(3, 2));
	}

}
