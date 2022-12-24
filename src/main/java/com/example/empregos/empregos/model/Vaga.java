package com.example.empregos.empregos.model;


import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "vaga")
public class Vaga {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idVaga;

    @NotBlank
    private String nomeVaga;

    @NotBlank
    private String descricao;

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dataCriacao;
    
    
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dataModificacao;

    
    private boolean ativo;

    @NotBlank
    private String email;

    @NotBlank
    private String telefone;

    @NotNull    
    @ManyToOne
    @JoinColumn(name = "vagacat", nullable = false)
    private Categoria categoria;


    @NotNull
    @ManyToOne
    @JoinColumn(name = "vagaemp", nullable = false)
    private Empresa empresa;
    

    @NotNull
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_vaga",
            joinColumns = @JoinColumn( name = "vagaId"),
            inverseJoinColumns = @JoinColumn (name = "usuarioId"))
    private List<Usuario> usuarios;


    public long getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(long idVaga) {
        this.idVaga = idVaga;
    }


    public String getNomeVaga() {
        return nomeVaga;
    }


    public void setNomeVaga(String nomeVaga) {
        this.nomeVaga = nomeVaga;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public LocalDate getDataCriacao() {
        return dataCriacao;
    }


    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }


    public LocalDate getDataModificacao() {
        return dataModificacao;
    }


    public void setDataModificacao(LocalDate dataModificacao) {
        this.dataModificacao = dataModificacao;
    }


    public boolean isAtivo() {
        return ativo;
    }


    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public List<Usuario> getUsuarios() {
        return usuarios;
    }


    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


    
}
