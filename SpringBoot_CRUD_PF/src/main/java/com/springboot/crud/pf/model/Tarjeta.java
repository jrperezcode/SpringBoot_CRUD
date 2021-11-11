package com.springboot.crud.pf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "tarjeta")
@Table(name = "tarjeta")
public class Tarjeta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tarjeta")
    @SequenceGenerator(name = "seq_tarjeta", sequenceName = "seq_tarjeta", initialValue = 1, allocationSize = 1)
    private long id;

    @Column(name = "marca")
    private String marca;

    @Column(name = "numero")
    private String numero;

    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;

}