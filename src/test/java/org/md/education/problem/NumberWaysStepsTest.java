package org.md.education.problem;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class NumberWaysStepsTest {

	@Test
	public void emptyConstructor_setStair_returnStair() {
		NumberWaysSteps numberWays = new NumberWaysSteps();
		Integer expected = 961;
		numberWays.setStair(expected);
		Integer actual = numberWays.getStair();
		assertEquals(expected, actual);
	}

	@Test
	public void emptyConstructor_setSteps_returnSteps() {
		NumberWaysSteps numberWays = new NumberWaysSteps();
		Integer[] expected = new Integer[] { 961, 222 };
		numberWays.setSteps(expected);
		Integer[] actual = numberWays.getSteps();
		assertArrayEquals(expected, actual);
	}

	@Test
	public void toString_emptyConstructor_returnString() {
		NumberWaysSteps numberWays = new NumberWaysSteps();
		String expected = "NumberWaysSteps [stair=null, steps=null]";
		String actual = numberWays.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void toString_fullConstructor_returnString() {
		Integer[] steps = new Integer[] { 961, 222 };
		Integer stairs = 23;
		NumberWaysSteps numberWays = new NumberWaysSteps(stairs, steps);
		String expected = "NumberWaysSteps [stair=23, steps=[961, 222]]";
		String actual = numberWays.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void hashCode_emptyConstructor_return961() {
		NumberWaysSteps numberWays = new NumberWaysSteps();
		Integer expected = 961;
		Integer actual = numberWays.hashCode();
		assertEquals(expected, actual);
	}

	@Test
	public void hashCode_fullConstructor_notReturn961() {
		Integer[] steps = new Integer[] { 961, 222 };
		Integer stairs = 23;
		NumberWaysSteps numberWays = new NumberWaysSteps(stairs, steps);
		Integer expected = 961;
		Integer actual = numberWays.hashCode();
		assertNotEquals(expected, actual);
	}

	@Test
	public void equals_sameObject_returnTrue() {
		NumberWaysSteps numberWays = new NumberWaysSteps();
		Boolean expected = true;
		Boolean actual = numberWays.equals(numberWays);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_nullObject_returnFalse() {
		NumberWaysSteps numberWays = new NumberWaysSteps();
		Boolean expected = false;
		Boolean actual = numberWays.equals(null);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_notSameClassObject_returnFalse() {
		NumberWaysSteps numberWays = new NumberWaysSteps();
		Boolean expected = false;
		Boolean actual = numberWays.equals(new Object());
		assertEquals(expected, actual);
	}

	@Test
	public void equals_nullStairDiffObject_returnFalse() {
		NumberWaysSteps numberWays = new NumberWaysSteps(null, new Integer[] { 3 });
		NumberWaysSteps diffNumberWays = new NumberWaysSteps(1, new Integer[] { 3 });
		Boolean expected = false;
		Boolean actual = numberWays.equals(diffNumberWays);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_diffStairValue_returnFalse() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, new Integer[] { 3 });
		NumberWaysSteps diffNumberWays = new NumberWaysSteps(null, new Integer[] { 3 });
		Boolean expected = false;
		Boolean actual = numberWays.equals(diffNumberWays);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_nullStepsDiffObject_returnFalse() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, null);
		NumberWaysSteps diffNumberWays = new NumberWaysSteps(1, new Integer[] { 3 });
		Boolean expected = false;
		Boolean actual = numberWays.equals(diffNumberWays);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_diffStepsValue_returnFalse() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, new Integer[] { 3 });
		NumberWaysSteps diffNumberWays = new NumberWaysSteps(1, null);
		Boolean expected = false;
		Boolean actual = numberWays.equals(diffNumberWays);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_emptyObject_returnTrue() {
		NumberWaysSteps numberWays = new NumberWaysSteps();
		NumberWaysSteps diffNumberWays = new NumberWaysSteps();
		Boolean expected = true;
		Boolean actual = numberWays.equals(diffNumberWays);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_fullObject_returnTrue() {
		NumberWaysSteps numberWays = new NumberWaysSteps(1, new Integer[] { 3 });
		NumberWaysSteps diffNumberWays = new NumberWaysSteps(1, new Integer[] { 3 });
		Boolean expected = true;
		Boolean actual = numberWays.equals(diffNumberWays);
		assertEquals(expected, actual);
	}
}
