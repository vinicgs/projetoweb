/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examplo.exemplo1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity @Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = false, updatable = false)
    private long id;

    @Column(name = "nome_cliente")
    private String nomeCliente;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "uf")
    private String uf;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "documento")
    private String documento;

    @Column(name = "email")
    private String email;


}
