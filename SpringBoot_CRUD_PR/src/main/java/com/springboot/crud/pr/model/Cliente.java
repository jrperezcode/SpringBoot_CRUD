package com.springboot.crud.pr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "cliente")
@Table(name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cliente")
    @SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente", initialValue = 1, allocationSize = 1)
    private long id;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "email")
    private String email;

}
