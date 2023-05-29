package com.hcd.liquidempo.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "human")
@SequenceGenerator(sequenceName = "human_seq", name = "CUSTOM_SEQ_GENERATOR", allocationSize = 1)
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CUSTOM_SEQ_GENERATOR")
    @Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
