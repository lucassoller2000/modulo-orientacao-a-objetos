import Boss.Alvo;
import Personagens.Humano;
import Personagens.Personagem;
import java.util.LinkedList;
import java.util.List;

public class Grupo {
    private OrdenacaoPorNome ordenacaoPorNome = new OrdenacaoPorNome();
    private List<Personagem> listaDePersonagensDoGrupo;
    private List<Personagem> listaOrdenada;
    private int ataqueTotalDoGrupo;

    public Grupo(){
        listaDePersonagensDoGrupo = new LinkedList<>();
    }

    public int getAtaqueTotalDoGrupo() {
        return ataqueTotalDoGrupo;
    }

    public void adicionarPersonagemNoGrupo(Personagem personagem){
        listaDePersonagensDoGrupo.add(personagem);
    }

    public void adicionarListaDePersonagemNoGrupo(LinkedList<Personagem> listaDePersonagem){
        listaDePersonagensDoGrupo.addAll(listaDePersonagem);
    }

    public void humanosDevemAtacar(Alvo alvo){
        for(Personagem personagem : listaDePersonagensDoGrupo){
            if(personagem instanceof Humano){
                ataqueTotalDoGrupo += personagem.atacarUmAlvo(alvo);
            }
        }
    }

    public void atacarOrdenadamente(Alvo alvo){
        listaOrdenada = ordenarLista();
        for(Personagem personagem : listaOrdenada){
            ataqueTotalDoGrupo += personagem.atacarUmAlvo(alvo);
        }
    }

    public void atacar(Alvo alvo){
        for(Personagem personagem : listaDePersonagensDoGrupo){
            ataqueTotalDoGrupo += personagem.atacarUmAlvo(alvo);
        }
    }

    public List ordenarLista(){
        listaOrdenada = ordenacaoPorNome.ordenar(listaDePersonagensDoGrupo);
        return listaOrdenada;
    }
}
