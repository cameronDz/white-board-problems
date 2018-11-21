package org.md.education.problem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidateNumberWaysStepsTest {

	@Test
	public void calculateWays_stairsNull_returnNull() {
		NumberWaysSteps numberWays = new NumberWaysSteps(null, new Integer[] { 1, 2, 3 });
		Integer expected = null;
		Integer actual = numberWays.calculateWays();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateWays_stairsNegative_returnNull() {
		NumberWaysSteps numberWays = new NumberWaysSteps(-1, new Integer[] { 1, 2, 3 });
		Integer expected = null;
		Integer actual = numberWays.calculateWays();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateWays_stepsNull_returnNull() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, null);
		Integer expected = null;
		Integer actual = numberWays.calculateWays();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateWays_stepsEmpty_returnNull() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, new Integer[] {});
		Integer expected = null;
		Integer actual = numberWays.calculateWays();
		assertEquals(expected, actual);
	}

	@Test
	public void stepsHasAllValidValues_stepsHasNull_returnNull() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, new Integer[] { 1, 2, null });
		Integer expected = null;
		Integer actual = numberWays.calculateWays();
		assertEquals(expected, actual);
	}

	@Test
	public void stepsHasAllValidValues_stepsHasNegative_returnNull() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, new Integer[] { 1, 2, -1 });
		Integer expected = null;
		Integer actual = numberWays.calculateWays();
		assertEquals(expected, actual);
	}

	@Test
	public void recursivelyCalculateWays_validParams_return0() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, new Integer[] { 2, 3 });
		Integer expected = 0;
		Integer actual = numberWays.calculateWays();
		assertEquals(expected, actual);
	}

	@Test
	public void recursivelyCalculateWays_validParams_return1() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, new Integer[] { 1, 2, 3 });
		Integer expected = 1;
		Integer actual = numberWays.calculateWays();
		assertEquals(expected, actual);
	}

	@Test
	public void recursivelyCalculateWays_validParams_return4() {
		NumberWaysSteps numberWays = new NumberWaysSteps(3, new Integer[] { 1, 2, 3 });
		Integer expected = 4;
		Integer actual = numberWays.calculateWays();
		assertEquals(expected, actual);
	}

	@Test
	public void recursivelyCalculateWays_validParams_return3() {
		NumberWaysSteps numberWays = new NumberWaysSteps(3, new Integer[] { 1, 2 });
		Integer expected = 3;
		Integer actual = numberWays.calculateWays();
		assertEquals(expected, actual);
	}

	@Test
	public void recursivelyCalculateWays_validParams_return26() {
		NumberWaysSteps numberWays = new NumberWaysSteps(7, new Integer[] { 1, 2, 5 });
		Integer expected = 26;
		Integer actual = numberWays.calculateWays();
		assertEquals(expected, actual);

	}
}
