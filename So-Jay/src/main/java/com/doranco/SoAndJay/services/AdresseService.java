package com.doranco.SoAndJay.services;

import java.util.List;

import com.doranco.SoAndJay.entities.Adresse;

public interface AdresseService {

    Adresse getAdresseById(Long id);
    List<Adresse> getAllAdresses();
    Adresse createAdresse(Adresse adresse);
    Adresse updateAdresse(Adresse adresse);
    void deleteAdresse(Long id);
    // Autres méthodes spécifiques à ajouter si nécessaire

}
