package testes;

import corredores.Bowser;
import org.junit.jupiter.api.Test;
import pistas.DonutPlains;

import static org.junit.jupiter.api.Assertions.*;

class BowserTest {
    @Test
    public void anda2CasasAMaisDepoisDaSegundaVez(){
        Bowser bowser = new Bowser();
        DonutPlains donutPlains = new DonutPlains();

        donutPlains.adicionarCorredor(bowser);

        bowser.andar();
        assertEquals(1,bowser.getCasaOndeJogadorEsta());

        bowser.andar();
        assertEquals(2,bowser.getCasaOndeJogadorEsta());

        bowser.andar();
        assertEquals(7,bowser.getCasaOndeJogadorEsta());
    }

}