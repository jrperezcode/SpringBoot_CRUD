package com.springboot.crud.poo.controller;

import com.springboot.crud.poo.bean.ClienteBean;
import com.springboot.crud.poo.model.Cliente;
import com.springboot.crud.poo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/rest/client")
public class ClientController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/create")
    public ResponseEntity<ClienteBean> createClient(@RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteService.createClient(cliente));
    }

    @PostMapping("/create/massive")
    public ResponseEntity<List<ClienteBean>> createMassiveClients(@RequestBody List<Cliente> listCliente){
        return ResponseEntity.ok(clienteService.createMassiveClients(listCliente));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ClienteBean>> getAllClients(){
        return  ResponseEntity.ok(clienteService.getAllClients());
    }

    @GetMapping("/filter/clients/email/dominio")
    public ResponseEntity<List<ClienteBean>> filterClientsEmail(@PathParam("dominio") String dominio){
        return ResponseEntity.ok(clienteService.filterClientsEmail(dominio));
    }

}
