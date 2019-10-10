package testes;
import corredores.Bowser;
import corredores.Mario;
import org.junit.jupiter.api.Test;
import pistas.DonutPlains;

import static org.junit.jupiter.api.Assertions.*;

class MarioTest {
    @Test
    public void marioComecaCom7DeVida(){
        Mario mario = new Mario();
        assertEquals(7,mario.getVida());

    }

    @Test
    public void marioAndar4Casas(){
        DonutPlains donutPlains = new DonutPlains();

        Bowser bowser = new Bowser();
        Mario mario = new Mario();

        donutPlains.adicionarCorredor(bowser);
        donutPlains.adicionarCorredor(mario);

        assertEquals(bowser, donutPlains.getCasaDaPista(0).getListaDeCorredores().get(0));
        assertEquals(mario, donutPlains.getCasaDaPista(0).getListaDeCorredores().get(1));

        mario.andar();

        assertEquals(mario, donutPlains.getCasaDaPista(4).getListaDeCorredores().get(0));
    }

}