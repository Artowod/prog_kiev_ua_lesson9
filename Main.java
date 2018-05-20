package ua.prog.java.lesson9;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void createList() {
		List<String> newList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			newList.add("Element " + i);
		}

		System.out.println(newList);

		newList.remove(0);
		newList.remove(0);
		newList.remove(newList.size() - 1);

		System.out.println(newList);

	}

	public static void main(String[] args) {

		/* task 1 */
		System.out.println("\nTask num 1:");
		createList();

		/* task 2 */
		System.out.println("\nTask num 2:");
		Group groupOne = new Group("IA 62");
		groupOne.addStudent(new Student(31, "V", "P", "male"));
		groupOne.addStudent(new Student(21, "L", "S", "female"));

		System.out.println(groupOne.toString());

		/* task 3 */
		System.out.println("\nTask num 3:");
		MyCollections instanceMyCollections = new MyCollections("C:/JAVA/SourceFolder/lesson9_task3.txt");
		instanceMyCollections.countLettersRepetitionFrequency();

		/* task 4 */
		System.out.println("\nTask num 4:");
		DoubleColaQueue colaQueue = new DoubleColaQueue();
		colaQueue.drinkCola(2);

	}
}
