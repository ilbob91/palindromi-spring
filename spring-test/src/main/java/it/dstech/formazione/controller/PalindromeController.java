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
		Metodi metodi = new Metodi(parolePalindrome, testo);
		ModelAndView oggettoVista = new ModelAndView("risultato");
		oggettoVista.addObject("lista", metodi.listaPalindromi());
		oggettoVista.addObject("numeroParole", metodi.numeroParolePalindrome());
		oggettoVista.addObject("numero", metodi.numeroParole());
		return oggettoVista;
	}

}
