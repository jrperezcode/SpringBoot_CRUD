package com.springboot.crud.poo.service.impl;

import com.springboot.crud.poo.bean.ClienteBean;
import com.springboot.crud.poo.model.Cliente;
import com.springboot.crud.poo.repository.ClienteRepository;
import com.springboot.crud.poo.service.ClienteService;
import com.springboot.crud.poo.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        Cliente clienteSaved;
        ClienteBean clienteBean;
        for (Cliente cliente : listClient) {
            clienteSaved = clienteRepository.save(cliente);
            clienteBean = Utils.clientEntityToClientBean(clienteSaved);
            clienteBeanList.add(clienteBean);
        }
        return clienteBeanList;
    }

    @Override
    public List<ClienteBean> getAllClients() {
        List<Cliente> clienteList = clienteRepository.findAll();
        List<ClienteBean> clienteBeanList = new ArrayList<>();

        for (Cliente cliente : clienteList) {
            clienteBeanList.add(Utils.clientEntityToClientBean(cliente));
        }
        return clienteBeanList;
    }

    @Override
    public List<ClienteBean> filterClientsEmail(String email) {
        List<Cliente> clienteList = clienteRepository.findAll();
        List<ClienteBean> clienteBeanList = new ArrayList<>();
        for (Cliente cliente : clienteList) {
            if(cliente.getEmail().contains(email))
                clienteBeanList.add(Utils.clientEntityToClientBean(cliente));
        }
        return clienteBeanList;
    }
}
