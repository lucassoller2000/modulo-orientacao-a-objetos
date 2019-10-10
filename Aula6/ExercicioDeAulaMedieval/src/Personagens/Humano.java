package Personagens;

public class Humano extends Personagem {
    private boolean possuiArco;


    public Humano(String nomeDoPersonagem, int poderDeAtaque, boolean possuiArco) {
        super(nomeDoPersonagem, poderDeAtaque);
        this.possuiArco = possuiArco;
        if(possuiArco){
            setPoderDeAtaqueFisico(poderDeAtaque*=3);
        }
    }
}
