package br.gov.sp.cps.mutation.core;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BancoTest3 {
    Banco banco = new Banco();

    @Test
    @DisplayName("Deve obter taxa de juros para renda maior que 500 e menor que 5000")
    void deveObterTaxaJurosParaRendaMaior500EMenor5000(){
        Cliente cliente = new Cliente("Robson", 2500d);
        Double taxaAtual = banco.obterTaxaJuros(cliente);
        assertEquals(1d, taxaAtual);
    }

    @Test
    @DisplayName("Deve obter taxa de juros para renda maior que 5000")
    void deveObterTaxaJurosParaRendaMaior5000(){
        Cliente cliente = new Cliente("Marcos", 12000d);
        Double taxaAtual = banco.obterTaxaJuros(cliente);
        assertEquals(2d, taxaAtual);
    }

    @Test
    @DisplayName("Deve obter taxa de juros para renda igual a 500")
    void deveObterTaxaJurosParaRendaIgual500(){
        Cliente cliente = new Cliente("Chico", 500d);
        Double taxaAtual = banco.obterTaxaJuros(cliente);
        assertEquals(0.5d, taxaAtual);
    }

    @Test
    @DisplayName("Deve obter taxa de juros para renda igual a 5000")
    void deveObterTaxaJurosParaRendaIgual5000(){
        Cliente cliente = new Cliente("Moises", 5000d);
        Double taxaAtual = banco.obterTaxaJuros(cliente);
        assertEquals(1d, taxaAtual);
    }
}