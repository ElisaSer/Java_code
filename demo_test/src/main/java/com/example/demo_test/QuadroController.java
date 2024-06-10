package com.example.demo_test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aquadri")
public class QuadroController {

    @Autowired
    private QuadroRepository quadroRepository;

    @GetMapping("/")
    public String getAllQuadri(Model model) {
        List<Quadro> quadri = quadroRepository.findAll();
        model.addAttribute("quadri", quadri);
        return "Home";
    }


    // @GetMapping("/{autore}")
    // public ResponseEntity<Quadro> getQuadroByAutore(@PathVariable String autore) {
    //     Optional<Quadro> quadro = quadroRepository.findBy( , autore);
    //     if (quadro.isPresent()) {
    //         return ResponseEntity.ok(quadro.get());
    //     } else {
    //         return ResponseEntity.notFound().build();
    //     }
    // }

    // @GetMapping("/{anno}")
    // public ResponseEntity<Quadro> getQuadroByAnno(@PathVariable int anno) {
    //     Optional<Quadro> quadro = quadroRepository.findB( , anno);
    //     if (quadro.isPresent()) {
    //         return ResponseEntity.ok(quadro.get());
    //     } else {
    //         return ResponseEntity.notFound().build();
    //     }
    // }

    @GetMapping("/aggiungi")
    public String mostraFormAggiungi(Model model) {
        model.addAttribute("quadro", new Quadro());
        return "Aggiungi"; // Nome del template per aggiungere una ricetta
    }

    @PostMapping("/aggiungi")
    public String aggiungiQuadro(@ModelAttribute Quadro quadro) {
        quadroRepository.save(quadro); // Salva la ricetta nel repository
        return "redirect:/home/"; // Redireziona alla lista delle ricette
    } 
    
}
