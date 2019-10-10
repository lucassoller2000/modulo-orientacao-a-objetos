package aula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RelogioTest {
    @Test
    void testarConversaoDe160MinutosParaHorasEMinutos(){
        //Arrange
        Relogio relogio = new Relogio();
        String esperado = "2 Horas e 40 Minutos";
        //Act
        String resultado= relogio.formatarMinutosParaHorasEMinutos(160);
        //Assert
        assertEquals(esperado,resultado);
    }

    @Test
    void testarConversaoDe300MinutosParaHorasEMinutos(){
        //Arrange
        Relogio relogio = new Relogio();
        String esperado = "5 Horas e 0 Minutos";
        //Act
        String resultado= relogio.formatarMinutosParaHorasEMinutos(300);
        //Assert
        assertEquals(esperado,resultado);
    }

    @Test
    void testarConversaoDe240MinutosParaHorasEMinutos(){
        //Arrange
        Relogio relogio = new Relogio();
        String esperado = "4 Horas e 0 Minutos";
        //Act
        String resultado= relogio.formatarMinutosParaHorasEMinutos(240);
        //Assert
        assertEquals(esperado,resultado);
    }

    @Test
    void testarConversaoDe9600SegundoParaHorasEMinutos(){
        //Arrange
        Relogio relogio = new Relogio();
        String esperado = "2 Horas e 40 Minutos";
        //Act
        String resultado= relogio.formatarSegundosParaHorasEMinutos(9600);
        //Assert
        assertEquals(esperado,resultado);
    }

    @Test
    void testarConversaoDe7320SegundoParaHorasEMinutos(){
        //Arrange
        Relogio relogio = new Relogio();
        String esperado = "2 Horas e 2 Minutos";
        //Act
        String resultado= relogio.formatarSegundosParaHorasEMinutos(7320);
        //Assert
        assertEquals(esperado,resultado);
    }

    @Test
    void testarConversaoDe21000SegundoParaHorasEMinutos(){
        //Arrange
        Relogio relogio = new Relogio();
        String esperado = "5 Horas e 50 Minutos";
        //Act
        String resultado= relogio.formatarSegundosParaHorasEMinutos(21000);
        //Assert
        assertEquals(esperado,resultado);
    }
}