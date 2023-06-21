package com.doranco.SoAndJay.restController.controllerVue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Gestion_adminController {

    @GetMapping("/gestion_admin")
    public String showGestionAdminPage() {
        return "gestion-admin";
    }
}
