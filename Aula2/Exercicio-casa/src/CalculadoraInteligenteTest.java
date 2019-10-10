import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraInteligenteTest {
    @Test
    void testarSomaInteligenteRetornandoValor5(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        Auxiliar auxiliar = new Auxiliar();
        CalculadoraInteligente calculadoraInteligente = new CalculadoraInteligente();
        String esperado= "Resultado da soma: 5";
        //Act
        String resultado = calculadoraInteligente.apresentarSoma(calculadora,auxiliar,2,3);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarSomaInteligenteRetornandoValor20(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        Auxiliar auxiliar = new Auxiliar();
        CalculadoraInteligente calculadoraInteligente = new CalculadoraInteligente();
        String esperado= "Resultado da soma: 20";
        //Act
        String resultado = calculadoraInteligente.apresentarSoma(calculadora,auxiliar,18,2);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarSomaInteligenteRetornandoValor10(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        Auxiliar auxiliar = new Auxiliar();
        CalculadoraInteligente calculadoraInteligente = new CalculadoraInteligente();
        String esperado= "Resultado da soma: 10";
        //Act
        String resultado = calculadoraInteligente.apresentarSoma(calculadora,auxiliar,7,3);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarSubtracaoInteligenteRetornandoValor3(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        Auxiliar auxiliar = new Auxiliar();
        CalculadoraInteligente calculadoraInteligente = new CalculadoraInteligente();
        String esperado= "Resultado da subtração: 3";
        //Act
        String resultado = calculadoraInteligente.apresentarSubtracao(calculadora,auxiliar,7,4);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarSubtracaoInteligenteRetornandoValor5(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        Auxiliar auxiliar = new Auxiliar();
        CalculadoraInteligente calculadoraInteligente = new CalculadoraInteligente();
        String esperado= "Resultado da subtração: 5";
        //Act
        String resultado = calculadoraInteligente.apresentarSubtracao(calculadora,auxiliar,11,6);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarSubtracaoInteligenteRetornandoValor6(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        Auxiliar auxiliar = new Auxiliar();
        CalculadoraInteligente calculadoraInteligente = new CalculadoraInteligente();
        String esperado= "Resultado da subtração: 6";
        //Act
        String resultado = calculadoraInteligente.apresentarSubtracao(calculadora,auxiliar,8,2);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarMultiplicacaoInteligenteRetornandoValor12(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        Auxiliar auxiliar = new Auxiliar();
        CalculadoraInteligente calculadoraInteligente = new CalculadoraInteligente();
        String esperado= "Resultado da multiplicação: 12";
        //Act
        String resultado = calculadoraInteligente.apresentarMultiplicacao(calculadora,auxiliar,4,3);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarMultiplicacaoInteligenteRetornandoValor9(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        Auxiliar auxiliar = new Auxiliar();
        CalculadoraInteligente calculadoraInteligente = new CalculadoraInteligente();
        String esperado= "Resultado da multiplicação: 9";
        //Act
        String resultado = calculadoraInteligente.apresentarMultiplicacao(calculadora,auxiliar,9,1);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarMultiplicacaoInteligenteRetornandoValor10(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        Auxiliar auxiliar = new Auxiliar();
        CalculadoraInteligente calculadoraInteligente = new CalculadoraInteligente();
        String esperado= "Resultado da multiplicação: 10";
        //Act
        String resultado = calculadoraInteligente.apresentarMultiplicacao(calculadora,auxiliar,5,2);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarDivisaoInteligenteRetornandoValor20(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        Auxiliar auxiliar = new Auxiliar();
        CalculadoraInteligente calculadoraInteligente = new CalculadoraInteligente();
        String esperado= "Resultado da divisão: 20.0";
        //Act
        String resultado = calculadoraInteligente.apresentarDivisao(calculadora,auxiliar,60,3);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarDivisaoInteligenteRetornandoValor24(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        Auxiliar auxiliar = new Auxiliar();
        CalculadoraInteligente calculadoraInteligente = new CalculadoraInteligente();
        String esperado= "Resultado da divisão: 24.0";
        //Act
        String resultado = calculadoraInteligente.apresentarDivisao(calculadora,auxiliar,72,3);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarDivisaoInteligenteRetornandoValor1(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        Auxiliar auxiliar = new Auxiliar();
        CalculadoraInteligente calculadoraInteligente = new CalculadoraInteligente();
        String esperado= "Resultado da divisão: 1.0";
        //Act
        String resultado = calculadoraInteligente.apresentarDivisao(calculadora,auxiliar,1,1);
        //Assert
        assertEquals(esperado,resultado);
    }
}
