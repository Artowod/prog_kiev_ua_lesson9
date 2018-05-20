package ua.prog.java.lesson9;

public class ManInQueue {
	private String name;

	public ManInQueue() {

	}

	public ManInQueue(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "[" + name + "]";
	}

}
