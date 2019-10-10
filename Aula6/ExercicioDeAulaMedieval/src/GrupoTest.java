import Boss.Alvo;
import Boss.RaidBoss;
import Personagens.Elfo;
import Personagens.Humano;
import Personagens.Orc;
import Personagens.Personagem;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    public void testarPegarOAtaqueFisicoComBonus(){
        //Arrange
        Personagem personagem = new Humano("Lucas",100,true);
        //Assert
        assertEquals(300, personagem.getPoderDeAtaqueFisico());
    }

    @Test
    public void testarAtacarOAlvo(){
        //Arrange
        Personagem humano = new Humano("Lucas", 300, false);
        Alvo alvo = new Alvo(500);
        //Act
        humano.atacarUmAlvo(alvo);
        int esperado = 200;
        int obtido = alvo.getPontosDeVida();
        //Assert
        assertEquals(esperado,obtido);
    }

    @Test
    public void testarAtacarEmGrupoOrdenadamente(){
        //Arrange
        Personagem orc = new Orc("Carlos", 100,true);
        Personagem elfo = new Elfo("Lorien", 150,50);
        Personagem humano = new Humano("JP", 100, true);
        Personagem personagem = new Personagem("Pedrinho",1);
        Alvo alvo = new RaidBoss(2000,"Vanessa", 1000);
        Grupo grupo = new Grupo();
        //Act
        grupo.adicionarPersonagemNoGrupo(humano);
        grupo.adicionarPersonagemNoGrupo(elfo);
        grupo.adicionarPersonagemNoGrupo(orc);
        grupo.adicionarPersonagemNoGrupo(personagem);
        grupo.atacarOrdenadamente(alvo);
        int esperado = 1999;
        int obtido = alvo.getPontosDeVida();
        //Assert
        assertEquals(esperado, obtido);
    }

    @Test
    public void testarAtacarEmGrupoListaDePersonagemComAtaqueSimples(){
        //Arrange
        LinkedList<Personagem> listaDePersonagem= new LinkedList<>();
        Personagem orc = new Orc("Carlos", 100,true);
        Personagem elfo = new Elfo("Lorien", 150,50);
        Personagem humano = new Humano("JP", 100, true);
        Personagem personagem = new Personagem("Pedrinho",1);
        Alvo alvo = new RaidBoss(2000,"Vanessa", 1000);
        Grupo grupo = new Grupo();
        //Act
        listaDePersonagem.add(orc);
        listaDePersonagem.add(elfo);
        listaDePersonagem.add(humano);
        listaDePersonagem.add(personagem);
        grupo.adicionarListaDePersonagemNoGrupo(listaDePersonagem);
        grupo.atacar(alvo);
        int esperado = 1999;
        int obtido = alvo.getPontosDeVida();
        //Assert
        assertEquals(esperado, obtido);
    }

    @Test
    public void testarAtaquesApenasDeHumanos(){
        //Arrange
        Personagem orc = new Orc("Carlos", 100,true);
        Personagem elfo = new Elfo("Lorien", 150,50);
        Personagem humano = new Humano("JP", 100, true);
        Personagem humano2 = new Humano("LP", 100, false);
        Personagem personagem = new Personagem("Pedrinho",1);
        Alvo alvo = new Alvo(500);
        Grupo grupo = new Grupo();
        //Act
        grupo.adicionarPersonagemNoGrupo(humano);
        grupo.adicionarPersonagemNoGrupo(elfo);
        grupo.adicionarPersonagemNoGrupo(orc);
        grupo.adicionarPersonagemNoGrupo(personagem);
        grupo.adicionarPersonagemNoGrupo(humano2);
        grupo.humanosDevemAtacar(alvo);
        int esperado = 100;
        int obtido = alvo.getPontosDeVida();
        //Assert
        assertEquals(esperado, obtido);
    }

    @Test
    public void testarAtaqueTotalDoGrupo(){
        //Arrange
        Personagem orc = new Orc("Carlos", 100,true);
        Personagem elfo = new Elfo("Lorien", 150,50);
        Personagem humano = new Humano("JP", 100, true);
        Personagem humano2 = new Humano("LP", 100, false);
        Personagem personagem = new Personagem("Pedrinho",1);
        Alvo alvo = new Alvo(500);
        Grupo grupo = new Grupo();
        //Act
        grupo.adicionarPersonagemNoGrupo(humano);
        grupo.adicionarPersonagemNoGrupo(elfo);
        grupo.adicionarPersonagemNoGrupo(orc);
        grupo.adicionarPersonagemNoGrupo(personagem);
        grupo.adicionarPersonagemNoGrupo(humano2);
        grupo.atacar(alvo);
        int esperado = 1101;
        int obtido = grupo.getAtaqueTotalDoGrupo();
        //Assert
        assertEquals(esperado,obtido);

    }
    @Test
    public void testarOrdenacao(){
        //Arrange
        Personagem orc = new Orc("Carlos", 100,true);
        Personagem elfo = new Elfo("Lorien", 150,50);
        Personagem humano = new Humano("JP", 100, true);
        Personagem humano2 = new Humano("LP", 100, false);
        Personagem personagem = new Personagem("Pedrinho",1);
        Alvo alvo = new Alvo(500);
        Grupo grupo = new Grupo();
        //Act
        grupo.adicionarPersonagemNoGrupo(humano);
        grupo.adicionarPersonagemNoGrupo(elfo);
        grupo.adicionarPersonagemNoGrupo(orc);
        grupo.adicionarPersonagemNoGrupo(personagem);
        grupo.adicionarPersonagemNoGrupo(humano2);
        //Assert
        assertEquals(orc,grupo.ordenarLista().get(0));
    }

}