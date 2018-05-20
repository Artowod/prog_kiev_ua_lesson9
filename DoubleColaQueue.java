package ua.prog.java.lesson9;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleColaQueue {
	private String[] menWhoLikeCola = new String[] { "Sheldon", "Leonardo", "Volovits", "Kutrapalli", "Penny" };
	private ManInQueue man;
	private Deque<ManInQueue> queueForCola = new ArrayDeque<>();

	public DoubleColaQueue() {

	}

	public String[] getMenWhoLikeCola() {
		return menWhoLikeCola;
	}

	public void setMenWhoLikeCola(String[] menWhoLikeCola) {
		this.menWhoLikeCola = menWhoLikeCola;
	}

	public Deque<ManInQueue> getQueueForCola() {
		return queueForCola;
	}

	private void setInitialQueue() {
		for (String name : menWhoLikeCola) {
			man = new ManInQueue(name);
			queueForCola.offerLast(man);
		}
	}

	public void drinkCola(int colaGlassesDrunk) {
		setInitialQueue();
		System.out.println(queueForCola.toString());
		System.out.println(colaGlassesDrunk + " double Cola`s are ready to be drunk: ");

		for (int i = 0; i < colaGlassesDrunk; i++) {
			ManInQueue manInFrontOfAutomat = queueForCola.pollFirst();
			queueForCola.offerLast(manInFrontOfAutomat);
			queueForCola.offerLast(manInFrontOfAutomat);
		}
		System.out.println(queueForCola.toString());
	}

	@Override
	public String toString() {
		return "DoubleColaQueue [queueForCola=" + queueForCola + "]";
	}

}
