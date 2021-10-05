package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;


/**
 * CLASS allows you to count and classify the data in the list
 * @author Silvio
 *
 */


public class AnalyticsCounter {

	Map<String, Integer> sortList = new TreeMap<String, Integer>();
	
	
	
/**countSymptoms method allow you to count occurrences, remove duplicates and sort alphabetically
 * 
 * @return a TreeMap with occurences count
 */
	Map<String, Integer> countSymptoms(){
		
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile();
		
		for (String list : read.readSymptoms()) {
			
			if (sortList.containsKey(list)) {
				
				sortList.replace(list, sortList.get(list) + 1);
			}
			
			else {
				sortList.put(list, 1);
				
			}
			
		}
		
		
		System.out.println(sortList);
		
		return sortList;
		

}

}

