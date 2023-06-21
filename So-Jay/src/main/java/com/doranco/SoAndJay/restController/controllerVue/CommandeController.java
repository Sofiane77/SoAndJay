package com.doranco.SoAndJay.restController.controllerVue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommandeController {

    @GetMapping("/commande")
    public String showCommandePage() {
        return "commande";
    }
}
