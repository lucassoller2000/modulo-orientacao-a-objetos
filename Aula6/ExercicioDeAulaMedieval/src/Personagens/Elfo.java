package Personagens;

public class Elfo extends Personagem {
    private int poderMagico;

    public Elfo(String nomeDoPersonagem, int poderDeAtaque, int poderMagico) {
        super(nomeDoPersonagem, poderDeAtaque);
        this.poderMagico = poderMagico;
        super.setPoderDeAtaqueFisico(poderDeAtaque += poderMagico);
    }
}
