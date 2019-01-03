package org.md.education.problem;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateFizzBuzzTest {

	@Test
	public void toString_emptyConstructor_getString() {
		String expected = "FizzBuzz []";
		String actual = new FizzBuzz().toString();
		assertEquals(expected, actual);
	}

	@Test
	public void printFizzBuzz_nullParameter_returnErrorString() {
		String expected = FizzBuzz.INVALID_NON_POSITIVE_INTEGER;
		String actual = new FizzBuzz().printFizzBuzz(null);
		assertEquals(expected, actual);		
	}

	@Test
	public void printFizzBuzz_zeroParameter_returnErrorString() {
		String expected = FizzBuzz.INVALID_NON_POSITIVE_INTEGER;
		String actual = new FizzBuzz().printFizzBuzz(0);
		assertEquals(expected, actual);		
	}

	@Test
	public void printFizzBuzz_negativeParameter_returnErrorString() {
		String expected = FizzBuzz.INVALID_NON_POSITIVE_INTEGER;
		String actual = new FizzBuzz().printFizzBuzz(-1);
		assertEquals(expected, actual);		
	}

	@Test
	public void printFizzBuzz_oneParameter_returnOne() {
		String expected = "1\n";
		String actual = new FizzBuzz().printFizzBuzz(1);
		assertEquals(expected, actual);		
	}

	@Test
	public void printFizzBuzz_eightteenParameter_returnMultipleLines() {
		String expected = "1\t2\tFizz\t4\tBuzz\tFizz\t7\t8\nFizz\tBuzz\t11\tFizz\t13\t14\tFizzBuzz\t16\n17\tFizz\n";
		String actual = new FizzBuzz().printFizzBuzz(18);
		assertEquals(expected, actual);		
	}
}
