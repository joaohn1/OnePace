package com.onepace.OnePace.models;

import java.io.Serializable;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Table(name = "TEMPOS_CHECKPOINTS")
public class TemposCheckpointsModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToOne
    @JoinColumn(name = "checkpoint_id", nullable = false)
    private CheckpointsModel checkpoint;

    @Column(name = "tempo_registrado")
    private LocalTime tempoRegistrado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CheckpointsModel getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(CheckpointsModel checkpoint) {
        this.checkpoint = checkpoint;
    }

    public LocalTime getTempoRegistrado() {
        return tempoRegistrado;
    }

    public void setTempoRegistrado(LocalTime tempoRegistrado) {
        this.tempoRegistrado = tempoRegistrado;
    }

}
