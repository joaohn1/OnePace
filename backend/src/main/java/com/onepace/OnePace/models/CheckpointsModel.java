package com.onepace.OnePace.models;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "CHECKPOINTS")
public class CheckpointsModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "evento_id", nullable = false)
    private EventosModel evento;

    @OneToOne(mappedBy = "checkpoint", cascade = CascadeType.ALL)
    private TemposCheckpointsModel temposCheckpoints;

    private String nome;

    private Integer ordem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EventosModel getEvento() {
        return evento;
    }

    public void setEvento(EventosModel evento) {
        this.evento = evento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }

    public TemposCheckpointsModel getTemposCheckpoints() {
        return temposCheckpoints;
    }

    public void setTemposCheckpoints(TemposCheckpointsModel temposCheckpoints) {
        this.temposCheckpoints = temposCheckpoints;
    }

}
