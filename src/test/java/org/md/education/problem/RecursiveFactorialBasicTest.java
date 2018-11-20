package org.md.education.problem;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursiveFactorialBasicTest {

	@Test
	public void emptyConstructor_setNumber_getNumber() {
		RecursiveFactorial recursiveFactorial = new RecursiveFactorial();
		Integer expected = 3;
		recursiveFactorial.setNumber(expected);
		Integer actual = recursiveFactorial.getNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void toString_emptyConstructor_getString() {
		String expected = "RecursiveFactorial [number=null]";
		String actual = new RecursiveFactorial().toString();
		assertEquals(expected, actual);
	}

	@Test
	public void hashCode_emptyObject_return31() {
		Integer expected = 31;
		Integer actual = new RecursiveFactorial().hashCode();
		assertEquals(expected, actual);
	}

	@Test
	public void hashCode_notEmptyObject_notReturn31() {
		Integer expected = 31;
		Integer actual = new RecursiveFactorial(4).hashCode();
		assertNotEquals(expected, actual);
	}

	@Test
	public void equals_sameObject_returnTrue() {
		RecursiveFactorial recursiveFactorial = new RecursiveFactorial();
		Boolean expected = true;
		Boolean actual = recursiveFactorial.equals(recursiveFactorial);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_nullObject_returnFalse() {
		RecursiveFactorial recursiveFactorial = new RecursiveFactorial();
		Boolean expected = false;
		Boolean actual = recursiveFactorial.equals(null);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_diffClass_returnFalse() {
		RecursiveFactorial recursiveFactorial = new RecursiveFactorial();
		Object diffClass = new Object();
		Boolean expected = false;
		Boolean actual = recursiveFactorial.equals(diffClass);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_nullNumberDiffObject_returnFalse() {
		RecursiveFactorial recursiveFactorial = new RecursiveFactorial();
		RecursiveFactorial diffRecursiveFactorial = new RecursiveFactorial(5);
		Boolean expected = false;
		Boolean actual = recursiveFactorial.equals(diffRecursiveFactorial);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_nonNullNumberDiffObject_returnFalse() {
		RecursiveFactorial recursiveFactorial = new RecursiveFactorial(5);
		RecursiveFactorial diffRecursiveFactorial = new RecursiveFactorial();
		Boolean expected = false;
		Boolean actual = recursiveFactorial.equals(diffRecursiveFactorial);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_sameEmptyObjects_returnTrue() {
		RecursiveFactorial recursiveFactorial = new RecursiveFactorial();
		RecursiveFactorial diffRecursiveFactorial = new RecursiveFactorial();
		Boolean expected = true;
		Boolean actual = recursiveFactorial.equals(diffRecursiveFactorial);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_sameFullObjects_returnTrue() {
		RecursiveFactorial recursiveFactorial = new RecursiveFactorial(4);
		RecursiveFactorial diffRecursiveFactorial = new RecursiveFactorial(4);
		Boolean expected = true;
		Boolean actual = recursiveFactorial.equals(diffRecursiveFactorial);
		assertEquals(expected, actual);
	}

}
