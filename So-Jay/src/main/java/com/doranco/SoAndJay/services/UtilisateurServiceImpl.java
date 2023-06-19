package com.doranco.SoAndJay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.SoAndJay.entities.Utilisateur;
import com.doranco.SoAndJay.repository.UserRepository;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Utilisateur getUtilisateurById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<Utilisateur> getAllUtilisateurs() {
        return userRepository.findAll();
    }

    @Override
    public Utilisateur createUtilisateur(Utilisateur utilisateur) {
        return userRepository.save(utilisateur);
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
        return userRepository.save(utilisateur);
    }

    @Override
    public void deleteUtilisateur(Long id) {
        userRepository.deleteById(id);
    }

    // Autres méthodes spécifiques à ajouter si nécessaire
}
