package testes;

import corredores.Peach;
import org.junit.jupiter.api.Test;
import pistas.DonutPlains;
import static org.junit.jupiter.api.Assertions.*;

class PeachTest {
    @Test
    public void peachGanhaBonusDe2CasasQuandoAndaPelaTerceiraVez() {
        Peach peach = new Peach();
        DonutPlains donutPlains = new DonutPlains();

        donutPlains.adicionarCorredor(peach);

        peach.andar();
        assertEquals(3,peach.getCasaOndeJogadorEsta());

        peach.andar();
        assertEquals(6,peach.getCasaOndeJogadorEsta());

        peach.andar();
        assertEquals(11,peach.getCasaOndeJogadorEsta());

    }
}