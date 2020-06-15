package it.dstech.formazione.controller;

import java.util.List;

public class Metodi {
	private List<String> parolePalindrome;
	private String testo;

	public Metodi(String testo, List<String> parolePalindrome) {
		this.parolePalindrome = parolePalindrome;
		this.testo = testo;
	}

	public List<String> listaPalindromi() {
		String[] parole = splitter();
		for (int i = 0; i < parole.length; i++) {
			if (isPalindrome(parole[i])) {
				parolePalindrome.add(parole[i]);
			}
		}
		return parolePalindrome;
	}

	public String[] splitter() {
		return testo.split(" ");
	}

	public int numeroParole() {
		return splitter().length;
	}


	public boolean isPalindrome(String parola) {
		if (parola.length() < 2)
			return true;
		for (int i = 0; i < parola.length() / 2; i++) {

			if (parola.charAt(i) != parola.charAt((parola.length() - 1) - i)) {
				return false;
			}

		}
		return true;
	}

}
