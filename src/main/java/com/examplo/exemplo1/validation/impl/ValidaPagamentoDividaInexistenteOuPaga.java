package com.examplo.exemplo1.validation.impl;

import com.examplo.exemplo1.validation.IValidacoaCadastroPessoa;
import org.springframework.stereotype.Component;

@Component
public class ValidaPagamentoDividaInexistenteOuPaga implements IValidacoaCadastroPessoa {
    @Override
    public void validar() {
        System.out.println("ValidaPagamentoDividaInexistenteOuPaga");

    }
}
