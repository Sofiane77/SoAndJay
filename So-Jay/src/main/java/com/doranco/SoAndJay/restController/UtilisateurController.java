package com.doranco.SoAndJay.restController;

import com.doranco.SoAndJay.entities.Utilisateur;
import com.doranco.SoAndJay.services.UtilisateurService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {


    private UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }
@RequestMapping("/utilisateurs")
    public String getAllUtilisateurs(Model model) {
        List<Utilisateur> utilisateurs = utilisateurService.getAllUtilisateurs();
        model.addAttribute("testuser", utilisateurs);
        return "utilisateur";
    }
    @GetMapping("/utilisateurs/{id}")
    public ResponseEntity<Utilisateur> getUtilisateur(@PathVariable("id") Long id) {
        Utilisateur utilisateur = utilisateurService.getUtilisateurById(id);
        if (utilisateur != null) {
            return ResponseEntity.ok(utilisateur);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/utilisateurs")
    public ResponseEntity<Utilisateur> createUtilisateur(@RequestBody Utilisateur utilisateur) {
        // Validation des données de l'utilisateur

        Utilisateur nouvelUtilisateur = utilisateurService.createUtilisateur(utilisateur);
        return ResponseEntity.status(HttpStatus.CREATED).body(nouvelUtilisateur);
    }

    @PutMapping("/utilisateurs/{id}")
    public ResponseEntity<Utilisateur> updateUtilisateur(@PathVariable("id") Long id, @RequestBody Utilisateur utilisateur) {
        // Validation des données de l'utilisateur

        Utilisateur utilisateurExist = utilisateurService.getUtilisateurById(id);
        if (utilisateurExist != null) {
            utilisateur.setId(id);
            Utilisateur utilisateurMaj = utilisateurService.updateUtilisateur(utilisateur);
            return ResponseEntity.ok(utilisateurMaj);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
