package com.examplo.exemplo1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = false, updatable = false)
    private Integer id;

    @OneToOne
    private Pessoa idCliente;

    @Column(name = "nome_cliente")
    private String nomeCliente;

    @Column(name = "data_pagamento")
    private Date dataPagamento;

    @Column(name = "valor_pago")
    private double valorPago;



}
