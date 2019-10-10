package armasEDefesas;

public class Muro {
    protected int pontosDeDefesaDoMuro;

    public Muro() {
        this.pontosDeDefesaDoMuro = 10000;
    }

    public int getPontosDeDefesaDoMuro() {
        if(this.pontosDeDefesaDoMuro<0){
            this.pontosDeDefesaDoMuro = 0;
        }
        return pontosDeDefesaDoMuro;
    }

    public int receberAtaque(Arma arma){
        this.pontosDeDefesaDoMuro -= arma.getPoderDeAtaque();
        return pontosDeDefesaDoMuro;
    }
}
