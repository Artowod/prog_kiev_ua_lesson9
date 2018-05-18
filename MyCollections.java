package ua.prog.java.lesson9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MyCollections {
	private String filePath;
	private String fileContent = "";
	private Set<Character> charsSet = new HashSet<>();
	private TreeSet<Char> charsObjectsSet;

	public MyCollections() {

	}

	public MyCollections(String filePath) {
		super();
		this.filePath = filePath;
	}
	
	public String getFilePath() {
		return filePath;
	}

	public String getFileContent() {
		return fileContent;
	}

	public Set<Character> getCharsSet() {
		return charsSet;
	}

	public TreeSet<Char> getCharsObjectsSet() {
		return charsObjectsSet;
	}

	private void readFile() {
		fileContent = "";
		try (BufferedReader bufR = new BufferedReader(new FileReader(filePath))) {
			String eachFileLine = "";
			for (; (eachFileLine = bufR.readLine()) != null;) {
				fileContent += eachFileLine;
			}
		} catch (IOException ex) {
			System.out.println(ex.getStackTrace());
		}

	}

	private List<Character> convertFileContentToList() {
		List<Character> charsCollection = new ArrayList<>();
		for (Character eachChar : fileContent.toCharArray()) {
			charsCollection.add(eachChar);
		}

		return charsCollection;
	}

	private void createUniqueCharsSet(List<Character> fileContentList) {
		charsSet.addAll(fileContentList);
	}

	public void countLettersRepetitionFrequency() {
		readFile();

		List<Character> fileContentList = convertFileContentToList();

		createUniqueCharsSet(fileContentList);

		charsObjectsSet = new TreeSet<Char>(new CharComparator());

		Iterator<Character> iterator = charsSet.iterator();

		System.out.println("\nNot sorted list Of <Character + Quantity> dependencies:");
		while (iterator.hasNext()) {
			Character nextElement = iterator.next();
			int charFrequency = Collections.frequency(fileContentList, nextElement);
			System.out.println("Character: " + nextElement + "; Quantity: " + charFrequency);

			charsObjectsSet.add(new Char(nextElement, charFrequency));
		}

		System.out.println("\nSorted array Of <Char> Objects:");
		Iterator<Char> objectsIterator = charsObjectsSet.iterator();
		while (objectsIterator.hasNext()) {
			Char nextObject = objectsIterator.next();
			System.out.println(nextObject.toString());
		}
	}
}
