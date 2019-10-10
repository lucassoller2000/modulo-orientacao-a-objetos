package testes;

import corredores.Luigi;
import erros.ItemInvalidoException;
import itens.itensDoJogo.Cogumelo;
import org.junit.jupiter.api.Test;
import pistas.DonutPlains;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CogumeloTest {
    @Test
    public void corredorAnda4CasasQuandoUsaCogumelo() throws ItemInvalidoException {
        Luigi luigi = new Luigi();
        DonutPlains donutPlains = new DonutPlains();
        Cogumelo cogumelo = new Cogumelo();

        donutPlains.adicionarCorredor(luigi);
        luigi.andar();

        assertEquals(3, luigi.getCasaOndeJogadorEsta());

        luigi.equiparItem(cogumelo);
        luigi.usarItem(cogumelo);

        assertEquals(7,luigi.getCasaOndeJogadorEsta());
    }

    @Test
    public void usarItemSemTerEquipadoGeraErro(){
        Luigi luigi = new Luigi();
        Cogumelo cogumelo = new Cogumelo();

        assertThrows(ItemInvalidoException.class, () ->{
            luigi.usarItem(cogumelo);
        });
    }
}