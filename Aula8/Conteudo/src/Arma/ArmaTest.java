package Arma;

import Arma.Arma;
import org.junit.jupiter.api.Test;

class ArmaTest {
    @Test
    public void atirarComArmaPerde1Municao() throws SemMunicaoExtraException, ArmaSemMunicaoException {
        Arma arma = new Arma();
        arma.atirar();

    }

    @Test
    public void atirar7BalasTemMunicaoExtra() throws SemMunicaoExtraException, ArmaSemMunicaoException {
        Arma arma = new Arma();

        for(int i=0; i<7; i++){
            arma.atirar();
        }
    }

    @Test
    public void  aposAtirarENaoTerMunicaoRecarrega() throws SemMunicaoExtraException {
        Arma arma = new Arma();
        try{
             for (int i = 0; i < 10; i++) {
                 arma.atirar();
             }
        } catch (ArmaSemMunicaoException semMunicaoEx) {
            try {
                arma.recarregar();
            } catch (SemMunicaoExtraException semMunicaoExtraEx){

            }
        }
    }

}