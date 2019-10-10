package itens.itensDoJogo;

import corredores.Corredor;
import itens.interfacesDeItens.ItemDeRecuperacao;

public class CogumeloRoxo implements ItemDeRecuperacao {
    private int quantidadeDeVidaQueRecupera;

    public CogumeloRoxo() {
        this.quantidadeDeVidaQueRecupera = 2;
    }

    @Override
    public void usarItemDeUso(Corredor corredor) {
        corredor.aumentarVida(quantidadeDeVidaQueRecupera);
    }
}
