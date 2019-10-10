import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnaoGuerreiroTest {

    @Test
    public void anaoNaoEquipaMachadoFraquinho(){
        AnaoGuerreiro anaoGuerreiro = new AnaoGuerreiro();
        Machado machado = new Machado();

        anaoGuerreiro.equiparMachado(machado);

        Machado machadoEquipadoEsperado = null;
        Machado machadoEquipadoRetornado = anaoGuerreiro.getMachadoEquipado();

        assertEquals(machadoEquipadoEsperado,machadoEquipadoRetornado);
    }

}