package com.springboot.crud.poo.bean;

import com.springboot.crud.poo.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TarjetaBean {

    private long id;
    private String marca;
    private String numero;
    private Cliente cliente;

}
