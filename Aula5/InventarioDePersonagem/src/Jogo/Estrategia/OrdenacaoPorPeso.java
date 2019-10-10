package Jogo.Estrategia;

import Jogo.Item;

public class OrdenacaoPorPeso extends EstrategiaDeOrdenacao{

    @Override
    protected boolean itemAMaiorQueItemB(Item itemA, Item itemB){
        return itemA.getPeso() > itemB.getPeso();
    }
}
