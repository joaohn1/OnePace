package com.onepace.OnePace.models;

import java.io.Serializable;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESULTADOS")
public class ResultadosModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToOne
    @JoinColumn(name = "inscricao_id")
    private InscricoesModel inscricao;

    private Integer posicao;

    @Column(name = "tempo_oficial")
    private LocalTime tempoOficial;

    private double premiacao;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public InscricoesModel getInscricao() {
        return inscricao;
    }

    public void setInscricao(InscricoesModel inscricao) {
        this.inscricao = inscricao;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public LocalTime getTempoOficial() {
        return tempoOficial;
    }

    public void setTempoOficial(LocalTime tempoOficial) {
        this.tempoOficial = tempoOficial;
    }

    public double getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(double premiacao) {
        this.premiacao = premiacao;
    }

}
