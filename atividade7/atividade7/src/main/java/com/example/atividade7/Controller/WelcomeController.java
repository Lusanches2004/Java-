package com.example.atividade7.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("Welcome")
@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Bem vindo a API de cadastro de clientes!";
    }
}
