package com.springboot.crud.poo.utils;

import com.springboot.crud.poo.bean.ClienteBean;
import com.springboot.crud.poo.bean.TarjetaBean;
import com.springboot.crud.poo.model.Cliente;
import com.springboot.crud.poo.model.Tarjeta;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static void main(String[] args) {
        System.out.println(validarEmail("jperezas@everis.com"));
        System.out.println(validarEmail("juniorcperez@bcp.com.pe"));
    }

    public static ClienteBean clientEntityToClientBean(Cliente client) {
        ClienteBean clientBean = new ClienteBean();
        clientBean.setId(client.getId());
        clientBean.setNombres(client.getNombres());
        clientBean.setEmail(client.getEmail());
        List<TarjetaBean> listTarjetaBean = new ArrayList<>();
        if (client.getListTarjeta()!=null && !client.getListTarjeta().isEmpty()) {
            for(Tarjeta t : client.getListTarjeta()){
                listTarjetaBean.add(Utils.cardEntityToCardBean(t));
            }
        }
        clientBean.setListTarjeta(listTarjetaBean);
        return clientBean;
    }

    public static boolean validarEmail(String email) {
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }

    //////////////////////////////

    public static TarjetaBean cardEntityToCardBean(Tarjeta tarjeta) {
        TarjetaBean tarjetaBean = new TarjetaBean();
        tarjetaBean.setId(tarjeta.getId());
        tarjetaBean.setMarca(tarjeta.getMarca());
        tarjetaBean.setNumero(tarjeta.getNumero());
        tarjetaBean.setCliente(tarjeta.getCliente());
        return tarjetaBean;
    }

}
