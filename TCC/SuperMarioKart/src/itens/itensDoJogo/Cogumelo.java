package itens.itensDoJogo;

import corredores.Corredor;
import itens.interfacesDeItens.ItemDeBonus;

public class Cogumelo implements ItemDeBonus {
    private int numeroDeCasasQueFazAndar;

    public Cogumelo() {
        this.numeroDeCasasQueFazAndar = 4;
    }

    @Override
    public void usarItemDeUso(Corredor corredor) {
        corredor.andar(numeroDeCasasQueFazAndar);
    }
}
