package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
		String result = junit.AddStrings("Hello", " World");
		assertEquals("Hello World",result);
	}

}
