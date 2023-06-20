package com.doranco.SoAndJay.restController.controllerVue;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        // Vérification des informations de connexion

        // Exemple basique : vérification du nom d'utilisateur et du mot de passe
        if (username.equals("admin") && password.equals("admin123")) {
            model.addAttribute("username", username);
            return "redirect:/admin/dashboard"; // Rediriger vers la page d'administration
        } else {
            model.addAttribute("error", "Identifiant ou mot de passe incorrect");
            return "login";
        }
    }
}
