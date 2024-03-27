package com.app.Elearning;

import java.util.HashMap;
import java.util.Map;

public class CourseSearch {

	private Map<String, Integer> getCourseData() {
		
		Map<String,Integer> cob = new HashMap<>();
		
		cob.put("Selenium", 50);
		cob.put("TestNG", 40);
		cob.put("JUnit", 45);
		cob.put("POM", 35);
		
		return cob;
	}

	public int getCourse(String course) {
		
		Map<String,Integer> cob1 = new HashMap<>();
		int count =0;
		cob1 = getCourseData();
		
		if(cob1.isEmpty())
		{
			throw new NullPointerException("Course name cannot be empty");
		}
		if(!cob1.containsKey(course))
		{
			throw new NullPointerException("Course name doesnot exist");
		}
		else 
		{
			
			count = cob1.get(course);
		}
		return count;
			
		
	}
}
