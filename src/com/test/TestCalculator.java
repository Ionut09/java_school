package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.exercises.CalculatorHomework;

public class TestCalculator {

	private CalculatorHomework calc;

	@Before
	public void setUp() {
		calc = new CalculatorHomework();
	}

	@Test
	public void calculateTestSum() {
		String operator = "+";
		double a=5,b=4;
		double result = calc.calculate(a, b, operator);
		assertEquals(9, result, 0.0);
	}

	@Test
	public void calculateTestDiv() {
		String operator = "/";
		double a=7,b=3;
		double result = calc.calculate(a, b, operator);
		//assertTrue(result == 2.333333); BAD
		assertEquals(2.33, result, 0.06);
	}

	@Test
	public void calculateTestMultiply() {
		String operator = "*";
		double a=5,b=4;
		double result = calc.calculate(a, b, operator);
		assertEquals(20, result, 0);
	}

	@Test
	public void calculateTestDif() {
		String operator = "-";
		double a=5,b=4;
		double result = calc.calculate(a, b, operator);
		assertEquals(1, result, 0.0);
	}

}
