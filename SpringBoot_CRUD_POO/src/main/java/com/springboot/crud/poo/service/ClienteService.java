package com.springboot.crud.poo.service;

import com.springboot.crud.poo.bean.ClienteBean;
import com.springboot.crud.poo.model.Cliente;

import java.util.List;

public interface ClienteService {

    ClienteBean createClient(Cliente cliente);

    List<ClienteBean> createMassiveClients(List<Cliente> listClient);

    List<ClienteBean> getAllClients();

    List<ClienteBean> filterClientsEmail(String email);

}
