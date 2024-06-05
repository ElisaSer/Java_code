package com.example.utentispring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.utentispring.repository.UtenteRepository;


@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    public String getUtente(){
        return utenteRepository.getUtente();
    }
}
