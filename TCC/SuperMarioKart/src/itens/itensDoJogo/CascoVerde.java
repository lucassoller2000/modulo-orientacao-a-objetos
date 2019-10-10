package itens.itensDoJogo;

import corredores.Corredor;
import itens.interfacesDeItens.ItemDeAtaque;

public class CascoVerde implements ItemDeAtaque {
    private int danoQueTira;

    public CascoVerde() {
        this.danoQueTira = 3;
    }

    @Override
    public void usarItemDeAtaque(Corredor corredor) {
        corredor.receberAtaque(danoQueTira);
    }
}
