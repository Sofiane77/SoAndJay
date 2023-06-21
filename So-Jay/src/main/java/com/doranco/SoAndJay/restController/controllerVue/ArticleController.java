package com.doranco.SoAndJay.restController.controllerVue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @GetMapping("/article")
    public String showArticlePage() {
        return "article";
    }
}
