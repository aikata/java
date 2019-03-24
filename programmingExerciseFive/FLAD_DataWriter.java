package programmingExerciseFive;

import java.util.*;

public class FLAD_DataWriter {

	public char[][] ArrayWriter(List<Character> listOfLines) {
		char[][] arrayOfWords = new char[7][6];
		for (int indexOfList = 0; indexOfList < listOfLines.size(); indexOfList++) {
			for (int indexOfX = 0; indexOfX <= 5; indexOfX++) {
				for (int indexOfY = 0; indexOfY <= 6; indexOfY++) {

					if (listOfLines.size() > indexOfList) {
						if (listOfLines.get(indexOfList) == (char) 10) {
							arrayOfWords[indexOfY][indexOfX] = '*';
						} else {
							arrayOfWords[indexOfY][indexOfX] = listOfLines.get(indexOfList);
						}
					} else {
						arrayOfWords[indexOfY][indexOfX] = '*';
					}
					if (indexOfList <= 40) {
						indexOfList++;
					} else {
						return arrayOfWords;
					}
				}
			}
		}
		return arrayOfWords;

	}
}