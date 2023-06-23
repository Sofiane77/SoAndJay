package com.doranco.SoAndJay.services;

import com.doranco.SoAndJay.entities.Utilisateur;
import com.doranco.SoAndJay.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Utilisateur getUtilisateurById(Long id) {
        return userRepository.findById(id).orElse(null);
    }


    public List<Utilisateur> getAllUtilisateurs() {
        return userRepository.findAll();
    }

    @Override
    public Utilisateur createUtilisateur(Utilisateur utilisateur) {
        if (userRepository != null) {
            return userRepository.save(utilisateur);
        } else {
            System.out.println("erreur , c'est nul");
        }
        return utilisateur;

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
