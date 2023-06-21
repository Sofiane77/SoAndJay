package com.doranco.SoAndJay.restController.controllerVue;

import org.hibernate.mapping.Set;
import org.hibernate.query.sqm.internal.QuerySqmImpl.UniqueSemanticFilterQueryOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.doranco.SoAndJay.entities.Utilisateur;
import com.doranco.SoAndJay.repository.UserRepository;
import com.doranco.SoAndJay.services.UtilisateurServiceImpl;


@Controller
public class AddUtilisateurController {
    private final UserRepository utilisateurRepository;
@Autowired
    public AddUtilisateurController(UserRepository userRepository) {
        this.utilisateurRepository = userRepository;
    }
    @GetMapping("/addUser")
    public String showAddUtilisateurPage() {
        return "add-utilisateur";
    }

@PostMapping("/traitement-creation-utilisateur")
public ResponseEntity<String> traiterCreationUtilisateur(@RequestBody Utilisateur utilisateur) {
    // Accéder aux données de l'utilisateur
    String nom = utilisateur.getNom();
    String prenom = utilisateur.getPrenom();
    String email = utilisateur.getEmail();
    String password = utilisateur.getPassword();

    Utilisateur nouvelUtilisateur = new Utilisateur();
    nouvelUtilisateur.setNom(nom);
    nouvelUtilisateur.setPrenom(prenom);
    nouvelUtilisateur.setEmail(email);
    nouvelUtilisateur.setPassword(password);

    UtilisateurServiceImpl utilisateurService = new UtilisateurServiceImpl();
    utilisateurService.createUtilisateur(nouvelUtilisateur);

    utilisateurRepository.saveAndFlush(nouvelUtilisateur);
    // Exemple de réponse réussie
    return new ResponseEntity<>("Utilisateur créé avec succès.", HttpStatus.OK);
}



}

