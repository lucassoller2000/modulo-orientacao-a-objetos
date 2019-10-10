public class AnaoGuerreiro {
    private int vida;
    private int bonusDeAtaque;
    private Machado machadoEquipado;

    public AnaoGuerreiro() {
        this.vida = 20;
        this.bonusDeAtaque = 7;
    }
    public void equiparMachado(Machado machado){
        if(this.podeEquiparMachado(machado)) {
            this.machadoEquipado = machado;
        }
    }

    public void desequiparMachado(){
        this.machadoEquipado = null;
    }

    public int getPoderAtaque(){
        // variavel = expressao booleana ? se for true : se for false
        int poderDeAtaqueDoMachado =
                // se tem machado equipado?
                this.machadoEquipado != null ?
                    // então pega o poder de ataque do machado
                    this.bonusDeAtaque+this.machadoEquipado.getPoderDoMachado()
                    :
                     //se não tem:
                    0;
        return this.bonusDeAtaque;
    }

    public Machado getMachadoEquipado(){

        return machadoEquipado;
    }

    private boolean podeEquiparMachado(Machado machado){
        if(machado == null){
            return false;
        }

        return machado.getPoderDoMachado() >= 10;
    }
}
