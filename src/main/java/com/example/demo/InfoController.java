package com.example.demo;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @GetMapping("/nombre")
    public String nombre() {
        return "Proyecto de Jazmín Fernández López";
    }

    @GetMapping("/materias")
    public List<String> materias() {
        return List.of("Programación Web", "PLF", "Software para la toma de decisiones, Administracion de redes");
    }
}