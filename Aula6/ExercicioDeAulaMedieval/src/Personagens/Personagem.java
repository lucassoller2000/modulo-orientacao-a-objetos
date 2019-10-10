package Personagens;
import Boss.Alvo;

public class Personagem {
    private String nomeDoPersonagem;
    private int poderDeAtaque;

    public Personagem(String nomeDoPersonagem, int poderDeAtaque) {
        this.nomeDoPersonagem = nomeDoPersonagem;
        this.poderDeAtaque = poderDeAtaque;
    }

    public int atacarUmAlvo(Alvo alvo){
        alvo.receberAtaque(poderDeAtaque);
        return this.poderDeAtaque;
    }

    public String getNomeDoPersonagem() {
        return nomeDoPersonagem;
    }

    public int getPoderDeAtaqueFisico() {
        return poderDeAtaque;
    }

    public void setPoderDeAtaqueFisico(int poderDeAtaqueFisico) {
        this.poderDeAtaque = poderDeAtaqueFisico;
    }
}
