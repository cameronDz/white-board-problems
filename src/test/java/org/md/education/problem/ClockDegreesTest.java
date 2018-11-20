package org.md.education.problem;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClockDegreesTest {

	@Test
	public void emptyConstructor_setMinutes_getMinutes() {
		ClockDegrees clockDegrees = new ClockDegrees();
		Integer expected = 3;
		clockDegrees.setMinutes(expected);
		Integer actual = clockDegrees.getMinutes();
		assertEquals(expected, actual);
	}

	@Test
	public void emptyConstructor_setHours_getHours() {
		ClockDegrees clockDegrees = new ClockDegrees();
		Integer expected = 3;
		clockDegrees.setHours(expected);
		Integer actual = clockDegrees.getHours();
		assertEquals(expected, actual);
	}

	@Test
	public void toString_emptyConstructor_getString() {
		String expected = "ClockDegrees [minutes=null, hours=null]";
		String actual = new ClockDegrees().toString();
		assertEquals(expected, actual);
	}

	@Test
	public void hashCode_emptyConstructor_return961() {
		Integer expected = 961;
		Integer actual = new ClockDegrees().hashCode();
		assertEquals(expected, actual);
	}

	@Test
	public void hashCode_nonEmptyConstructor_notReturn961() {
		Integer expected = 961;
		Integer actual = new ClockDegrees(1, 2).hashCode();
		assertNotEquals(expected, actual);
	}

	@Test
	public void equals_sameObject_returnTrue() {
		ClockDegrees clockDegrees = new ClockDegrees();
		Boolean expected = true;
		Boolean actual = clockDegrees.equals(clockDegrees);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_nullObject_returnFalse() {
		ClockDegrees clockDegrees = new ClockDegrees();
		Boolean expected = false;
		Boolean actual = clockDegrees.equals(null);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_diffClassObject_returnFalse() {
		ClockDegrees clockDegrees = new ClockDegrees();
		Object diffClass = new Object();
		Boolean expected = false;
		Boolean actual = clockDegrees.equals(diffClass);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_diffNullHoursObject_returnFalse() {
		ClockDegrees clockDegrees = new ClockDegrees(null, 2);
		ClockDegrees diffClockDegrees = new ClockDegrees(1, 2);
		Boolean expected = false;
		Boolean actual = clockDegrees.equals(diffClockDegrees);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_diffNonNullHoursObject_returnFalse() {
		ClockDegrees clockDegrees = new ClockDegrees(1, 2);
		ClockDegrees diffClockDegrees = new ClockDegrees(null, 2);
		Boolean expected = false;
		Boolean actual = clockDegrees.equals(diffClockDegrees);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_diffNullMinutesObject_returnFalse() {
		ClockDegrees clockDegrees = new ClockDegrees(1, null);
		ClockDegrees diffClockDegrees = new ClockDegrees(1, 2);
		Boolean expected = false;
		Boolean actual = clockDegrees.equals(diffClockDegrees);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_diffNonNullMinutesObject_returnFalse() {
		ClockDegrees clockDegrees = new ClockDegrees(1, 2);
		ClockDegrees diffClockDegrees = new ClockDegrees(1, null);
		Boolean expected = false;
		Boolean actual = clockDegrees.equals(diffClockDegrees);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_equalEmptyObjects_returnTrue() {
		ClockDegrees clockDegrees = new ClockDegrees();
		ClockDegrees diffClockDegrees = new ClockDegrees();
		Boolean expected = true;
		Boolean actual = clockDegrees.equals(diffClockDegrees);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_equalFullObjects_returnTrue() {
		ClockDegrees clockDegrees = new ClockDegrees(1, 2);
		ClockDegrees diffClockDegrees = new ClockDegrees(1, 2);
		Boolean expected = true;
		Boolean actual = clockDegrees.equals(diffClockDegrees);
		assertEquals(expected, actual);
	}

}
