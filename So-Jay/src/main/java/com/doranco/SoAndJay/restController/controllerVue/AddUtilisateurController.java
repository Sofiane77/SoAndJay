package com.doranco.SoAndJay.restController.controllerVue;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.doranco.SoAndJay.entities.Utilisateur;
import com.doranco.SoAndJay.repository.UserRepository;



@Controller
public class AddUtilisateurController {

    private final UserRepository utilisateurRepository;

    public AddUtilisateurController(UserRepository userRepository) {
        this.utilisateurRepository = userRepository;
    }
    @GetMapping("/addUser")
    public String showAddUtilisateurPage() {
        return "add-utilisateur";
    }

    @PostMapping("/formAddUser")
    public RedirectView registerUser(@ModelAttribute("utilisateur") @Validated Utilisateur utilisateur,
                                     BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new RedirectView("/register?error");
        }

        utilisateur.setDateNaissance(LocalDate.parse(utilisateur.getDateNaissance().toString()));
        utilisateur.setActif(true);


        Utilisateur savedUtilisateur = utilisateurRepository.save(utilisateur);

        boolean isRegistered = savedUtilisateur != null;
        if (isRegistered) {
            return new RedirectView("/gestion-admin");
        } else {
            return new RedirectView("/register?error");
        }

    }



}

