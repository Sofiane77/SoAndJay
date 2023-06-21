package com.doranco.SoAndJay.restController.controllerVue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Commande_okController {

    @GetMapping("/commande_ok")
    public String showCommandeOkPage() {
        return "commande-ok";
    }
}
