package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * this class is used to read the symptom.txt file
 * 
 * @author Silvio
 *
 */
public class ReadSymptomDataFromFile {

	List<String> list = new ArrayList<>();

	File file = new File("Project02Eclipse//symptoms.txt");

	/**
	 * extraction of the symptoms.txt file and conversion to ArrayList using the
	 * While loop in the "readSymptoms method"
	 * 
	 * @return an Arraylist with all the lines of the file
	 */

	List<String> readSymptoms() {

		try {

			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);

			String line = br.readLine();

			while (line != null) {
				list.add(line);
				line = br.readLine();

			}

			System.out.println(list);

			reader.close();
			br.close();

		}

		catch (

		FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Unable to read File");
			e.printStackTrace();
		}

		return list;
	}

}
