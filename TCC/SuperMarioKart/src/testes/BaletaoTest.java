package testes;

import corredores.Bowser;
import corredores.Luigi;
import erros.AlvoInvalidoException;
import erros.ItemInvalidoException;
import itens.itensDoJogo.Baletao;
import org.junit.jupiter.api.Test;
import pistas.DonutPlains;

import static org.junit.jupiter.api.Assertions.*;

class BaletaoTest {
    @Test
    public void baletaoAnda7Casas() throws ItemInvalidoException {
        Luigi luigi = new Luigi();
        Baletao baletao = new Baletao();
        DonutPlains donutPlains = new DonutPlains();

        donutPlains.adicionarCorredor(luigi);

        luigi.equiparItem(baletao);
        luigi.usarItem(baletao);

        assertEquals(7, luigi.getCasaOndeJogadorEsta());
    }

    @Test
    public void baletaoCausa5PontosDeDano() throws AlvoInvalidoException, ItemInvalidoException {
        Luigi luigi = new Luigi();
        Bowser bowser = new Bowser();
        Baletao baletao = new Baletao();

        assertEquals(10, bowser.getVida());

        luigi.equiparItem(baletao);
        luigi.usarItem(baletao,bowser);

        assertEquals(5, bowser.getVida());
    }

}