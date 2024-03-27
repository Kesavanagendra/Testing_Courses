package com.app.Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsJunitDemo {

	@Test
	public void testAssertion() throws InterruptedException {
		
		String expected = new String("abc");
		String actual = new String("abc");
		
		int val1 = 20;
		int val2 = 30;
		
		String str3 = "JUnit";
		
		String str4 = null;
		
		String s1 = "abc";
		String s2 = "abc";
		
		String s11 = "abc";
		String s22 = "abcd";
		
		String arr1[] = {"One", "Two", "Three"};
		String arr2[] = {"One", "Two", "Three"};
		
		
		Assertions.assertEquals(expected, actual);
		
		Assertions.assertTrue(val1<val2);
		
		Assertions.assertNotNull(str3);
		
		Assertions.assertNull(str4);
		
		Assertions.assertSame(s1, s2);   // It will check the value as well as address of variable.
		
		Assertions.assertNotSame(s11, s22);   // It will check the value as well as address of variable.
		
		Assertions.assertArrayEquals(arr1, arr2);
		
	
		
	}
}
