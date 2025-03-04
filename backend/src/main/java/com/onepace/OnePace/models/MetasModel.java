package com.onepace.OnePace.models;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

import com.onepace.OnePace.models.enums.StatusMeta;

import jakarta.persistence.*;

@Entity
@Table(name = "METAS")
public class MetasModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "corredor_id", nullable = false)
    private CorredorModel corredor;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    private double distancia;

    @Column(name = "tempo_objetivo")
    private LocalTime tempoObjetivo;

    @Column(name = "data_limite")
    private Date dataLimite;

    @Enumerated(EnumType.STRING)
    private StatusMeta status;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public LocalTime getTempoObjetivo() {
        return tempoObjetivo;
    }

    public void setTempoObjetivo(LocalTime tempoObjetivo) {
        this.tempoObjetivo = tempoObjetivo;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }

    public StatusMeta getStatus() {
        return status;
    }

    public void setStatus(StatusMeta status) {
        this.status = status;
    }

}
