package com.adso.proyectospring.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorPpal {

    @GetMapping("/")
    public String index(){
        return "index"; // resources/templates/index.html
    }
    @GetMapping("/gorras")
    public String listarGorras(){
        return "gorras";
    }

}
