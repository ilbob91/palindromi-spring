package it.dstech.formazione.controller;


import java.util.List;

public class Metodi {
	
	private String testo;

	public Metodi(String testo) {
	
		this.testo = testo;
	}

	public List<String> listaPalindromi(List<String> parolePalindrome) {
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

	public int numeroParolePalindrome(List<String> parole) {
		return listaPalindromi(parole).size();
	}

	public boolean isPalindrome(String parola) {
		if (parola.length() < 2)
			return true;
        for (int i = 0; i < parola.length()/2; i++) {
        	
        	
        	if (parola.charAt(i) !=parola.charAt((parola.length()-1)-i)) {
                return false;
            }
			
		}
			return true;
	}
	
}
