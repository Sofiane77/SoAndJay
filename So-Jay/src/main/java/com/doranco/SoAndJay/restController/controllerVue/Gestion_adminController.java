package com.doranco.SoAndJay.restController.controllerVue;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.doranco.SoAndJay.entities.Utilisateur;
import com.doranco.SoAndJay.repository.UserRepository;


@Controller
public class Gestion_adminController {


    private final UserRepository utilisateurRepository;
    @Autowired
    public Gestion_adminController(UserRepository userRepository) {
        this.utilisateurRepository = userRepository;
    }

    @GetMapping("/gestion_admin")
    public String showGestionAdminPage() {
        return "gestion-admin";
    }

    @GetMapping("/getAllUser")
    public String getAllUtilisateurs(Model model) {
        List<Utilisateur> utilisateurs = utilisateurRepository.findAll();
        model.addAttribute("listUtilisateurs", utilisateurs);
        return "utilisateurs";
    }

    @PostMapping("/formAddAll")
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
            return new RedirectView("/home");
        } else {
            return new RedirectView("/register?error");
        }
    }


        @DeleteMapping("/{id}")
        public String deleteUtilisateur(@PathVariable("id") Long id) {
            utilisateurRepository.deleteById(id);
            return "redirect:/utilisateurs";
        }






}
