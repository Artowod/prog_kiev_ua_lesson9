package ua.prog.java.lesson9;

public class Char {
	private char currentChar;
	private int charQuantity = 0;
	
	public Char() {

	}

	public Char(char currentLetter, int charQuantity) {
		super();
		this.currentChar = currentLetter;
		this.charQuantity = charQuantity;
	}

	public char getCurrentChar() {
		return currentChar;
	}

	public void setCurrentChar(char currentLetter) {
		this.currentChar = currentLetter;
	}

	public int getCharQuantity() {
		return charQuantity;
	}

	@Override
	public String toString() {
		return "Char [Character: " + currentChar + ", Quantity: " + charQuantity + "]";
	}
		
}
