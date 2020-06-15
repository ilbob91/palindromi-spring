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

		String[] parole = testo.split(" ");
		int numeroParoleNellaFrase = parole.length;
		List<String> parolePalindrome = new ArrayList<String>();
		for (int i = 0; i < parole.length; i++) {
			if (isPalindrome(parole[i])) {
				parolePalindrome.add(parole[i]);
			}
		}
ModelAndView oggettoVista = new ModelAndView("risultato");
oggettoVista.addObject("lista", parolePalindrome);
oggettoVista.addObject("numeroParole", parolePalindrome.size());
oggettoVista.addObject("numero", numeroParoleNellaFrase);
		return oggettoVista;
	}

	private boolean isPalindrome(String string) {
		if (string.length() < 2) {
			return true;
		}
		else {
			for (int i = 0; i < string.length()/2; i++) {
				if(string.charAt(i) != string.charAt((string.length()-1)-i)) {
					return false;
				}
			
				}
				return true;
			}
		}
	}

