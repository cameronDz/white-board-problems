package org.md.education.problem;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateRecursiveFactorialTest {

	@Test
	public void calculateFactorial_zeroParam_returnOne() {
		Integer expected = 1;
		Integer actual = new RecursiveFactorial(0).calculateFactorial();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateFactorial_oneParam_returnOne() {
		Integer expected = 1;
		Integer actual = new RecursiveFactorial(1).calculateFactorial();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateFactorial_fiveParam_returnOneTwenty() {
		Integer expected = 120;
		Integer actual = new RecursiveFactorial(5).calculateFactorial();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateFactorial_negativeParam_returnNull() {
		Integer expected = null;
		Integer actual = new RecursiveFactorial(-1).calculateFactorial();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateFactorial_nullParam_returnNull() {
		Integer expected = null;
		Integer actual = new RecursiveFactorial(expected).calculateFactorial();
		assertEquals(expected, actual);
	}
}
