package testes;

import corredores.Bowser;
import corredores.Luigi;
import corredores.Mario;
import corredores.Peach;
import erros.AlvoInvalidoException;
import erros.ItemInvalidoException;
import itens.itensDoJogo.CascoVerde;
import org.junit.jupiter.api.Test;
import pistas.DonutPlains;
import podium.LugarNoPodium;

import static org.junit.jupiter.api.Assertions.*;

class PistaTest {
    @Test
    public void corredorQuePerdeTodaAVidaSaiDaCorrida() throws AlvoInvalidoException, ItemInvalidoException {
        Mario mario = new Mario();
        Luigi luigi = new Luigi();
        DonutPlains donutPlains = new DonutPlains();
        CascoVerde cascoVerde = new CascoVerde();

        donutPlains.adicionarCorredor(mario);
        donutPlains.adicionarCorredor(luigi);

        mario.equiparItem(cascoVerde);
        mario.usarItem(cascoVerde,luigi);

        mario.equiparItem(cascoVerde);
        mario.usarItem(cascoVerde,luigi);

        assertEquals(-1, luigi.getCasaOndeJogadorEsta());

    }

    @Test
    public void testarPosicaoDosCorredores(){
        Mario mario = new Mario();
        Luigi luigi = new Luigi();
        Bowser bowser = new Bowser();
        DonutPlains donutPlains = new DonutPlains();

        donutPlains.adicionarCorredor(mario);
        donutPlains.adicionarCorredor(luigi);
        donutPlains.adicionarCorredor(bowser);

        for (int i = 0; i < 20; i++){
            luigi.andar();
        }

        for (int i = 0; i < 20; i++){
            mario.andar();
        }

        for (int i = 0; i < 20; i++){
            bowser.andar();
        }

        assertEquals(luigi, donutPlains.getPodiumDaPista().getListaDeCorredores().get(LugarNoPodium.PRIMEIRO_LUGAR));
        assertEquals(mario, donutPlains.getPodiumDaPista().getListaDeCorredores().get(LugarNoPodium.SEGUNDO_LUGAR));
        assertEquals(bowser, donutPlains.getPodiumDaPista().getListaDeCorredores().get(LugarNoPodium.TERCEIRO_LUGAR));
    }

    @Test
    public void testarSeUmCorredorQueNaoTerminouACorridaEstaNoPodium(){
        Luigi luigi = new Luigi();
        DonutPlains donutPlains = new DonutPlains();
        donutPlains.adicionarCorredor(luigi);

        assertEquals(false,donutPlains.getPodiumDaPista().getListaDeCorredores().containsValue(luigi));
    }

    @Test
    public void testarSeUmJogadorQueTerminouACorridaEstaNaCasaNegativa(){
        Luigi luigi = new Luigi();
        DonutPlains donutPlains = new DonutPlains();

        donutPlains.adicionarCorredor(luigi);

        for (int i = 0; i < 20; i++){
            luigi.andar();
        }
        assertEquals(-1, luigi.getCasaOndeJogadorEsta());

    }

}