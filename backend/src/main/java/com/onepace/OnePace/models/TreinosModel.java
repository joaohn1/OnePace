package com.onepace.OnePace.models;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "TREINOS")
public class TreinosModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "corredor_id", nullable = false)
    private CorredorModel corredor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tenis_id", nullable = false)
    private TenisModel tenis;

    @Column(name = "data_treino")
    private Date dataTreino;

    @Column(name = "tipo_treino")
    private String tipoTreino;

    private double distancia;

    @Column(name = "tempo_total")
    private LocalTime tempoTotal;

    @Column(name = "ritmo_medio")
    private LocalTime ritmoMedio;

    @Column(name = "frequencia_cardiaca_media")
    private int frequenciaCardiacaMedia;

    @Column(columnDefinition = "TEXT")
    private String observacoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataTreino() {
        return dataTreino;
    }

    public void setDataTreino(Date dataTreino) {
        this.dataTreino = dataTreino;
    }

    public String getTipoTreino() {
        return tipoTreino;
    }

    public void setTipoTreino(String tipoTreino) {
        this.tipoTreino = tipoTreino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public LocalTime getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(LocalTime tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public LocalTime getRitmoMedio() {
        return ritmoMedio;
    }

    public void setRitmoMedio(LocalTime ritmoMedio) {
        this.ritmoMedio = ritmoMedio;
    }

    public int getFrequenciaCardiacaMedia() {
        return frequenciaCardiacaMedia;
    }

    public void setFrequenciaCardiacaMedia(int frequenciaCardiacaMedia) {
        this.frequenciaCardiacaMedia = frequenciaCardiacaMedia;
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

    public TenisModel getTenis() {
        return tenis;
    }

    public void setTenis(TenisModel tenis) {
        this.tenis = tenis;
    }

}
