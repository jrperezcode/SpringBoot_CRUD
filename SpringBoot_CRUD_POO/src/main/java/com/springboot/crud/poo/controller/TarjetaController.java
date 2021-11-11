package com.springboot.crud.poo.controller;

import com.springboot.crud.poo.bean.TarjetaBean;
import com.springboot.crud.poo.model.Tarjeta;
import com.springboot.crud.poo.service.TarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/card")
public class TarjetaController {

    @Autowired
    TarjetaService tarjetaService;

    @PostMapping("/create")
    public ResponseEntity<TarjetaBean> createCard(@RequestBody  Tarjeta tarjeta){
        return ResponseEntity.ok(tarjetaService.createCard(tarjeta));
    }

}
