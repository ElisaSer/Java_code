package com.example.utenti_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UtenteController {


    @GetMapping("/showUtente")
    public String stampaUtente(Model model) {
        Utente utente = new Utente();
        utente.setName("Mia");
        utente.setPassword("milkshake123");
        utente.setEmail("mia@gmail.com");
        utente.setAge(30);

        model.addAttribute("utente", utente);
        return "utente";
    }
    
    
}
