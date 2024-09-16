package com.ejercicio_spring.accessPrivate;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard/v1")
@RequiredArgsConstructor
public class DashboardRestController {

    @PostMapping("user")
    public String helloUser(){
        return "Welcome User";
    }

}
