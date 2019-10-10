import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagoTest {

    @Test
    public void magoDeveIniciarComNivel1(){
        Mago mago = new Mago();

        int nivelEsperdao = 1;
        int nivelObtido = mago.getNivel();

        assertEquals(nivelEsperdao,nivelObtido);
    }

    @Test
    public void magoQueSubiuParaNivel2TemVida14(){
        Mago mago = new Mago();
        mago.passarDeNivel();

        int vidaEsperada = 14;
        int vidaObtido =mago.getVida();

        assertEquals(vidaEsperada,vidaObtido);
    }

    @Test
    public void magoComVidaAlterdadaPropositalmenteTemVida5(){
        Mago mago = new Mago();

        mago.setVida(5);

        int vidaEsperada = 5;
        int vidaObtido =mago.getVida();

        assertEquals(vidaEsperada,vidaObtido);
    }

}