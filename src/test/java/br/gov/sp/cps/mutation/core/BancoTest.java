package br.gov.sp.cps.mutation.core;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {

    Banco banco = new Banco();

    @Test
    @DisplayName("Deve obter taxa de juros para renda maior que 1000 e menor que 5000")
    void deveObterTaxaJurosParaRendaMaior1000EMenor5000(){
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
}