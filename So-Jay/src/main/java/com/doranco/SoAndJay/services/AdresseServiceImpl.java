package com.doranco.SoAndJay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.SoAndJay.entities.Adresse;
import com.doranco.SoAndJay.repository.AdresseRepository;

@Service
public class AdresseServiceImpl implements AdresseService {

    @Autowired
    private AdresseRepository adresseRepository;

    @Override
    public Adresse getAdresseById(Long id) {
        return adresseRepository.findById(id).orElse(null);
    }

    @Override
    public List<Adresse> getAllAdresses() {
        return adresseRepository.findAll();
    }

    @Override
    public Adresse createAdresse(Adresse adresse) {
        return adresseRepository.save(adresse);
    }

    @Override
    public Adresse updateAdresse(Adresse adresse) {
        return adresseRepository.save(adresse);
    }

    @Override
    public void deleteAdresse(Long id) {
        adresseRepository.deleteById(id);
    }

    // Autres méthodes spécifiques à ajouter si nécessaire
}
