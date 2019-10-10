package ResidentEvil.Municoes;

import ResidentEvil.Item;

public class Municao extends Item {
    private int quantidadeDeMunicao;

    public Municao(String nome, int numeroDeLinhasQueOcupa, int numeroDeColunasQueOcupa, double peso, int quantidadeDeMunicao) {
        super(nome, numeroDeLinhasQueOcupa, numeroDeColunasQueOcupa, peso);
        this.quantidadeDeMunicao = quantidadeDeMunicao;
    }

    public int getQuantidadeDeMunicao() {
        return quantidadeDeMunicao;
    }

    public void setQuantidadeDeMunicao(int quantidadeDeMunicao) {
        this.quantidadeDeMunicao = quantidadeDeMunicao;
    }
}
