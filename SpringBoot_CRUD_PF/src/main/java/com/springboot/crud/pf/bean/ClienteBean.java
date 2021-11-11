package com.springboot.crud.pf.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClienteBean implements Serializable {

    private long id;
    private String nombres;
    private String email;
    private List<TarjetaBean> listTarjeta;

}
