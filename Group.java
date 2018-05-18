package ua.prog.java.lesson9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Group implements Serializable {
	private static final long serialVersionUID = 1L;
	private int maxGroupSize = 20;
	private String name;
	private List<Student> studentsGroup = new ArrayList<Student>();
	private String groupVisualisation;

	public Group(String name) {
		super();
		this.name = name;
	}

	public Group() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private void convertGroupToNiceString() {
		groupVisualisation = "";
		for (Student st : studentsGroup) {
			groupVisualisation += st.toString() + "\n";
		}
	}

	private Boolean isStudentAlreadyIn(Student checkedStudent) {
		if (studentsGroup.contains(checkedStudent)) {
			return true;
		}
		return false;
	}

	public void addStudent(Student newStudent) {
		if (isStudentAlreadyIn(newStudent)) {
			System.out.println("Student " + newStudent.toString() + " is in the group already.");
			return;
		}
		if (studentsGroup.size() == maxGroupSize) {
			System.out.println("Student has not been added because the current group is fullfilled.");
			return;
		}
		studentsGroup.add(newStudent);
	}

	@Override
	public String toString() {
		convertGroupToNiceString();
		return "\nGroup [name=" + name + "; size=" + studentsGroup.size() + " students]:\n" + groupVisualisation;
	}

}
