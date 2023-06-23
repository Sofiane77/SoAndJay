package com.doranco.SoAndJay.restController.controllerVue;

import com.doranco.SoAndJay.entities.Article;
import com.doranco.SoAndJay.entities.Utilisateur;
import com.doranco.SoAndJay.repository.ArticleRepository;
import com.doranco.SoAndJay.repository.UserRepository;
import com.doranco.SoAndJay.services.ArticleService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import javax.faces.view.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@ViewScoped
@Controller
public class Gestion_articlesController {

    private final ArticleService articleService;

    private final ArticleRepository articleRepository;

    public Gestion_articlesController(ArticleService articleService, ArticleRepository articleRepository) {
        this.articleService = articleService;
        this.articleRepository = articleRepository;
    }

@RequestMapping("/gestion-articles")
    public String getAllArticles(Model model) {
        List<Article> articles = articleService.getAllArticles();
        model.addAttribute("test", articles);
        return "gestion-articles";
    }

    @GetMapping("/{id}")
    public String getArticleById(@PathVariable("id") Long id, Model model) {
        Optional<Article> article = articleService.getArticleById(id);

        if (article.isPresent()) {
            model.addAttribute("article", article.get());
        } else {
            return "404";
        }

        return "article";
    }

    @PostMapping
    public String createArticle(@ModelAttribute Article article) {
        Article createdArticle = articleService.createArticle(article);
        return "redirect:/articles/" + createdArticle.getId();
    }

    @PutMapping("/{id}")
    public String updateArticle(@PathVariable("id") Long id, @ModelAttribute Article updatedArticle) {
        Article article = articleService.updateArticle(id, updatedArticle);

        if (article != null) {
            return "redirect:/articles/" + article.getId();
        } else {
            return "404";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteArticle(@PathVariable("id") Long id) {
        boolean deleted = articleService.deleteArticle(id);

        if (deleted) {
            return "redirect:/articles";
        } else {
            return "404";
        }
    }


    @PostMapping("/addarticleform")
    public RedirectView registerUser(@ModelAttribute("article") @Validated Article article,
                                     BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new RedirectView("/register?error");
        }


        Article savedArticle = articleRepository.save(article);

        boolean isRegistered = savedArticle != null;
        if (isRegistered) {
            return new RedirectView("/gestion-articles");
        } else {
            return new RedirectView("/register?error");
        }

    }

}


