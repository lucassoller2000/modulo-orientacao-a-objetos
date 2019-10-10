package pistas;

import corredores.Corredor;
import java.util.LinkedList;
import java.util.List;

public class CasaDaPista {
    private List<Corredor> listaDeCorredores = new LinkedList<>();

    public void armazenarCorredoresNaCasa(Corredor corredor){
        listaDeCorredores.add(corredor);
    }

    public void removerCorredorDaCasa (Corredor corredor){
        listaDeCorredores.remove(corredor);
    }

    public List<Corredor> getListaDeCorredores() {
        return listaDeCorredores;
    }
}
