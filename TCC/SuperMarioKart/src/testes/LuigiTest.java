package testes;

import corredores.Luigi;
import org.junit.jupiter.api.Test;
import pistas.DonutPlains;

import static org.junit.jupiter.api.Assertions.*;

class LuigiTest {
    @Test
    public void luigiTemVida5(){
        Luigi luigi = new Luigi();

        assertEquals(5,luigi.getVida());
    }

    @Test
    public void luigiAnda6CasasQuandoAndaDuasVezesNaDonutPlains(){
        Luigi luigi = new Luigi();
        DonutPlains donutPlains = new DonutPlains();

        donutPlains.adicionarCorredor(luigi);
        luigi.andar();
        luigi.andar();

        assertEquals(6,luigi.getCasaOndeJogadorEsta());
    }
}