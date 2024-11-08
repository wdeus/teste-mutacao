package br.gov.sp.cps.mutation.core;

import lombok.Getter;

@Getter
public class Banco {

    private String nome;
    private Double taxaJuros = 0d;

    public Double obterTaxaJuros(Cliente cliente){
        Double renda = cliente.getRendaMensal();
        if(renda >= 1000 && renda <= 5000){
            taxaJuros = 1d;
        }else {
            taxaJuros = 2d;
        }
        return taxaJuros;
    }
}
