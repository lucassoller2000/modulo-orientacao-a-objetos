package podium;

import corredores.Corredor;
import java.util.HashMap;
import java.util.Map;

public class Podium {
    private Map<LugarNoPodium, Corredor> listaDeCorredores;

    public Podium() {
        this.listaDeCorredores = new HashMap<>();
    }

    public void receberCorredor(Corredor corredor){
        if(!listaDeCorredores.containsValue(corredor)){
            if(!listaDeCorredores.containsKey(LugarNoPodium.PRIMEIRO_LUGAR)){
                listaDeCorredores.put(LugarNoPodium.PRIMEIRO_LUGAR, corredor);
            }else if(!listaDeCorredores.containsKey(LugarNoPodium.SEGUNDO_LUGAR)){
                listaDeCorredores.put(LugarNoPodium.SEGUNDO_LUGAR, corredor);
            }else if(!listaDeCorredores.containsKey(LugarNoPodium.TERCEIRO_LUGAR)){
                listaDeCorredores.put(LugarNoPodium.TERCEIRO_LUGAR, corredor);
            }
        }
    }

    public Map<LugarNoPodium, Corredor> getListaDeCorredores() {
        return listaDeCorredores;
    }
}
