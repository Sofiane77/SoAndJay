package com.doranco.SoAndJay.repository;

import com.doranco.SoAndJay.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<Utilisateur, Long> {

    @Override
    public <S extends Utilisateur> S saveAndFlush(S entity);
    // Méthodes spécifiques à ajouter si nécessaire

    void deleteById(Long id);

}
