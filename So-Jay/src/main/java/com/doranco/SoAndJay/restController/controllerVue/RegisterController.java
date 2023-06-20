package com.doranco.SoAndJay.restController.controllerVue;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        // Logique de traitement de l'inscription

        // Exemple basique : enregistrer l'utilisateur dans la base de données ou effectuer d'autres opérations nécessaires

        // Rediriger vers la page de connexion après l'inscription réussie
        return "redirect:/login";
    }
}

