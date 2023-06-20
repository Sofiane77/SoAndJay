package com.doranco.SoAndJay.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doranco.SoAndJay.entities.Adresse;
import com.doranco.SoAndJay.services.AdresseService;

@RestController
@RequestMapping("/api/adresses")
public class AdresseController {

    @Autowired
    private AdresseService adresseService;

    @GetMapping("/{id}")
    public ResponseEntity<Adresse> getAdresseById(@PathVariable Long id) {
        Adresse adresse = adresseService.getAdresseById(id);
        if (adresse != null) {
            return ResponseEntity.ok(adresse);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Adresse> createAdresse(@RequestBody Adresse adresse) {
        Adresse createdAdresse = adresseService.createAdresse(adresse);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAdresse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Adresse> updateAdresse(@PathVariable Long id, @RequestBody Adresse updatedAdresse) {
        Adresse adresse = adresseService.getAdresseById(id);
        if (adresse != null) {
            updatedAdresse.setId(id);
            Adresse updated = adresseService.updateAdresse(updatedAdresse);
            return ResponseEntity.ok(updated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdresse(@PathVariable Long id) {
        adresseService.deleteAdresse(id);
        return ResponseEntity.noContent().build();
    }

}

