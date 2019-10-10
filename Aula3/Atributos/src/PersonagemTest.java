import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonagemTest {

    @Test
    public void personagemDeveIniciarComVida10(){
        Personagem personagem = new Personagem(10);

        int vidaEsperada = 10;
        int vidaObtida = personagem.getVida();

        assertEquals(vidaEsperada, vidaObtida);
    }

    @Test
    public void personagemDeveIniciarComVidaCustomizada(){
        Personagem personagem = new Personagem(15);

        int vidaEsperada = 15;
        int vidaObtida = personagem.getVida();

        assertEquals(vidaEsperada, vidaObtida);
    }
}
