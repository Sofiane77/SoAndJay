package com.doranco.SoAndJay.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.doranco.SoAndJay.entities.Utilisateur;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Utilisateur utilisateur = utilisateurRepository.findByEmail(username);
        if (utilisateur == null) {
            throw new UsernameNotFoundException("Utilisateur non trouvé");
        }
        return new User(utilisateur.getEmail(), utilisateur.getPassword(), new ArrayList<>());
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(Utilisateur utilisateur) {
        String encodedPassword = passwordEncoder.encode(utilisateur.getPassword());
        utilisateur.setPassword(encodedPassword);
        // Enregistrer l'utilisateur dans la base de données
    }
}
