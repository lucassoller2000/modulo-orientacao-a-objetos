package testes;

import corredores.Bowser;
import corredores.Luigi;
import corredores.Mario;
import erros.AlvoInvalidoException;
import erros.ItemInvalidoException;
import itens.itensDoJogo.Baletao;
import itens.itensDoJogo.CascoVerde;
import org.junit.jupiter.api.Test;
import pistas.DonutPlains;

import static org.junit.jupiter.api.Assertions.*;

class CascoVerdeTest {
    @Test
    public void lancarCascoVerdeTira3DeVida() throws AlvoInvalidoException, ItemInvalidoException {
        Luigi luigi = new Luigi();
        Bowser bowser = new Bowser();
        CascoVerde cascoVerde = new CascoVerde();

        assertEquals(10, bowser.getVida());

        luigi.equiparItem(cascoVerde);
        luigi.usarItem(cascoVerde,bowser);

        assertEquals(7, bowser.getVida());
    }

    @Test
    public void naoPodeLancarCascoVerdeEmSiMesmo(){
        Luigi luigi = new Luigi();
        CascoVerde cascoVerde = new CascoVerde();

        luigi.equiparItem(cascoVerde);

        assertThrows(AlvoInvalidoException.class, () ->{
            luigi.usarItem(cascoVerde,luigi);
        });
    }

    @Test
    public void naoPodeLancarOCascoVerdeEmQuemEstaForaDaCorrida(){
        Luigi luigi = new Luigi();
        Mario mario = new Mario();
        CascoVerde cascoVerde = new CascoVerde();
        DonutPlains donutPlains = new DonutPlains();

        donutPlains.adicionarCorredor(luigi);

        luigi.equiparItem(cascoVerde);

        assertThrows(AlvoInvalidoException.class, () ->{
            luigi.usarItem(cascoVerde,mario);
        });
    }

}