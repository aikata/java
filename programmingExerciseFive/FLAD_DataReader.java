package programmingExerciseFive;

import java.io.*;
import java.util.*;

public class FLAD_DataReader {

	public List<Character> ReadDataFromFile(String pathToFile) {
		List<Character> listOfLines = new ArrayList<Character>();
		try {
			FileInputStream reader = new FileInputStream(pathToFile);
			char current = 0;
			while (reader.available() > 0) {
				current = (char) reader.read();
				listOfLines.add(current);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listOfLines;
	}
}
