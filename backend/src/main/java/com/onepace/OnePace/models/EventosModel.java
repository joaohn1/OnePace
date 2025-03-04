package com.onepace.OnePace.models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Table(name = "EVENTOS")
public class EventosModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "evento", cascade = CascadeType.ALL)
    private InscricoesModel inscricao;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "evento", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<CheckpointsModel> checkpoints = new HashSet<>();

    private String nome;

    private String descricao;

    @Column(name = "data_evento")
    private Date dataEvento;

    private String local;

    private Double distancia;

    @Column(name = "valor_inscricao")
    private Double valorInscricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InscricoesModel getInscricao() {
        return inscricao;
    }

    public void setInscricao(InscricoesModel inscricao) {
        this.inscricao = inscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getValorInscricao() {
        return valorInscricao;
    }

    public void setValorInscricao(Double valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    public Set<CheckpointsModel> getCheckpoints() {
        return checkpoints;
    }

    public void setCheckpoints(Set<CheckpointsModel> checkpoints) {
        this.checkpoints = checkpoints;
    }

}
