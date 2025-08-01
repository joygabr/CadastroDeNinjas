package dev.java10x.CadastroDeNinja.Ninjas.Controller.Services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Olá, Mundo! Essa é minha primeira rota.";
    }

}
