package com.example.progetto_ricette;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



// @RestController, che è usato per i controller REST che restituiscono dati JSON o XML. 
//Per restituire viste HTML, devi usare @Controller.
@Controller
//@RequestMapping("/home")
public class RicettaController {

    @Autowired
    private RicettaRepository ricettaRepository;

    @GetMapping("/")
    public String getAllRicette(Model model) {
        List<Ricetta> ricette = ricettaRepository.findAll();
        model.addAttribute("ricette", ricette);
        return "Home"; // Nome del template per la lista delle ricette
    }
  

    @GetMapping("/aggiungi")
    public String mostraFormAggiungi(Model model) {
        model.addAttribute("ricetta", new Ricetta());
        return "Aggiungi"; // Nome del template per aggiungere una ricetta
    }

    @PostMapping("/aggiungi")
    public String aggiungiRicetta(@ModelAttribute Ricetta ricetta) {
        ricettaRepository.save(ricetta); // Salva la ricetta nel repository
        return "redirect:/"; // Redireziona alla lista delle ricette
    } 
}
