package com.example.progetto_ricette;

import org.springframework.data.jpa.repository.JpaRepository;


//  L'interfaccia RicettaRepository gestisce l'accesso ai dati.
public interface RicettaRepository extends JpaRepository<Ricetta, Long>{
    
}
