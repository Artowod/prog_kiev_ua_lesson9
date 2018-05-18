package ua.prog.java.lesson9;

import java.util.Comparator;

public class CharComparator implements Comparator<Char> {

	public CharComparator() {

	}

	@Override
	public int compare(Char arg0, Char arg1) {
		if (arg0.getCharQuantity() > arg1.getCharQuantity()) {
			return -1;
		}
		if (arg0.getCharQuantity() < arg1.getCharQuantity()) {
			return 1;
		} else {
		return -1;
		}
	}

}
