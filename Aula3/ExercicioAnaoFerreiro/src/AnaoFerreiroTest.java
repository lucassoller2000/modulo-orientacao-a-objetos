import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnaoFerreiroTest {

    @Test
    public void anaoNivel5Com90AnosForjaMachadoComNivel5(){
        AnaoFerreiro anaoFerreiro = new AnaoFerreiro(90,5);
        Machado machado= anaoFerreiro.forjarMachado();
        int poderEsperado = 5;
        int poderResultado = machado.getPoderMachado();

        assertEquals(poderEsperado,poderResultado);

    }

    @Test
    public void anaoNive21Com170AnosForjaMachadoComNive23(){
        AnaoFerreiro anaoFerreiro = new AnaoFerreiro(170,21);
        Machado machado= anaoFerreiro.forjarMachado();
        int poderEsperado = 23;
        int poderResultado = machado.getPoderMachado();

        assertEquals(poderEsperado,poderResultado);

    }
    

}