package org.md.education.problem;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateClockDegreesTest {

	@Test
	public void calculateHourHandDegree_0830param_return255() {
		Integer expected = 255;
		Integer actual = new ClockDegrees(8, 30).calculateHourHandDegree();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateHourHandDegree_1215param_return15() {
		Integer expected = 15;
		Integer actual = new ClockDegrees(12, 30).calculateHourHandDegree();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateHourHandDegree_350param_return115() {
		Integer expected = 115;
		Integer actual = new ClockDegrees(3, 50).calculateHourHandDegree();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateHourHandDegree_negativeMinute_returnNull() {
		Integer expected = null;
		Integer actual = new ClockDegrees(3, -50).calculateHourHandDegree();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateHourHandDegree_tooLargeMinute_returnNull() {
		Integer expected = null;
		Integer actual = new ClockDegrees(3, 150).calculateHourHandDegree();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateHourHandDegree_nullMinute_returnNull() {
		Integer expected = null;
		Integer actual = new ClockDegrees(3, null).calculateHourHandDegree();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateHourHandDegree_negativeHour_returnNull() {
		Integer expected = null;
		Integer actual = new ClockDegrees(-3, 50).calculateHourHandDegree();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateHourHandDegree_tooLargeHour_returnNull() {
		Integer expected = null;
		Integer actual = new ClockDegrees(33, 50).calculateHourHandDegree();
		assertEquals(expected, actual);
	}

	@Test
	public void calculateHourHandDegree_nullHour_returnNull() {
		Integer expected = null;
		Integer actual = new ClockDegrees(null, 50).calculateHourHandDegree();
		assertEquals(expected, actual);
	}
}
