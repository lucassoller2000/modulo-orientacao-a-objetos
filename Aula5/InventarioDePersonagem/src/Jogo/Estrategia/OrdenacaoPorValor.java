package Jogo.Estrategia;

import Jogo.Item;


public class OrdenacaoPorValor extends EstrategiaDeOrdenacao{
    @Override
    protected boolean itemAMaiorQueItemB(Item itemA, Item itemB){
        return itemA.getValor() > itemB.getValor();
    }
}
