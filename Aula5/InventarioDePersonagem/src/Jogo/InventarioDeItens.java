package Jogo;

import Jogo.Equipamentos.Equipamento;
import Jogo.Estrategia.EstrategiaDeOrdenacao;

import java.util.LinkedList;
import java.util.List;

public class InventarioDeItens {
    private List<Item> listaDeItens;

    public InventarioDeItens() {
        this.listaDeItens = new LinkedList<>();
    }

    public  void adicionarItem(Item item){
        this.listaDeItens.add(item);
        item.vincularAInventario(this);
    }

    public  void removerItem(Item item){
        this.listaDeItens.remove(item);
    }

    public List<Item> getListaDeItens() {
        return listaDeItens;
    }

    public List<Equipamento> getEquipamentos(){
        List<Equipamento> listaFiltrada = new LinkedList<>();
        for (Item itemNaLista : this.listaDeItens){
            if (itemNaLista instanceof Equipamento){
                listaFiltrada.add((Equipamento) itemNaLista);
            }
        }

        for(int i=0; i<5; i++){

        }
        return listaFiltrada;
    }

    public void ordenar(EstrategiaDeOrdenacao estrategiaDeOrdenacao){
        this.listaDeItens = estrategiaDeOrdenacao.ordenar(this.listaDeItens);
    }




}
