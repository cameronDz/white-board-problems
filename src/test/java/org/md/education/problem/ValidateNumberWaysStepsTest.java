package org.md.education.problem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidateNumberWaysStepsTest {

	@Test
	public void calculateways_stairsNull_returnNull() {
		NumberWaysSteps numberWays = new NumberWaysSteps(null, new Integer[] { 1, 2, 3 });
		Integer expected = null;
		Integer actual = numberWays.calculateways();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateways_stairsNegative_returnNull() {
		NumberWaysSteps numberWays = new NumberWaysSteps(-1, new Integer[] { 1, 2, 3 });
		Integer expected = null;
		Integer actual = numberWays.calculateways();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateways_stepsNull_returnNull() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, null);
		Integer expected = null;
		Integer actual = numberWays.calculateways();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateways_stepsEmpty_returnNull() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, new Integer[] {});
		Integer expected = null;
		Integer actual = numberWays.calculateways();
		assertEquals(expected, actual);
	}

	@Test
	public void stepsHasAllValidValues_stepsHasNull_returnNull() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, new Integer[] { 1, 2, null });
		Integer expected = null;
		Integer actual = numberWays.calculateways();
		assertEquals(expected, actual);
	}

	@Test
	public void stepsHasAllValidValues_stepsHasNegative_returnNull() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, new Integer[] { 1, 2, -1 });
		Integer expected = null;
		Integer actual = numberWays.calculateways();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateways_validParams_return1() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, new Integer[] { 1, 2, 3 });
		Integer expected = 1;
		Integer actual = numberWays.calculateways();
		assertEquals(expected, actual);
	}
}
