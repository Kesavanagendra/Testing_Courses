package com.app.Elearning;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCourseSearch {

	@Test
	public void findCourse() {
		
		CourseSearch cs = new CourseSearch();
		
		String course = "Selenium";
		
		int expectedpractices = 50;
		
		int count = cs.getCourse(course);
		System.out.println(count);
		
		Assert.assertEquals(count, expectedpractices);
	}
	
	
	@Test
	public void findCourseEmptyInput()
	{
		try
		{
			
			String course = "";
			int expectedpractices = 0;
			
			CourseSearch cs = new CourseSearch();
					
			int count =  cs.getCourse(course);
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Course name cannot be empty");
			
		}		
	}
	
	
	@Test
	public void findCourseInvalidInput()
	{
		try
		{
			String course = "Hindi";
			int expectedpractices = 700000;
			
			CourseSearch cs = new CourseSearch();
			
			int count = cs.getCourse(course);
		}
		
		
		catch(Exception e1)
		{
			System.out.println("Course name doesnot exisit in the list");
			e1.getMessage();
		}
	}
	
}
