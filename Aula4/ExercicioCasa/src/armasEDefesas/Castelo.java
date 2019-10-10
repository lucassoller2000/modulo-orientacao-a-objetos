package armasEDefesas;

public class Castelo {
    protected String nomeDoCastelo;
    protected int pontosDeDefesaDoCastelo;
    protected Muro muro;

    public Castelo(String nomeDoCastelo, int pontosDeDefesaDoCastelo, Muro muro) {
        this.nomeDoCastelo = nomeDoCastelo;
        this.pontosDeDefesaDoCastelo = pontosDeDefesaDoCastelo;
        this.muro = muro;
    }

    public void receberAtaque(Arma arma){
        if(!saberSeFoiDestruido()){
            if(arma.tipoDeAtaque.equals("aereo")){
                this.pontosDeDefesaDoCastelo -= arma.getPoderDeAtaque();
            }else{
                if (this.muro.pontosDeDefesaDoMuro>0){
                    this.muro.receberAtaque(arma);
                }else{
                    this.pontosDeDefesaDoCastelo -= arma.getPoderDeAtaque();
                }
            }
        }

    }
    public boolean saberSeFoiDestruido(){
        if (this.pontosDeDefesaDoCastelo<=0){
            return true;
        }else{
            return false;
        }
    }

    public int getPontosDeDefesaDoCastelo() {
        if(this.pontosDeDefesaDoCastelo<0){
            this.pontosDeDefesaDoCastelo = 0;
        }
        return pontosDeDefesaDoCastelo;
    }
}
