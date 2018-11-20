package org.md.education;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void main_static_run() {
		App.main("");
	}

	@Test
	public void constructor_empty_run() {
		App app = new App();
		String expected = "App";
		String actual = app.getClass().getSimpleName();
		assertEquals(expected, actual);
	}
}
