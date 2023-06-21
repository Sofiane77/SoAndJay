package com.doranco.SoAndJay;

import com.doranco.SoAndJay.entities.Profil;
import com.doranco.SoAndJay.entities.Utilisateur;
import com.doranco.SoAndJay.repository.UserRepository;
import com.doranco.SoAndJay.services.UtilisateurServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SoAndJayApplication {

	public static void main(String[] args) {


		System.out.println("projet maven");


		UserRepository userRepository = SpringApplication
                                      .run(SoAndJayApplication.class, args)
                                      .getBean(UserRepository.class);



	}

}
