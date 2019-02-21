package formation.sopra.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import formation.sopra.entity.Film;
import formation.sopra.repository.FilmRepository;
import formation.sopra.repository.RealisateurRepository;

@Controller
@RequestMapping("/film")
public class FilmController {
	
	
	@Autowired
	FilmRepository filmRepository;
	
	@Autowired
	RealisateurRepository realisateurRepository;

	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("listeJoueur", filmRepository.findAll());
		return "film/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam(name="id")Long id, Model model) {
		filmRepository.deleteById(id);
		return "redirect:/film/list";
	}
	
	@GetMapping("/edit")
	public String edit(@RequestParam(name="id") Long id, Model model) {
		Optional<Film>opt = filmRepository.findById(id);
		Film film =null;
		if(opt.isPresent()) {
			film = opt.get();
		}else {
			film =new Film();
		}
		return goEdit(film, model);
				
				
				
	}
	@GetMapping("/add")
	public String add(Model model) {
		return goEdit(new Film(), model);
		
	}
	
	private String goEdit(Film film,Model model) {
		model.addAttribute("film", film);
		model.addAttribute("listeEquipe",realisateurRepository.findAll());
		return"film/edit";
	}

	@GetMapping("/save")
	public String save(@Valid @ModelAttribute("film") Film film,BindingResult br, Model model) {
		if(br.hasErrors()) 
			return goEdit(film, model);
		filmRepository.save(film);
		return list(model);
	}
	
	

}
