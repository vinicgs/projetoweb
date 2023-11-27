package com.examplo.exemplo1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "divida")
public class Divida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "codigo")
    private int codigo;

    @OneToOne
    private Pessoa credorId;

    @OneToOne
    private Pessoa devedorId;

    @Column(name = "dataAtualizacao")
    private Date dataAtualizacao;

    @Column(name = "valorDivida")
    private double valorDivida;






}
