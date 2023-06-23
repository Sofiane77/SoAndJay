package com.doranco.SoAndJay.restController.controllerVue;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import com.doranco.SoAndJay.entities.Utilisateur;
import com.doranco.SoAndJay.services.UtilisateurService;


@Controller
public class Gestion_adminController {

    private final UtilisateurService utilisateurService;

    public Gestion_adminController(UtilisateurService utilisateurService) {
            this.utilisateurService = utilisateurService;
        }

    @RequestMapping("/gestion-admin")
    public String getAllUtilisateurs(Model model) {
        List<Utilisateur> utilisateurs = utilisateurService.getAllUtilisateurs();
        model.addAttribute("testuser", utilisateurs);
        return "gestion-admin";
    }





}
