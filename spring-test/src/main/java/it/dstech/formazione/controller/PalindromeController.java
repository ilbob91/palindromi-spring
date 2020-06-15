package it.dstech.formazione.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PalindromeController {
	@RequestMapping(value = "/testChiamata", method = RequestMethod.POST)
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
		List<String> parolePalindrome = new ArrayList<String>();
		ModelAndView oggettoVista = new ModelAndView("risultato");
		String[] parole = splitter(testo);
		for (int i = 0; i < parole.length; i++) {
			if (isPalindrome(parole[i])) {
				parolePalindrome.add(parole[i]);
			}
		}
		oggettoVista.addObject("lista", parolePalindrome);
		oggettoVista.addObject("numero", numeroParole(testo));
		return oggettoVista;
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

	public String[] splitter(String testo) {
		return testo.split(" ");
	}

	public int numeroParole(String testo) {
		return splitter(testo).length;
	}
}
