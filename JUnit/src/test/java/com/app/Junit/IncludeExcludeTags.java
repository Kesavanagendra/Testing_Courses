package com.app.Junit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;

@IncludeTags("development")
public class IncludeExcludeTags {

	@Tag("development")
	@Test
	public void devTest1() {
		System.out.println("Test case development 1");
	}
	
	@Tag("development")
	@Test
	public void devTest2() {
		System.out.println("Test case development 2");
	}
	
	@Tag("QA")
	@Test
	public void qaTest1() {
		System.out.println("Test case QA 1");
	}
	
	@Tag("QA")
	@Test
	public void qaTest2() {
		System.out.println("Test case QA 2");
	}
	
	@Tag("Production")
	@Test
	public void production1() {
		System.out.println("Test case production 1");
	}
	
	@Tag("Production")
	@Test
	public void production2() {
		System.out.println("Test case production 2");
	}
}
