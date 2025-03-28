package org.example.entities;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FORNECEDOR")
    private Long id;

    @OneToMany(mappedBy = "contatoFornecedor", cascade = CascadeType.ALL)
    private List<Contato> contatos = new ArrayList<>();

    @Column(length = 100, name = "RAZAO_SOCIAL", nullable = false)
    private String razaoSocial;

    @Column(length = 45, name = "NOME_FANTASIA", nullable = false)
    private String nomeFantasia;

    @Column(length = 25, name = "CNPJ", nullable = false)
    private String cnpj;

    @Column(length = 45, name = "STATUS", nullable = false)
    private String status;

    public Fornecedor() {
    }

    public Fornecedor(Long id, String razaoSocial, String nomeFantasia, String cnpj, String status) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
