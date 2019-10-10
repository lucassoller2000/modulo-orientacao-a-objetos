package armasEDefesas;

public class Ariete extends Arma {
    protected boolean temPontaDeFerro;
    protected int cont;

    public Ariete(String nomeDaArma, boolean temPontaDeFerro) {
        super(nomeDaArma);
        this.tipoDeAtaque = "terrestre";
        this.temPontaDeFerro = temPontaDeFerro;
        this.poderDeAtaque = 500;
    }

    @Override
    public int getPoderDeAtaque(){
        cont++;
        if(this.temPontaDeFerro && cont==1){
            this.poderDeAtaque *= 2;
        }
        return poderDeAtaque;
    }
}
