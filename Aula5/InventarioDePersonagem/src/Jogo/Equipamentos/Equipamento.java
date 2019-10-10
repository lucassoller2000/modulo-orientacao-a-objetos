package Jogo.Equipamentos;

import Jogo.Item;

public class Equipamento extends Item {
    private int durabilidade;

    public Equipamento(String nome, double valor, double peso, int durabilidade) {
        super(nome, valor, peso);
        this.durabilidade = durabilidade;
    }

    public void usar(){
        int durabilidadeUsada = getUsoDeDurabilidadePorUtilizacao();

        this.durabilidade -= durabilidadeUsada;

        if(this.durabilidade <= 0){
            this.getInventarioDeItensAQuePertence().removerItem(this);
        }
    }

    protected int getUsoDeDurabilidadePorUtilizacao(){
        return 0;
    }
}