package com.doranco.SoAndJay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.SoAndJay.entities.LigneDeCommande;
import com.doranco.SoAndJay.repository.LigneDeCommandeRepository;

@Service
public class LigneDeCommandeServiceImpl implements LigneDeCommandeService {

    @Autowired
    private LigneDeCommandeRepository ligneDeCommandeRepository;

    @Override
    public LigneDeCommande getLigneDeCommandeById(Long id) {
        return ligneDeCommandeRepository.findById(id).orElse(null);
    }

    @Override
    public List<LigneDeCommande> getAllLignesDeCommande() {
        return ligneDeCommandeRepository.findAll();
    }

    @Override
    public LigneDeCommande createLigneDeCommande(LigneDeCommande ligneDeCommande) {
        return ligneDeCommandeRepository.save(ligneDeCommande);
    }

    @Override
    public LigneDeCommande updateLigneDeCommande(LigneDeCommande ligneDeCommande) {
        return ligneDeCommandeRepository.save(ligneDeCommande);
    }

    @Override
    public void deleteLigneDeCommande(Long id) {
        ligneDeCommandeRepository.deleteById(id);
    }

    // Autres méthodes spécifiques à ajouter si nécessaire
}
