package programmingExerciseFive;

import java.util.ArrayList;
import java.util.List;

public class FLAD_Manager {

	char[][] arrayOfWords = new char[7][6];
	String pathToFile = "/home/persistence/Desktop/test.txt";
	List<Character> listOfLines = new ArrayList<Character>();

	public static void main(String[] args) {
		FLAD_Manager ManagerReference = new FLAD_Manager();
		ManagerReference.StartProgram();

	}

	public void StartProgram() {
		FLAD_DataReader DataReaderReference = new FLAD_DataReader();
		listOfLines = DataReaderReference.ReadDataFromFile(pathToFile);
		FLAD_DataWriter DataWriterReference = new FLAD_DataWriter();
		arrayOfWords = DataWriterReference.ArrayWriter(listOfLines);
		FLAD_DataDisplay DataDisplayReference = new FLAD_DataDisplay();
		DataDisplayReference.DataDisplayer(arrayOfWords);
	}

}
