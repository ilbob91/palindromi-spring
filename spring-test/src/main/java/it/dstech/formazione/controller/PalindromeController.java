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
		List<String> lista = new ArrayList<String>();
		Metodi metodi = new Metodi(testo, lista);
		List<String> parolePalindrome = metodi.listaPalindromi();
		ModelAndView oggettoVista = new ModelAndView("risultato");
		oggettoVista.addObject("lista", parolePalindrome);
		oggettoVista.addObject("numero", metodi.numeroParole());
		return oggettoVista;
	}

	
}
