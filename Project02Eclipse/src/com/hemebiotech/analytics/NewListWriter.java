
package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;

/** NewListWriter Class allow you to write the treeMap in new file
 *
 * @author Silvio
 *
 */
public class NewListWriter {
	
	
	/**
	 * Create a file result.out with the content of the TreeMap
	 */
	void writeNewSymptomsFile() {
	
		try {
		File newList = new File("Project02Eclipse//result.out");
		FileWriter writer = new FileWriter(newList);
		BufferedWriter bw = new BufferedWriter(writer);
		AnalyticsCounter countFile = new AnalyticsCounter();
		
			for (Entry<String, Integer> loopWrite : countFile.countSymptoms().entrySet()) {
				
				bw.write("=> " +  loopWrite.getKey() + " = " + loopWrite.getValue()); 
				bw.newLine();
			}
		
			bw.close();
			writer.close();
		}
		 

		catch (IOException e) {
			System.out.println("Unable to write the File");
			e.printStackTrace();
		}
	}
	
	

}