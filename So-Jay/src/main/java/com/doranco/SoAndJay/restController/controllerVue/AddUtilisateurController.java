package com.doranco.SoAndJay.restController.controllerVue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddUtilisateurController {

    @GetMapping("/addUser")
    public String showAddUtilisateurPage() {
        return "add-utilisateur";
    }

}
