package itens.itensDoJogo;

import corredores.Corredor;
import itens.interfacesDeItens.ItemDeAtaque;
import itens.interfacesDeItens.ItemDeUso;

public class Baletao implements ItemDeAtaque, ItemDeUso {
    private int numeroDeCasasQueFazAndar;
    private int danoQueTira;

    public Baletao() {
        this.numeroDeCasasQueFazAndar = 7;
        this.danoQueTira = 5;
    }

    @Override
    public void usarItemDeAtaque(Corredor corredor) {
        corredor.receberAtaque(danoQueTira);
    }

    @Override
    public void usarItemDeUso(Corredor corredor) {
        corredor.andar(numeroDeCasasQueFazAndar);
    }
}
