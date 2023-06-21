package com.doranco.SoAndJay.restController.controllerVue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Historique_commandesController {

    @GetMapping("/historique_commandes")
    public String showHistoriqueCommandesPage() {
        return "historique-commandes";
    }
}
