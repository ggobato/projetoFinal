package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

public class Contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTATO")
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "CON_FOR_ID")
    private Fornecedor conFornecedor;

    @Column(length = 25, name = "NUMERO", nullable = false)
    private String numero;

    @Column(length = 25, name = "EMAIL", nullable = false)
    private String email;

    public Contato() {
    }
}
