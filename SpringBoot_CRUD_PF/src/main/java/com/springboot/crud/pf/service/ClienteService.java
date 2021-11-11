package com.springboot.crud.pf.service;


import com.springboot.crud.pf.bean.ClienteBean;
import com.springboot.crud.pf.model.Cliente;

import java.util.List;

public interface ClienteService {

    ClienteBean createClient(Cliente cliente);

    List<ClienteBean> createMassiveClients(List<Cliente> listClient);

    List<ClienteBean> getAllClients();

    List<ClienteBean> filterClientsEmail(String email);
}
