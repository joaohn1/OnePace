package com.onepace.OnePace.models;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Table(name = "CORREDOR")
public class CorredorModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "corredor", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<TenisModel> tenis = new HashSet<>();

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "corredor", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<TreinosModel> treinos = new HashSet<>();

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "corredor", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<MetasModel> metas = new HashSet<>();

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "corredor", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<InscricoesModel> inscricoes = new HashSet<>();

    @Column(nullable = false)
    private String nome;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    private String sexo;

    private String telefone;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE", name = "data_criacao")
    private Instant dataCriacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Instant getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Instant dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Set<TenisModel> getTenis() {
        return tenis;
    }

    public void setTenis(Set<TenisModel> tenis) {
        this.tenis = tenis;
    }

    public Set<TreinosModel> getTreinos() {
        return treinos;
    }

    public void setTreinos(Set<TreinosModel> treinos) {
        this.treinos = treinos;
    }

    public Set<MetasModel> getMetas() {
        return metas;
    }

    public void setMetas(Set<MetasModel> metas) {
        this.metas = metas;
    }

    public Set<InscricoesModel> getInscricoes() {
        return inscricoes;
    }

    public void setInscricoes(Set<InscricoesModel> inscricoes) {
        this.inscricoes = inscricoes;
    }

}
