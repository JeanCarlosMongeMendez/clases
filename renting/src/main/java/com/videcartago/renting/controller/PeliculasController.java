package com.videcartago.renting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.videcartago.renting.business.PeliculaBusiness;


@Controller
public class PeliculasController {
	@Autowired
	private PeliculaBusiness peliculaBusiness;
	
	@RequestMapping(value="/findMovies", method=RequestMethod.GET )
	public String findMovies(Model model) {
		//TODO capturar los parámetros remitidos desde la vista
		model.addAttribute("peliculas", peliculaBusiness.findAllMoviesByTitleAndGenre("the", "suspenso"));
		return "findMovies";
	}
	
}

