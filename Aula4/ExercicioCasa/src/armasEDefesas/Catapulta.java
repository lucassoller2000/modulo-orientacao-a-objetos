package armasEDefesas;

public class Catapulta extends Arma {
    protected double alturaDoAtaque;
    protected int cont;


    public Catapulta(String nomeDaArma, double alturaDoAtaque) {
        super(nomeDaArma);
        this.tipoDeAtaque= "aereo";
        this.alturaDoAtaque = alturaDoAtaque;
        this.poderDeAtaque = 3500;
    }

    @Override
    public int getPoderDeAtaque() {
        cont++;
        if(cont==1) {
            poderDeAtaque += alturaDoAtaque * 2;
        } return poderDeAtaque;
    }
}
