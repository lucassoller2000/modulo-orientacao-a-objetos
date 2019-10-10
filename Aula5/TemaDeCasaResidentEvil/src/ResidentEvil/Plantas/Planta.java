package ResidentEvil.Plantas;

import ResidentEvil.Item;

public class Planta extends Item {
    private String cor;

    public Planta(String nome, String cor) {
        super(nome, 2, 1, 2);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void combinarPlantas(Item planta1, Item planta2){
        Item vida = new Item("Vida",1,1,1);
        if(planta1.equals(planta2)&&planta1.equals("verde")){
            vida.setNome("Vida verde simples");
        }else if(planta1.equals(planta2)&&planta1.equals("vermelho")){
            vida.setNome("Vida vermelho simples");
        }else if(!planta1.equals(planta2)){
            vida.setNome("Vida verde avançada");
        }
            planta1.getInventario().removerItem(planta1);
            planta2.getInventario().removerItem(planta2);
            vida.getInventario().adicionarItem(vida);
    }
}
