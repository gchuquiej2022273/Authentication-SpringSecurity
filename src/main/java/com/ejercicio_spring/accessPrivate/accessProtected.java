package com.ejercicio_spring.accessPrivate;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventario/v1")
@RequiredArgsConstructor
public class accessProtected {

    @GetMapping("hola")
    public String welcome(){
        return "Welcome";
    }
}
