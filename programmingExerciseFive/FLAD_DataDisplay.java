package programmingExerciseFive;

public class FLAD_DataDisplay {

	public void DataDisplayer(char[][] arrayOfWords) {
		String line = "";

		for (int indexOfX = 0; indexOfX <= 6; indexOfX++) {

			for (int indexOfY = 0; indexOfY <= 5; indexOfY++) {

				line = line + Character.toString(arrayOfWords[indexOfX][indexOfY]);
			}
		}
		System.out.print(line);
	}

}