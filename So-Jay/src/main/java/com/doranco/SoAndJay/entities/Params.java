package com.doranco.SoAndJay.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Params implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cleCryptagePwd;
    private String cleCryptageCp;

    public Params(String cleCryptagePwd, String cleCryptageCp) {
        this.cleCryptagePwd = cleCryptagePwd;
        this.cleCryptageCp = cleCryptageCp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCleCryptagePwd() {
        return cleCryptagePwd;
    }

    public void setCleCryptagePwd(String cleCryptagePwd) {
        this.cleCryptagePwd = cleCryptagePwd;
    }

    public String getCleCryptageCp() {
        return cleCryptageCp;
    }

    public void setCleCryptageCp(String cleCryptageCp) {
        this.cleCryptageCp = cleCryptageCp;
    }

    // Autres attributs et méthodes getters/setters


}
