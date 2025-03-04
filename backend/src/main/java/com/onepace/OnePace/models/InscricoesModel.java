package com.onepace.OnePace.models;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "INSCRICOES")
public class InscricoesModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "corredor_id", nullable = false)
    private CorredorModel corredor;

    @OneToOne(mappedBy = "inscricao", cascade = CascadeType.ALL)
    private ResultadosModel resultado;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToOne
    @JoinColumn(name = "evento_id")
    private EventosModel evento;

    @Column(name = "data_inscricao")
    private Date dataInscricao;

    @Column(name = "numero_peito")
    private Integer numeroPeito;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public CorredorModel getCorredor() {
        return corredor;
    }

    public void setCorredor(CorredorModel corredor) {
        this.corredor = corredor;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public Integer getNumeroPeito() {
        return numeroPeito;
    }

    public void setNumeroPeito(Integer numeroPeito) {
        this.numeroPeito = numeroPeito;
    }

    public ResultadosModel getResultado() {
        return resultado;
    }

    public void setResultado(ResultadosModel resultado) {
        this.resultado = resultado;
    }

    public EventosModel getEvento() {
        return evento;
    }

    public void setEvento(EventosModel evento) {
        this.evento = evento;
    }

}
