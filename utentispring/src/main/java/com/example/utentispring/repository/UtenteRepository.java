package com.example.utentispring.repository;

import org.springframework.stereotype.Repository;

import com.example.utentispring.model.Utente;

@Repository
public class UtenteRepository {
    
    public String getUtente(){
        return new Utente("Elisabetta", "ahsvy1213").toString();
    }
}
