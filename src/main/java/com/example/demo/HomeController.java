package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HomeController {

    @GetMapping("/")
    public Response getHomeInfo() {
        return new Response("Nathan", "natLeKiller@deNantes.fr", LocalDate.now().toString());
    }

    // Classe interne pour l'objet JSON
    @Setter
    @Getter
    public static class Response {
        // Getters et Setters
        private String name;
        private String email;
        private String date;

        // Constructeur
        public Response(String name, String email, String date) {
            this.name = name;
            this.email = email;
            this.date = date;
        }

    }
}
