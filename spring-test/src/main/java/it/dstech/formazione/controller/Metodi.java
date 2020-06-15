package it.dstech.formazione.controller;

import java.util.List;

public class Metodi {
	private List<String> parolePalindrome;
	private String testo;

	public Metodi(List<String> parolePalindrome, String testo) {
		this.parolePalindrome = parolePalindrome;
		this.testo = testo;
	}

	public List<String> listaPalindromi() {

		for (int i = 0; i < splitter().length; i++) {
			if (isPalindrome(splitter()[i])) {
				parolePalindrome.add(splitter()[i]);
			}
		}
		return parolePalindrome;
	}

	private String[] splitter() {
		return testo.split(" ");
	}

	public int numeroParole() {
		return splitter().length;
	}

	public int numeroParolePalindrome() {
		return listaPalindromi().size();
	}

	private boolean isPalindrome(String string) {
		if (string.length() < 2) {
			return true;
		} else {
			for (int i = 0; i < string.length() / 2; i++) {
				if (string.charAt(i) != string.charAt((string.length() - 1) - i)) {
					return false;
				}

			}
			return true;
		}
	}
}
