package ResidentEvil;

import ResidentEvil.Armas.Arma;
import ResidentEvil.Armas.Bazuca;
import ResidentEvil.Armas.TresOitao;
import ResidentEvil.Municoes.Municao;
import ResidentEvil.Municoes.MunicaoCalibre12;
import ResidentEvil.Municoes.MunicaoTresOitao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTest {

    @Test
    public void testarSeABazucaCabeNoInventario3x3(){
        Inventario inventario = new Inventario(3,3);
        Item bazuca = new Bazuca();
        boolean esperado = false;
        boolean obtido = inventario.adicionarItem(bazuca);
        assertEquals(esperado,obtido);
    }

    @Test
    public void testarTiros(){
        Arma arma = new TresOitao();
        arma.atirar();
        int esperado = 7;
        int obtido = arma.getNumeroDeMunicaoNaArma();
        assertEquals(esperado,obtido);
    }

    @Test
    public void testarTirosEDepoisRecarregarPra8(){
        Arma arma = new TresOitao();
        Municao municao = new MunicaoTresOitao();
        arma.atirar();
        arma.atirar();
        arma.recarregar(municao);
        int obtido = arma.getNumeroDeMunicaoNaArma();
        int esperado = 8;
        assertEquals(esperado,obtido);
    }

    @Test
    public void testarRegarregarPra8ComMunicaoDiferente(){
        Arma arma = new TresOitao();
        Municao municao = new MunicaoCalibre12();
        arma.atirar();
        arma.atirar();
        arma.recarregar(municao);
        int obtido = arma.getNumeroDeMunicaoNaArma();
        int esperado = 6;
        assertEquals(esperado,obtido);
    }

    @Test
    public void testarSeOItemCabeNoInventario(){
        Inventario inventario = new Inventario(3,3);
        Item arma = new TresOitao();
        boolean esperado= true;
        boolean obtido =inventario.adicionarItem(arma);
        assertEquals(esperado,obtido);
    }

    @Test
    public void testarContarEspacosDisponiveis(){
        Inventario inventario = new Inventario(5,5);
        int esperado= 25;
        int obtido =inventario.contarEspacosDisponiveis();
        assertEquals(esperado,obtido);
    }

}