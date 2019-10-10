package Personagens;

public class Orc extends Personagem {
    private boolean possuiGarra;
    public Orc(String nomeDoPersonagem, int poderDeAtaque, boolean possuiGarra) {
        super(nomeDoPersonagem, poderDeAtaque);
        this.possuiGarra = possuiGarra;
        if(possuiGarra){
            setPoderDeAtaqueFisico(poderDeAtaque *= 5);
        }
    }
}
