package aula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {
    @Test
    void testarSomaCalculadoraRetornandoValor10(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int esperado = 10;
        //Act

        int resultado = calculadora.somar(1, 9);
        //Assert
        assertEquals(esperado,resultado);
    }

    @Test
    void testarSubtracaoCalculadoraRetornandoValor1(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int esperado = 1;
        //Act
        int resultado = calculadora.subtrair(4, 3);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarSubtracaoCalculadoraRetornandoValor2(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int esperado = 2;
        //Act
        int resultado = calculadora.subtrair(8, 6);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarSubtracaoCalculadoraRetornandoValor3(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int esperado = 3;
        //Act
        int resultado = calculadora.subtrair(12, 9);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarMultiplicacaoCalculadoraRetornandoValor21(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int esperado = 21;
        //Act
        double resultado = calculadora.multiplicar(3, 7);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarMultiplicacaoCalculadoraRetornandoValor34(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int esperado = 34;
        //Act
        double resultado = calculadora.multiplicar(2, 17);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarMultiplicacaoCalculadoraRetornandoValor14(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int esperado = 14;
        //Act
        double resultado = calculadora.multiplicar(14, 1);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarDivisaoCalculadoraRetornandoValor8(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int esperado = 8;
        //Act
        double resultado = calculadora.dividir(32, 4);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarDivisaoCalculadoraRetornandoValor30(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int esperado = 30;
        //Act
        double resultado = calculadora.dividir(90, 3);
        //Assert
        assertEquals(esperado,resultado);
    }
    @Test
    void testarDivisaoCalculadoraRetornandoValor15(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int esperado = 15;
        //Act
        double resultado = calculadora.dividir(75, 5);
        //Assert
        assertEquals(esperado,resultado);
    }
}