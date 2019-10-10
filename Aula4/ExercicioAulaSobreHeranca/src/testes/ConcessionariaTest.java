package testes;

import calculadora.CalculadoraDeDescontos;
import org.junit.jupiter.api.Test;
import produtos.Artigo;
import produtos.Produto;
import produtos.Veiculo;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConcessionariaTest {

    @Test
    public void calcularValorTotalDoProdutoComValorBase100EPercentualDeLucro05(){
        //Arrange
        Produto produto = new Produto(100,50);
        //Act
        double esperado = 169.5;
        double obtido = produto.calcularValorTotalDoProduto();
        //Assert
        assertEquals(esperado,obtido);
    }

    @Test
    public void calcularValorTotalDosImpostosComValoBase100(){
        //Arrange
        Produto produto = new Produto(100,50);
        //Act
        double esperado = 13;
        double obtido = produto.calcularValorTotalDosImpostos();
        //Assert
        assertEquals(esperado,obtido);
    }

    @Test
    public void calcularValorTotalDosLucrosComValoBase1000EPercentualDeLucro05(){
        //Arrange
        Produto produto = new Produto(1000,50);
        //Act
        double esperado = 565;
        double obtido = produto.calcularLucroTotal();
        //Assert
        assertEquals(esperado,obtido);
    }

    @Test
    public void calcularValorTotalDosImpostosDoVeiculoComValorBase50000EPotencia2(){
        //Arrange
        Produto veiculo = new Veiculo(50000,0,2,"Fiat","Uno","vermelho");
        //Act
        double esperado = 15150;
        double obtido = veiculo.calcularValorTotalDosImpostos();
        //Assert
        assertEquals(esperado,obtido);
    }

    @Test
    public void calcularValorTotalDoProdutoComValorBase50000EPotencia2(){
        //Arrange
        Produto veiculo = new Veiculo(50000,0,2,"Fiat","Uno","vermelho");
        //Act
        double esperado = 65150;
        double obtido = veiculo.calcularValorTotalDoProduto();
        //Assert
        assertEquals(esperado,obtido);
    }

    @Test
    public void calcularNovoValorDoProdutoComDescontoDe1(){
        //Arrange
        Produto produto = new Produto(100, 0);
        //Act
        double esperado = 0;
        double obtido = CalculadoraDeDescontos.calcularDescontos(produto,100);
        //Assert
        assertEquals(esperado,obtido);
    }

    @Test
    public void calcularNovoValorDoProdutoComDescontoDe05EPercentualDeLucroDe05(){
        //Arrange
        Produto produto = new Produto(100, 50);
        //Act
        double esperado = 84.75;
        double obtido = CalculadoraDeDescontos.calcularDescontos(produto,50);
        //Assert
        assertEquals(esperado,obtido);
    }

    @Test
    public void calcularValorTotalDoArtigoComValorBase50EPercentualDeLucro01(){
        //Arrange
        Produto artigo = new Artigo(50, 10, "Rádio","Preto e potente");
        //Act
        double esperado = 62.15;
        double obtido = artigo.calcularValorTotalDoProduto();
        //Assert
        assertEquals(esperado,obtido);
    }

    @Test
    public void calcularValorDoArtigoComDescontoDe06ValorBase50EPercentualDeLucro01(){
        //Arrange
        Produto artigo = new Artigo(50, 10, "Rádio","Preto e potente");
        //Act
        double esperado = 24.86;
        double obtido = CalculadoraDeDescontos.calcularDescontos(artigo,60);
        //Assert
        assertEquals(esperado,obtido);
    }
}
