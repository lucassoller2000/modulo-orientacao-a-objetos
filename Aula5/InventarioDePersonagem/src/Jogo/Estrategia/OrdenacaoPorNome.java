package Jogo.Estrategia;

import Jogo.Item;


public class OrdenacaoPorNome extends EstrategiaDeOrdenacao{
    @Override
    protected boolean itemAMaiorQueItemB(Item itemA, Item itemB){
        return itemA.getNome().compareToIgnoreCase(itemB.getNome());
    }
}
