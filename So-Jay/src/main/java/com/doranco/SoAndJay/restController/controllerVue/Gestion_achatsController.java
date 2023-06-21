package com.doranco.SoAndJay.restController.controllerVue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Gestion_achatsController {

    @GetMapping("/gestion_achats")
    public String showGestionAchatsPage() {
        return "gestion-achats";
    }
}
