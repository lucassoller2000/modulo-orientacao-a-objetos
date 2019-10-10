public class Machado {
    private int poderMachado;

    public Machado (int poderMachado){
        this.poderMachado = poderMachado;
    }

    public Machado (){
        this.poderMachado = 0;
    }

    public int getPoderMachado() {
        return poderMachado;
    }

    public void setPoderMachado(int poderMachado) {
        this.poderMachado = poderMachado;
    }

    public void receberMelhoria(int melhoria){
        this.poderMachado += melhoria;

        if(this.poderMachado> 20){
            this.poderMachado = 20;
        }
    }
}
