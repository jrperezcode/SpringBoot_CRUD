package com.springboot.crud.pf.service.impl;

import com.springboot.crud.pf.bean.ClienteBean;
import com.springboot.crud.pf.model.Cliente;
import com.springboot.crud.pf.repository.ClienteRepository;
import com.springboot.crud.pf.service.ClienteService;
import com.springboot.crud.pf.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public ClienteBean createClient(Cliente cliente) {
        Cliente clientSaved = clienteRepository.save(cliente);
        ClienteBean clienteBean = Utils.clientEntityToClientBean(clientSaved);
        return clienteBean;
    }

    @Override
    public List<ClienteBean> createMassiveClients(List<Cliente> listClient) {
        List<ClienteBean> clienteBeanList = new ArrayList<>();
        listClient.forEach(c -> clienteBeanList
                .add(Utils.clientEntityToClientBean(clienteRepository.save(c))));
        return clienteBeanList;
    }

    @Override
    public List<ClienteBean> getAllClients() {
        List<Cliente> clienteList = clienteRepository.findAll();
        List<ClienteBean> clienteBeanList = new ArrayList<>();
        clienteList.forEach(c -> clienteBeanList
                .add(Utils.clientEntityToClientBean(c)));
        return clienteBeanList;
    }

    @Override
    public List<ClienteBean> filterClientsEmail(String email) {
        List<Cliente> clienteList = clienteRepository.findAll();
        List<ClienteBean> clienteBeanList = new ArrayList<>();

        //1. Forma elegante
        clienteList
                .stream()
                .filter(c -> c.getEmail().contains(email))
                .collect(Collectors.toList())
                .forEach(c -> clienteBeanList.add(Utils.clientEntityToClientBean(c)));

        //2. Forma alternatvia
        /*
        clienteList = clienteList
                .stream()
                .filter(c -> c.getEmail().contains(email))
                .collect(Collectors.toList());

        clienteList.forEach(c -> clienteBeanList.add(Utils.clientEntityToClientBean(c)));
        */
        return clienteBeanList;

    }
}
