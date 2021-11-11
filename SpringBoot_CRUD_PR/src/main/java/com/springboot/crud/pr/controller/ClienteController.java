package com.springboot.crud.pr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/client")
public class ClienteController {

    @GetMapping
    public String saludar(){
        return "Hola Rx JAVA";
    }

}