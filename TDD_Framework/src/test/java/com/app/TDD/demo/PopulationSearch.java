package com.app.TDD.demo;

import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {

	private Map<String, Integer> getPopulationData() {
		
		Map<String,Integer> populationMap = new HashMap<>();
		
		populationMap.put("Bangalore", 1000000);
		populationMap.put("NewDelhi", 2500000);
		populationMap.put("Mumbai", 2000000);
		populationMap.put("Pune", 500000);
		
		return populationMap;
	}

	public int getPopulation(String city) {
		
		Map<String,Integer> populationMap1 = new HashMap<>();
		int count =0;
		
		if(city.isEmpty())
		{
			throw new NullPointerException("City name cannot be empty");
		}
		if(!populationMap1.containsKey(city))
		{
			throw new NullPointerException("City name doesnot exist");
		}
		else 
		{
			populationMap1 = getPopulationData();
			count = populationMap1.get(city);
		}
		return count;
			
		
	}
}
