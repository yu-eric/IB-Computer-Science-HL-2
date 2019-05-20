package chapter15;

import chapter12.PhoneNumber;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This class hosts a method to find all possible letter combinations of a phone pin, and sorts them for only real words
 */
public class MapTheWords {

	/**
	 * Uses the PhonePin class to generate all possible permutations, then compares the strings to a dictionary of known words
	 * @param num the phone number casted into a string
	 * @return array containing only real words
	 */
	public ArrayList<String> getWords(String num) {
		chapter12.PhoneNumber phone = new PhoneNumber();
		ArrayList<String> allWordsNonReal = phone.getAllPossibleStrings(num);
		ArrayList<String> realWords = new ArrayList<>();
		for(int i = 0; i < allWordsNonReal.size(); i++) {
			try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Eric Yu\\IdeaProjects\\IB-Computer-Science-HL-2\\src\\chapter15\\words.txt"))) {
				boolean wordFound = false;

				String word;
				while ((word = br.readLine()) != null) {
					if (word.equals(allWordsNonReal.get(i))) {
						wordFound = true;
					}
				}
				if (wordFound) {
					realWords.add(allWordsNonReal.get(i));
				}


			} catch (FileNotFoundException e) {
				System.out.println("Sorry, the dictionary file was not found.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return realWords;
	}

}
