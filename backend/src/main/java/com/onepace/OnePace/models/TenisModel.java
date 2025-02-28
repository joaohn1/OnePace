package com.onepace.OnePace.models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Table(name = "TENIS")
public class TenisModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "corredor_id", nullable = false)
    private CorredorModel corredor;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "tenis", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<TreinosModel> treinos = new HashSet<>();

    private String marca;

    private String modelo;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Date dataAquisicao;

    @Column(name = "quilometragem_atual")
    private double quilometragemAtual;

    @Column(name = "quilometragem_maxima")
    private double quilometragemMaxima;

    private boolean ativo;

    @Column(columnDefinition = "TEXT")
    private String observacoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public double getQuilometragemAtual() {
        return quilometragemAtual;
    }

    public void setQuilometragemAtual(double quilometragemAtual) {
        this.quilometragemAtual = quilometragemAtual;
    }

    public double getQuilometragemMaxima() {
        return quilometragemMaxima;
    }

    public void setQuilometragemMaxima(double quilometragemMaxima) {
        this.quilometragemMaxima = quilometragemMaxima;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public CorredorModel getCorredor() {
        return corredor;
    }

    public void setCorredor(CorredorModel corredor) {
        this.corredor = corredor;
    }

    public Set<TreinosModel> getTreinos() {
        return treinos;
    }

    public void setTreinos(Set<TreinosModel> treinos) {
        this.treinos = treinos;
    }

}
