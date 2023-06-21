package com.doranco.SoAndJay.restController.controllerVue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Gestion_articlesController {

    @GetMapping("/gestion_articles")
    public String showGestionArticlesPage() {
        return "gestion-articles";
    }
}
