package com.example.utentispring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.utentispring.service.UtenteService;



@Controller
public class UtenteController {

    @Autowired
    private UtenteService utenteService;

    @GetMapping("/utente")
    @ResponseBody
    public String stampaUtente() {
        return utenteService.getUtente();
    }
    
}
