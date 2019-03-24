package programmingExerciseFour;

import java.util.*;

public class PigLatinTranslator {

	public static void main(String[] args) {
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please enter a sentence to be translated: ");
			Translator(keyboard.nextLine());
			keyboard.close();
		} catch (Exception badPigLatin) {
			System.out.println("I'm sorry I don't understand double spaces or other grammatical errors.");
		}
	}

	public static String Translator(String sentenceToTranslate) {
		String translatedOutputSentence = "";
		List<String> translatedWordList = new ArrayList<String>();
		List<String> wordList = GetWordList(sentenceToTranslate);

		for (String tempWord : wordList) {
			translatedWordList.add(TranslateWord(tempWord) + " ");
		}

		for (String translatedWords : translatedWordList) {
			translatedOutputSentence = translatedOutputSentence + translatedWords;
		}
		System.out.println(translatedOutputSentence);

		return translatedOutputSentence;
	}

	public static List<String> GetWordList(String sentenceToTranslate) {
		sentenceToTranslate = sentenceToTranslate + " ";
		int spaceIndex;
		List<String> wordList = new ArrayList<String>();

		for (int wordCounter = 0; wordCounter < sentenceToTranslate.length(); wordCounter++) {
			spaceIndex = sentenceToTranslate.indexOf(" ", wordCounter);
			String tempWord = sentenceToTranslate.substring(wordCounter, spaceIndex);
			wordList.add(tempWord);
			wordCounter = spaceIndex;
		}

		return wordList;
	}

	public static String TranslateWord(String wordToTranslate) {
		String translatedWord = "";
		String firstPartOfTheWord = "";
		String secondPartOfTheWord = "";

		if (VowelIndexFinder(wordToTranslate) == 0) {
			translatedWord = wordToTranslate + "way";
		} else {
			firstPartOfTheWord = wordToTranslate.substring(VowelIndexFinder(wordToTranslate));
			secondPartOfTheWord = wordToTranslate.substring(0, VowelIndexFinder(wordToTranslate));
			translatedWord = firstPartOfTheWord + secondPartOfTheWord + "ay";
		}

		if (translatedWord.indexOf(".") != -1) {
			translatedWord = translatedWord.replace(".", "");
			translatedWord = translatedWord + ".";
		}

		return translatedWord;
	}

	public static int VowelIndexFinder(String wordToBeIndexed) {
		char[] charA = "a".toCharArray();
		char[] charE = "e".toCharArray();
		char[] charI = "i".toCharArray();
		char[] charO = "o".toCharArray();
		char[] charU = "u".toCharArray();
		char[] charY = "y".toCharArray();

		for (int letterCounter = 0; letterCounter < wordToBeIndexed.length(); letterCounter++) {
			if (wordToBeIndexed.toLowerCase().charAt(letterCounter) == charA[0]) {
				return letterCounter;
			} else if (wordToBeIndexed.toLowerCase().charAt(letterCounter) == charE[0]) {
				return letterCounter;
			} else if (wordToBeIndexed.toLowerCase().charAt(letterCounter) == charI[0]) {
				return letterCounter;
			} else if (wordToBeIndexed.toLowerCase().charAt(letterCounter) == charO[0]) {
				return letterCounter;
			} else if (wordToBeIndexed.toLowerCase().charAt(letterCounter) == charU[0]) {
				return letterCounter;
			} else if (wordToBeIndexed.toLowerCase().charAt(letterCounter) == charY[0]) {
				return letterCounter;
			}
		}

		return -1;
	}
}